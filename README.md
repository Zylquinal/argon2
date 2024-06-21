# Argon2

[![Release](https://jitpack.io/v/com.zylquinal/argon2.svg)](https://jitpack.io/#com.zylquinal/argon2)

An [argon2](https://github.com/P-H-C/phc-winner-argon2) binding using Java Foreign Function & Memory API. Inspired from
[argon2-jvm](https://github.com/phxql/argon2-jvm) binding using JNA.

# How to use

```java

import com.zylquinal.argon2.api.*;

public class Example {

    public static void main(String[] args) {
        ArgonConfig config = ArgonConfig.of(65536, 1, 2);
        Argon argon = Argon.of(config);
        byte[] rawHash = argon.rawHash("password".getBytes(), "randomsalt".getBytes());
    }
    
}
```

# Gradle
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.zylquinal:argon2:VERSION'
}
```

# Prebuilt binaries

The binaries provided by `setup.sh` were built from this automated [release](https://github.com/Zylquinal/phc-winner-argon2/releases/tag/latest)

# NativeUtils

I use [NativeUtils](https://github.com/adamheinrich/native-utils) to load the native library from the jar file, the class
is included in the `com.zylquinal.argon2.internal` package. The library loads the native library from the `resources` folder
, copies it to the system temp directory, then loads it from there.

# License

```text
MIT License

Copyright (c) 2023 Zylquinal

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
