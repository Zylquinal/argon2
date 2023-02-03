package com.zylquinal.argon2;

import com.zylquinal.argon2.enumeration.ArgonVariant;
import com.zylquinal.argon2.enumeration.ArgonVersion;

import java.util.Arrays;

public interface Argon2 {

    /**
     * Hash the password with the given salt
     *
     * @param password the password
     * @param salt the salt
     * @return the encoded hash
     */
    default String hashEncoded(byte[] password, byte[] salt) {
        return hashEncoded(password, salt, ArgonConstant.DEFAULT_HASH_LENGTH);
    }

    /**
     * Hash the password with the given salt and hash length
     *
     * @param password the password
     * @param salt the salt
     * @param hashLength the length of the hash in byte
     * @return the encoded hash
     */
    default String hashEncoded(byte[] password, byte[] salt, int hashLength) {
        return hash(password, salt, hashLength).encoded();
    }

    /**
     * Hash the password with the salt
     *
     * @param password the password
     * @param salt the salt
     * @return the raw hash
     */
    default byte[] hashRaw(byte[] password, byte[] salt) {
        return hashRaw(password, salt, ArgonConstant.DEFAULT_HASH_LENGTH);
    }

    /**
     * Hash the password with the given salt, hash length, and version
     *
     * @param password the password
     * @param salt the salt
     * @param hashLength the length of the hash in byte
     * @return the raw hash
     */
    default byte[] hashRaw(byte[] password, byte[] salt, int hashLength) {
        return hashRaw(password, salt, hashLength, version());
    }

    /**
     * Hash the password with the given salt, hash length, and version
     *
     * @param password the password
     * @param salt the salt
     * @param hashLength the length of the hash in byte
     * @param version the version of argon2
     * @return {@link HashResult} containing the raw hash, salt, and encoded hash
     */
    default HashResult hash(byte[] password, byte[] salt, int hashLength, ArgonVersion version) {
        byte[] raw = hashRaw(password, salt, hashLength, version);
        return HashResult.of(raw, salt, encodeHash(raw, salt, version()));
    }

    /**
     * Hash the password with the given salt, and hash length
     *
     * @param password the password
     * @param salt the salt
     * @param hashLength the length of the hash in byte
     * @return {@link HashResult} containing the raw hash, salt, and encoded hash
     */
    default HashResult hash(byte[] password, byte[] salt, int hashLength) {
        return hash(password, salt, hashLength, version());
    }

    /**
     * Hash the password with the given salt
     *
     * @param password the password
     * @param salt the salt
     * @return {@link HashResult} containing the raw hash, salt, and encoded hash
     */
    default HashResult hash(byte[] password, byte[] salt) {
        return hash(password, salt, ArgonConstant.DEFAULT_HASH_LENGTH);
    }

    /**
     * Hash the password with the given salt, hash length, and version
     *
     * @param data the password
     * @param salt the salt
     * @param hashLength the length of the hash in bytes
     * @param version the version of argon2
     * @return {@link HashResult} containing the raw hash, salt, and encoded hash
     */
    byte[] hashRaw(byte[] data, byte[] salt, int hashLength, ArgonVersion version);

    /**
     * Verify the encoded hash against the password
     *
     * @param encoded the encoded hash
     * @param data the password
     * @return true if the password matches the hash
     * @throws IllegalArgumentException if the encoded hash is invalid
     */
    boolean verify(String encoded, byte[] data);

    /**
     * Verify the raw hash against the password
     *
     * @param hash the raw hash
     * @param salt the salt used to hash the password
     * @param password the password
     * @return true if the password matches the hash
     */
    default boolean verify(byte[] hash, byte[] salt, byte[] password) {
        return Arrays.equals(hash, hashRaw(password, salt));
    }

    /**
     * Encode the raw hash
     *
     * @param hash the raw hash
     * @param salt the salt used to hash the password
     * @param version the version of argon2
     * @return the encoded hash
     */
    String encodeHash(byte[] hash, byte[] salt, ArgonVersion version);

    /**
     * Create an Argon2 instance with the given parameters
     *
     * @param variant the variant of argon2
     * @param version the version of argon2
     * @param iterations the number of iterations
     * @param memory the memory in KiB
     * @param parallelism the number of threads
     * @param hashLength the length of the hash in bytes
     * @return an {@link Argon2} instance
     */
    static Argon2 create(ArgonVariant variant, ArgonVersion version, int iterations, int memory, int parallelism,
                         int hashLength) {
        return new Argon2Impl(variant, version, iterations, memory, parallelism, hashLength);
    }

    /**
     * Create an Argon2 instance with the given parameters
     *
     * @param variant the variant of argon2
     * @param version the version of argon2
     * @param iterations the number of iterations
     * @param memory the memory in KiB
     * @param parallelism the number of threads
     * @return an {@link Argon2} instance
     */
    static Argon2 create(ArgonVariant variant, ArgonVersion version, int iterations, int memory, int parallelism) {
        return create(variant, version, iterations, memory, parallelism, ArgonConstant.DEFAULT_HASH_LENGTH);
    }

    /**
     * Create an Argon2 instance with the given parameters
     *
     * @param variant the variant of argon2
     * @param iterations the number of iterations
     * @param memory the memory in KiB
     * @param parallelism the number of threads
     * @return an {@link Argon2} instance
     */
    static Argon2 create(ArgonVariant variant, int iterations, int memory, int parallelism) {
        return create(variant, ArgonVersion.DEFAULT, iterations, memory, parallelism);
    }

    /**
     * Create an Argon2 instance with the given parameters
     *
     * @param iterations the number of iterations
     * @param memory the memory in KiB
     * @param parallelism the number of threads
     * @return an {@link Argon2} instance
     */
    static Argon2 create(int iterations, int memory, int parallelism) {
        return create(ArgonVariant.DEFAULT, ArgonVersion.DEFAULT, iterations, memory, parallelism);
    }

    ArgonVersion version();

    int iterations();

    int memory();

    int parallelism();

    int hashLength();

}
