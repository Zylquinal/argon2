package com.zylquinal.argon2;

import com.zylquinal.argon2.enumeration.ArgonFlag;
import com.zylquinal.argon2.enumeration.ArgonStatus;
import com.zylquinal.argon2.enumeration.ArgonVariant;
import com.zylquinal.argon2.enumeration.ArgonVersion;
import com.zylquinal.argon2.exception.ArgonException;
import com.zylquinal.argon2.internal.Argon2_Context;
import com.zylquinal.argon2.internal.argon2_h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;
import java.util.Base64;

import static com.zylquinal.argon2.internal.argon2_h.argon2_ctx;
import static com.zylquinal.argon2.internal.argon2_h.argon2_hash;

public record Argon2(ArgonVariant variant, ArgonVersion version, int iterations, int memory, int parallelism, int hashLength) {

    private static final Base64.Encoder encoder = Base64.getEncoder().withoutPadding();

    /**
     * Hash the password with the given salt
     *
     * @param password the password
     * @param salt     the salt
     * @return the encoded hash
     */
    public String hashEncoded(byte[] password, byte[] salt) {
        return hashEncoded(password, salt, ArgonConstant.DEFAULT_HASH_LENGTH);
    }

    /**
     * Hash the password with the given salt and hash length
     *
     * @param password   the password
     * @param salt       the salt
     * @param hashLength the length of the hash in byte
     * @return the encoded hash
     */
    public String hashEncoded(byte[] password, byte[] salt, int hashLength) {
        return hash(password, salt, hashLength).encoded();
    }

    /**
     * Hash the password with the given salt, secret and associated data
     *
     * @param password the password
     * @param salt the salt
     * @param secret the secret
     * @param associatedData the associated data
     * @return the encoded hash
     */
    public String hashEncoded(byte[] password, byte[] salt, byte[] secret, byte[] associatedData) {
        return hashEncoded(password, salt, secret, associatedData, ArgonFlag.DEFAULT);
    }

    /**
     * Hash the password with the given salt, secret and associated data
     *
     * @param password the password
     * @param salt the salt
     * @param secret the secret
     * @param associatedData the associated data
     * @param flag the flag
     * @return the encoded hash
     */
    public String hashEncoded(byte[] password, byte[] salt, byte[] secret, byte[] associatedData, ArgonFlag flag) {
        return hashEncoded(password, salt, ArgonConstant.DEFAULT_HASH_LENGTH, secret, associatedData, flag);
    }

    /**
     * Hash the password with the given salt, secret and associated data
     *
     * @param password the password
     * @param salt the salt
     * @param hashLength the length of the hash in bytes
     * @param secret the secret
     * @param associatedData the associated data
     * @param flag the flag
     * @return the encoded hash
     */
    public String hashEncoded(byte[] password, byte[] salt, int hashLength, byte[] secret, byte[] associatedData, ArgonFlag flag) {
        return hash(password, salt, hashLength, secret, associatedData, flag).encoded();
    }

    /**
     * Hash the password with the salt
     *
     * @param password the password
     * @param salt     the salt
     * @return the raw hash
     */
    public byte[] hashRaw(byte[] password, byte[] salt) {
        return hashRaw(password, salt, ArgonConstant.DEFAULT_HASH_LENGTH);
    }

    /**
     * Hash the password with the given salt, hash length, and version
     *
     * @param password   the password
     * @param salt       the salt
     * @param hashLength the length of the hash in byte
     * @return the raw hash
     */
    public byte[] hashRaw(byte[] password, byte[] salt, int hashLength) {
        return Argon2.hashRaw(iterations, memory, parallelism, password, salt, hashLength, version, variant);
    }

    /**
     * Hash the password with the given salt, secret, and associated data
     *
     * @param password the password
     * @param salt the salt
     * @param hashLength the length of the hash in bytes
     * @param secret the secret
     * @param associatedData the associated data
     * @param flag the flag
     * @return the raw hash
     */
    public byte[] hashRaw(byte @NotNull [] password, byte @NotNull [] salt, int hashLength, byte @Nullable [] secret,
                          byte @Nullable [] associatedData, ArgonFlag flag) {
        return Argon2.hashRaw(iterations, memory, parallelism, password, salt, hashLength, secret, associatedData,
                version, flag, variant);
    }

    /**
     * Hash the password with the given salt, secret, and associated data
     *
     * @param iterations the number of iterations
     * @param memory the memory cost
     * @param parallelism the parallelism
     * @param password the password
     * @param salt the salt
     * @param hashLength the length of the hash in bytes
     * @param secret the secret
     * @param associatedData the associated data
     * @param version the version
     * @param flag the flag
     * @param variant the variant
     * @return the raw hash
     */
    public static byte[] hashRaw(int iterations, int memory, int parallelism, byte @NotNull [] password, byte @NotNull [] salt, int hashLength,
                                 byte @Nullable [] secret, byte @Nullable [] associatedData, ArgonVersion version, ArgonFlag flag, ArgonVariant variant) {
        return hashRaw(ArgonContext.builder()
                .iterations(iterations)
                .memoryCost(memory)
                .parallelism(parallelism)
                .password(password)
                .salt(salt)
                .hashLength(hashLength)
                .secret(secret)
                .associatedData(associatedData)
                .version(version)
                .flag(flag), variant);
    }

    /**
     * Hash the password
     *
     * @param contextBuilder the context builder
     * @param variant the variant
     * @return the raw hash
     */
    public static byte[] hashRaw(ArgonContext.ArgonContextBuilder contextBuilder, ArgonVariant variant) {
        try (MemorySession session = MemorySession.openConfined()) {
            MemorySegment segment = contextBuilder.create(session);
            var result = argon2_ctx(segment, variant.variant());
            if (result != argon2_h.ARGON2_OK()) throw new ArgonException(ArgonStatus.of(result));
            return MemorySegment.ofAddress(Argon2_Context.out$get(segment), Argon2_Context.outlen$get(segment), session).toArray(ValueLayout.OfByte.JAVA_BYTE);
        }
    }

    /**
     * Hash the password with the given salt, secret, and associated data
     *
     * @param iterations the number of iterations
     * @param memory the memory cost
     * @param parallelism the parallelism
     * @param password the password
     * @param salt the salt
     * @param hashLength the length of the hash in bytes
     * @param version the version
     * @param variant the variant
     * @return the raw hash
     */
    public static byte[] hashRaw(int iterations, int memory, int parallelism, byte[] password, byte[] salt, int hashLength, ArgonVersion version, ArgonVariant variant) {
        try (MemorySession session = MemorySession.openConfined()) {
            MemorySegment passwordAddress = MemorySegment.allocateNative(password.length, session);
            for (int i = 0; i < password.length; i++) {
                passwordAddress.set(ValueLayout.OfByte.JAVA_BYTE, i, password[i]);
            }
            MemorySegment saltAddress = MemorySegment.allocateNative(salt.length, session);
            for (int i = 0; i < salt.length; i++) {
                saltAddress.set(ValueLayout.OfByte.JAVA_BYTE, i, salt[i]);
            }
            MemorySegment hashAddress = MemorySegment.allocateNative(hashLength, session);
            var result = argon2_hash(iterations, memory, parallelism, passwordAddress, password.length, saltAddress, salt.length, hashAddress,
                    hashLength, MemoryAddress.NULL, 0, variant.variant(), version.version());
            if (result != argon2_h.ARGON2_OK()) throw new ArgonException(ArgonStatus.of(result));
            return hashAddress.toArray(ValueLayout.OfByte.JAVA_BYTE);
        }
    }

    /**
     * Hash the password with the given salt, and hash length
     *
     * @param password   the password
     * @param salt       the salt
     * @param hashLength the length of the hash in byte
     * @return {@link HashResult} containing the raw hash, salt, and encoded hash
     */
    public HashResult hash(byte[] password, byte[] salt, int hashLength) {
        byte[] raw = hashRaw(password, salt, hashLength);
        return HashResult.of(raw, salt, encodeHash(raw, salt));
    }

    /**
     * Hash the password with the given salt
     *
     * @param password the password
     * @param salt     the salt
     * @return {@link HashResult} containing the raw hash, salt, and encoded hash
     */
    public HashResult hash(byte[] password, byte[] salt) {
        return hash(password, salt, ArgonConstant.DEFAULT_HASH_LENGTH);
    }

    /**
     * Hash the password with the given salt, secret, and associated data
     *
     * @param password the password
     * @param salt the salt
     * @param hashLength the length of the hash in bytes
     * @param secret the secret
     * @param associatedData the associated data
     * @param flag the flag
     * @return {@link HashResult} containing the raw hash, salt, and encoded hash
     */
    public HashResult hash(byte @NotNull [] password, byte @NotNull [] salt, int hashLength,
                           byte @Nullable [] secret, byte @Nullable [] associatedData, ArgonFlag flag) {
        byte[] raw = hashRaw(password, salt, hashLength, secret, associatedData, flag);
        return HashResult.of(raw, salt, encodeHash(raw, salt));
    }

    /**
     * Verify the encoded hash against the password
     *
     * @param encoded  the encoded hash
     * @param password the password
     * @return true if the password matches the hash
     * @throws IllegalArgumentException if the encoded hash is invalid
     */
    public static boolean verifyEncoded(String encoded, byte[] password) {
        return verifyEncoded(encoded, password, null, null);
    }

    /**
     * Verify the encoded hash against the password, secret, and associated data
     *
     * @param encoded        the encoded hash
     * @param password       the password
     * @param secret         the secret
     * @param associatedData the associated data
     * @return true if the password matches the hash
     */
    public static boolean verifyEncoded(String encoded, byte[] password, byte[] secret, byte[] associatedData) {
        try {
            var parts = encoded.split("\\$");
            var variant = ArgonVariant.of(parts[1]);
            var version = ArgonVersion.of(Integer.parseInt(parts[2].substring(2)));
            var memory = Integer.parseInt(parts[3].substring(2, parts[3].indexOf(',')));
            var iterations = Integer.parseInt(parts[3].substring(parts[3].indexOf(',') + 3, parts[3].lastIndexOf(',')));
            var parallelism = Integer.parseInt(parts[3].substring(parts[3].lastIndexOf(',') + 3));
            var salt = Base64.getDecoder().decode(parts[4]);
            var hash = Base64.getDecoder().decode(parts[5]);
            return verify(hash, password, salt, iterations, memory, parallelism, secret, associatedData, version, ArgonFlag.DEFAULT, variant);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid encoded hash", e);
        }
    }

    /**
     * Verify the encoded hash against the password
     *
     * @param encoded  the encoded hash
     * @param password the password
     * @return true if the password matches the hash
     * @throws IllegalArgumentException if the encoded hash is invalid
     */
    public boolean verify(String encoded, byte[] password) {
        return Argon2.verifyEncoded(encoded, password);
    }

    /**
     * Verify the raw hash against the password
     *
     * @param hash     the raw hash
     * @param salt     the salt used to hash the password
     * @param password the password
     * @return true if the password matches the hash
     */
    public boolean verify(byte[] hash, byte[] salt, byte[] password) {
        return Arrays.equals(hash, hashRaw(password, salt));
    }

    /**
     * Verify the encoded hash against the password, secret, and associated data
     *
     * @param encoded the encoded hash
     * @param password the password
     * @param secret the secret
     * @param associatedData the associated data
     * @return true if the password matches the hash
     */
    public boolean verify(String encoded, byte[] password, byte[] secret, byte[] associatedData) {
        return Argon2.verifyEncoded(encoded, password, secret, associatedData);
    }

    /**
     * Verify the hash against the password
     *
     * @param hash           the hash
     * @param password       the password
     * @param salt           the salt
     * @param secret         the secret
     * @param associatedData the associated data
     * @param flag           the flag
     * @return true if the password matches the hash
     */
    public boolean verify(byte[] hash, byte[] password, byte[] salt, byte @Nullable [] secret, byte @Nullable [] associatedData, ArgonFlag flag) {
        return verify(hash, password, salt, iterations, memory, parallelism, secret, associatedData, version, flag, variant);
    }

    /**
     * Verify the hash against the password
     *
     * @param hash           the hash
     * @param password       the password
     * @param salt           the salt
     * @param iterations     the number of iterations
     * @param memory         the memory cost
     * @param parallelism    the parallelism
     * @param secret         the secret
     * @param associatedData the associated data
     * @param version        the version
     * @param flag           the flag
     * @param variant        the variant
     * @return true if the password matches the hash
     */
    public static boolean verify(byte[] hash, byte[] password, byte[] salt, int iterations, int memory, int parallelism,
                                 byte @Nullable [] secret, byte @Nullable [] associatedData, ArgonVersion version, ArgonFlag flag, ArgonVariant variant) {
        return Arrays.equals(hash, hashRaw(iterations, memory, parallelism, password, salt, hash.length, secret, associatedData, version, flag, variant));
    }

    /**
     * Encode the raw hash
     *
     * @param hash    the raw hash
     * @param salt    the salt used to hash the password
     * @return the encoded hash
     */
    public String encodeHash(byte[] hash, byte[] salt) {
        return encodeHash(hash, salt, version, variant);
    }

    /**
     * Encode the raw hash
     *
     * @param hash the raw hash
     * @param salt the salt used to hash the password
     * @param version the version of argon2
     * @param variant the variant of argon2
     * @return the encoded hash
     */
    public static String encodeHash(byte[] hash, byte[] salt, ArgonVersion version, ArgonVariant variant) {
        return '$' + variant.variantName() + '$' + "v=" + version.version() + "$m=" + 65536 + ",t=" + 2 + ",p="
                + 1 + '$' + encoder.encodeToString(salt) + '$' + encoder.encodeToString(hash);
    }

    /**
     * Create an Argon2 instance with the given parameters
     *
     * @param variant     the variant of argon2
     * @param version     the version of argon2
     * @param iterations  the number of iterations
     * @param memory      the memory in KiB
     * @param parallelism the number of threads
     * @param hashLength  the length of the hash in bytes
     * @return an {@link Argon2} instance
     */
    public static Argon2 create(ArgonVariant variant, ArgonVersion version, int iterations, int memory, int parallelism,
                         int hashLength) {
        return new Argon2(variant, version, iterations, memory, parallelism, hashLength);
    }

    /**
     * Create an Argon2 instance with the given parameters
     *
     * @param variant     the variant of argon2
     * @param version     the version of argon2
     * @param iterations  the number of iterations
     * @param memory      the memory in KiB
     * @param parallelism the number of threads
     * @return an {@link Argon2} instance
     */
    public static Argon2 create(ArgonVariant variant, ArgonVersion version, int iterations, int memory, int parallelism) {
        return create(variant, version, iterations, memory, parallelism, ArgonConstant.DEFAULT_HASH_LENGTH);
    }

    /**
     * Create an Argon2 instance with the given parameters
     *
     * @param variant     the variant of argon2
     * @param iterations  the number of iterations
     * @param memory      the memory in KiB
     * @param parallelism the number of threads
     * @return an {@link Argon2} instance
     */
    public static Argon2 create(ArgonVariant variant, int iterations, int memory, int parallelism) {
        return create(variant, ArgonVersion.DEFAULT, iterations, memory, parallelism);
    }

    /**
     * Create an Argon2 instance with the given parameters
     *
     * @param iterations  the number of iterations
     * @param memory      the memory in KiB
     * @param parallelism the number of threads
     * @return an {@link Argon2} instance
     */
    public static Argon2 create(int iterations, int memory, int parallelism) {
        return create(ArgonVariant.DEFAULT, ArgonVersion.DEFAULT, iterations, memory, parallelism);
    }

}
