/*
 * Class NativeUtils is published under the The MIT License:
 *
 * Copyright (c) 2012 Adam Heinrich <adam@adamh.cz>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.zylquinal.argon2.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.foreign.SymbolLookup;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple library class which helps with loading dynamic libraries stored in the
 * JAR archive. These libraries usually contain implementation of some methods in
 * native code (using JNI - Java Native Interface).
 *
 * @see <a href="http://adamheinrich.com/blog/2012/how-to-load-native-jni-library-from-jar">http://adamheinrich.com/blog/2012/how-to-load-native-jni-library-from-jar</a>
 * @see <a href="https://github.com/adamheinrich/native-utils">https://github.com/adamheinrich/native-utils</a>
 */
public class NativeUtils {

    public static final String NATIVE_FOLDER_PATH_PREFIX = "nativeutils";
    public static final boolean IS_JAR = new File(NativeUtils.class.getProtectionDomain().getCodeSource().getLocation().getPath())
            .toString().contains(".jar!");
    /**
     * The minimum length a prefix for a file has to have according to {@link File#createTempFile(String, String)}}.
     */
    private static final int MIN_PREFIX_LENGTH = 3;
    /**
     * Temporary directory which will contain the DLLs.
     */
    private static File temporaryDir;

    /**
     * Private constructor - this class will never be instanced
     */
    private NativeUtils() {
    }

    /**
     * Loads library from current JAR archive
     * <p>
     * The file from JAR is copied into system temporary directory and then loaded. The temporary file is deleted after
     * exiting.
     * Method uses String as filename because the pathname is "abstract", not system-dependent.
     *
     * @throws IOException              If temporary file creation or read/write operation fails
     * @throws IllegalArgumentException If source file (param path) does not exist
     * @throws IllegalArgumentException If the path is not absolute or if the filename is shorter than three characters
     *                                  (restriction of {@link File#createTempFile(java.lang.String, java.lang.String)}).
     * @throws FileNotFoundException    If the file could not be found inside the JAR.
     */
    public static void loadLibraryFromJar() throws IOException {
        // Obtain filename from path
        String path = lib();
        String[] parts = path.split("/");
        String filename = (parts.length > 1) ? parts[parts.length - 1] : null;

        // Check if the filename is okay
        if (filename == null || filename.length() < MIN_PREFIX_LENGTH) {
            throw new IllegalArgumentException("The filename has to be at least 3 characters long.");
        }

        // Prepare temporary file
        if (temporaryDir == null) {
            temporaryDir = createTempDirectory();
            temporaryDir.deleteOnExit();
        }

        File temp = new File(temporaryDir, filename);

        try {
            byte[] data = readFromResources(Paths.get(path));
            if (data == null) {
                throw new IllegalStateException("Could not read data from " + path);
            }
            Files.write(temp.toPath(), data);
        } catch (IOException e) {
            temp.delete();
            throw e;
        } catch (NullPointerException e) {
            temp.delete();
            throw new FileNotFoundException("File " + path + " was not found inside JAR.");
        }

        try {
            System.load(temp.getAbsolutePath());
        } finally {
            if (isPosixCompliant()) {
                // Assume POSIX compliant file system, can be deleted after loading
                temp.delete();
            } else {
                // Assume non-POSIX, and don't delete until last file descriptor closed
                temp.deleteOnExit();
            }
        }
    }

    public static String lib() {
        String osName = System.getProperty("os.name").toLowerCase();
        String osArch = System.getProperty("os.arch");
        String libName = "libargon2";
        if (osName.contains("win")) {
            osName = "windows";
            libName += ".dll";
        } else if (osName.contains("mac")) {
            osName = "darwin";
            libName += ".dylib";
        } else if (osName.contains("linux")) {
            osName = "linux";
            libName += ".so";
        }

        if (osArch.contains("amd64") || osArch.contains("x86_64")) {
            osArch = "x86-64";
        } else if (osArch.contains("i386") || osArch.contains("i86")) {
            osArch = "x86";
        }

        return "%s-%s/%s".formatted(osName, osArch, libName);
    }

    public static byte[] readFromResources(Path path) {
        var classLoader = NativeUtils.class.getClassLoader();
        if (IS_JAR) return readFromResourcesJar(path);
        try (var inputStream = classLoader.getResourceAsStream(path.toString())) {
            return inputStream != null ? inputStream.readAllBytes() : new byte[0];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] readFromResourcesJar(Path path) {
        Map<String, String> env = new HashMap<>();
        URL url = NativeUtils.class.getResource("");
        if (url == null) throw new RuntimeException("Resource not found!");
        try (FileSystem zipfs = FileSystems.newFileSystem(url.toURI(), env)) {
            var zPath = zipfs.getPath(path.toString());
            return Files.readAllBytes(zPath);
        } catch (IOException | URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static boolean isPosixCompliant() {
        try {
            return FileSystems.getDefault()
                    .supportedFileAttributeViews()
                    .contains("posix");
        } catch (FileSystemNotFoundException | ProviderNotFoundException | SecurityException e) {
            return false;
        }
    }

    private static File createTempDirectory() throws IOException {
        String tempDir = System.getProperty("java.io.tmpdir");
        File generatedDir = new File(tempDir, NativeUtils.NATIVE_FOLDER_PATH_PREFIX + System.nanoTime());

        if (!generatedDir.mkdir())
            throw new IOException("Failed to create temp directory " + generatedDir.getName());

        return generatedDir;
    }
}
