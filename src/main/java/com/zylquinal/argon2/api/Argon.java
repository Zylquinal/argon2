package com.zylquinal.argon2.api;

import com.zylquinal.argon2.api.exception.ArgonException;
import lombok.experimental.Delegate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Argon {

    @Delegate
    private final ArgonConfig config;

    private Argon(ArgonConfig config) {
        this.config = config;
    }

    /**
     * Hashes the given password using the given salt.
     *
     * @param password the password to hash
     * @param salt the salt to use
     * @return {@link ComputedHash}
     * @throws ArgonException if the hash could not be computed
     */
    public ComputedHash hash(byte @NotNull [] password, byte @NotNull [] salt) {
       return hash(password, salt, null);
    }

    /**
     * Hashes the given password using the given salt and secret.
     *
     * @param password the password to hash
     * @param salt the salt to use
     * @param secret the secret to use
     * @return {@link ComputedHash}
     * @throws ArgonException if the hash could not be computed
     */
    public ComputedHash hash(byte @NotNull [] password, byte @NotNull [] salt, byte @Nullable [] secret) {
        return hash(password, salt, secret, null);
    }

    /**
     * Hashes the given password using the given salt, secret, and associated data.
     *
     * @param password the password to hash
     * @param salt the salt to use
     * @param secret the secret to use
     * @param associatedData the associated data to use
     * @return {@link ComputedHash}
     * @throws ArgonException if the hash could not be computed
     */
    public ComputedHash hash(byte @NotNull [] password, byte @NotNull [] salt, byte @Nullable [] secret, byte @Nullable [] associatedData) {
        byte[] rawHash = ArgonDirect.rawHash(password, salt, secret, associatedData, hashLength(), memoryCost(), parallelism(),
                iterations(), version(), flag(), variant());
        return ComputedHash.of(rawHash, salt, config);
    }

    /**
     * Hashes the given password using the given salt.
     *
     * @param password the password to hash
     * @param salt the salt to use
     * @return the raw hash
     * @throws ArgonException if the hash could not be computed
     */
    public byte[] rawHash(byte @NotNull [] password, byte @NotNull [] salt) {
        return rawHash(password, salt, null, null);
    }

    /**
     * Hashes the given password using the given salt and secret.
     *
     * @param password the password to hash
     * @param salt the salt to use
     * @param secret the secret to use
     * @return the raw hash
     * @throws ArgonException if the hash could not be computed
     */
    public byte[] rawHash(byte[] password, byte[] salt, byte @Nullable [] secret) {
        return rawHash(password, salt, secret, null);
    }

    /**
     * Hashes the given password using the given salt and secret.
     *
     * @param password the password to hash
     * @param salt the salt to use
     * @param secret the secret to use
     * @param associatedData the associated data to use
     * @return the raw hash
     * @throws ArgonException if the hash could not be computed
     */
    public byte[] rawHash(byte @NotNull [] password, byte @NotNull [] salt, byte @Nullable [] secret, byte @Nullable [] associatedData) {
        return ArgonDirect.rawHash(password, salt, secret, associatedData, hashLength(), memoryCost(), parallelism(),
                iterations(), version(), flag(), variant());
    }

    /**
     * Verifies the given password against the given encoded hash.
     *
     * @param encodedHash the encoded hash to verify against
     * @param password the password to verify
     * @return true if the password matches the encoded hash, false otherwise
     * @throws ArgonException if the hash could not be computed
     */
    public boolean verify(@NotNull String encodedHash, byte @NotNull [] password) {
        return verify(encodedHash, password, null, null);
    }

    /**
     * Verifies the given password against the given encoded hash.
     *
     * @param encodedHash the encoded hash to verify against
     * @param password the password to verify
     * @param secret the secret to use
     * @return true if the password matches the encoded hash, false otherwise
     * @throws ArgonException if the hash could not be computed
     */
    public boolean verify(@NotNull String encodedHash, byte @NotNull  [] password, byte @Nullable [] secret) {
        return verify(encodedHash, password, secret, null);
    }

    /**
     * Verifies the given password against the given encoded hash.
     *
     * @param encodedHash the encoded hash to verify against
     * @param password the password to verify
     * @param secret the secret to use
     * @param associatedData the associated data to use
     * @return true if the password matches the encoded hash, false otherwise
     * @throws ArgonException if the hash could not be computed
     */
    public boolean verify(@NotNull String encodedHash, byte @NotNull  [] password, byte @Nullable [] secret, byte @Nullable [] associatedData) {
        return ArgonDirect.verify(encodedHash, password, secret, associatedData, flag());
    }

    /**
     * Verifies the given password against the given hash and salt.
     *
     * @param hash the hash to verify against
     * @param salt the salt to use
     * @param password the password to verify
     * @return true if the password matches the hash and salt, false otherwise
     * @throws ArgonException if the hash could not be computed
     */
    public boolean verify(byte @NotNull [] hash, byte @NotNull [] salt, byte @NotNull [] password) {
        return verify(hash, password, salt, null, null);
    }

    /**
     * Verifies the given password against the given hash, salt, and secret.
     *
     * @param hash the hash to verify against
     * @param password the password to verify
     * @return true if the password matches the hash, salt, and secret, false otherwise
     */
    public boolean verify(@NotNull ComputedHash hash, byte @NotNull [] password) {
        return verify(hash.raw(), password, hash.salt(), null, null);
    }

    /**
     * Verifies the given password against the given hash, salt, and secret.
     *
     * @param hash the hash to verify against
     * @param password the password to verify
     * @param secret the secret to use
     * @return true if the password matches the hash, salt, and secret, false otherwise
     */
    public boolean verify(@NotNull ComputedHash hash, byte @NotNull [] password, byte @Nullable [] secret) {
        return verify(hash.raw(), password, hash.salt(), secret, null);
    }

    /**
     * Verifies the given password against the given hash, salt, secret, and associated data.
     * @param hash the hash to verify against
     * @param password the password to verify
     * @param secret the secret to use
     * @param associatedData the associated data to use
     * @return true if the password matches the hash, salt, and secret, false otherwise
     */
    public boolean verify(@NotNull ComputedHash hash, byte @NotNull [] password, byte @Nullable [] secret, byte @Nullable [] associatedData) {
        return verify(hash.raw(), password, hash.salt(), secret, associatedData);
    }

    /**
     * Verifies the given password against the given hash, salt, and secret.
     *
     * @param hash the hash to verify against
     * @param password the password to verify
     * @param salt the salt to use
     * @param secret the secret to use
     * @param associatedData the associated data to use
     * @return true if the password matches the hash, salt, and secret, false otherwise
     * @throws ArgonException if the hash could not be computed
     */
    public boolean verify(byte @NotNull [] hash, byte @NotNull [] password, byte @NotNull [] salt, byte @Nullable [] secret, byte @Nullable [] associatedData) {
        return ArgonDirect.verify(hash, password, salt, secret, associatedData, hashLength(), memoryCost(), parallelism(),
                iterations(), version(), flag(), variant());
    }

    /**
     * Returns a new Argon instance with the given configuration.
     *
     * @param config the configuration to use
     * @return a new {@link Argon} instance
     */
    public static Argon of(ArgonConfig config) {
        return new Argon(config);
    }

}
