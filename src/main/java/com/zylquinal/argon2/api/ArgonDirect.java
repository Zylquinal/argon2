package com.zylquinal.argon2.api;

import com.zylquinal.argon2.api.enumeration.ArgonFlag;
import com.zylquinal.argon2.api.enumeration.ArgonStatus;
import com.zylquinal.argon2.api.enumeration.ArgonVariant;
import com.zylquinal.argon2.api.enumeration.ArgonVersion;
import com.zylquinal.argon2.api.exception.ArgonException;
import com.zylquinal.argon2.internal.Argon2_Context;
import com.zylquinal.argon2.internal.argon2_h;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;
import java.util.Base64;

public class ArgonDirect {

    public static byte[] rawHash(byte @NotNull [] password, byte @NotNull [] salt, @NotNull ArgonConfig argonConfig) {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment hashPtr = arena.allocate(argonConfig.hashLength());
            MemorySegment passwordPtr = arena.allocate(password.length);
            for (int i = 0; i < password.length; i++) {
                passwordPtr.set(ValueLayout.JAVA_BYTE, i, password[i]);
            }

            MemorySegment saltPtr = arena.allocate(salt.length);
            for (int i = 0; i < salt.length; i++) {
                saltPtr.set(ValueLayout.JAVA_BYTE, i, salt[i]);
            }

            int result = argon2_h.argon2_hash(argonConfig.iterations(), argonConfig.memoryCost(), argonConfig.parallelism(), passwordPtr,
                    password.length, saltPtr, salt.length, hashPtr, argonConfig.hashLength(), MemorySegment.NULL, 0,
                    argonConfig.variant().variant(), argonConfig.version().version());
            if (result != ArgonStatus.ARGON2_OK.value())
                throw new ArgonException(ArgonStatus.of(result));
            return hashPtr.toArray(ValueLayout.OfByte.JAVA_BYTE);
        }
    }

    /**
     * Hashes the given password using the given salt, secret, and associated data.
     *
     * @param password the password to hash
     * @param salt the salt to use
     * @param secret the secret to use
     * @param associatedData the associated data to use
     * @param argonConfig the configuration to use
     * @return raw hash
     */
    public static byte[] rawHash(byte @NotNull [] password, byte @NotNull [] salt, byte[] secret, byte[] associatedData, @NotNull ArgonConfig argonConfig) {
        return rawHash(password, salt, secret, associatedData, argonConfig.hashLength(), argonConfig.memoryCost(), argonConfig.parallelism(),
                argonConfig.iterations(), argonConfig.version(), argonConfig.flag(), argonConfig.variant());
    }

    /**
     * Hashes the given password using the given salt, secret, and associated data.
     *
     * @param password the password to hash
     * @param salt the salt to use
     * @param secret the secret to use
     * @param associatedData the associated data to use
     * @param hashLength the length of the hash
     * @param memoryCost the memory cost
     * @param parallelism the parallelism
     * @param iterations the iterations
     * @param version the version to use
     * @param flag the flag to use
     * @param variant the variant to use
     * @return raw hash
     */
    public static byte[] rawHash(byte @NotNull [] password, byte @NotNull [] salt, byte[] secret, byte[] associatedData, int hashLength,
                          int memoryCost, int parallelism, int iterations, @NotNull ArgonVersion version, @NotNull ArgonFlag flag, @NotNull ArgonVariant variant) {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment struct = Argon2_Context.layout(password, salt, secret, associatedData, hashLength, memoryCost, parallelism, iterations, version, flag, arena);
            MemorySegment outAddress = Argon2_Context.out(struct);
            int result = argon2_h.argon2_ctx(struct, variant.variant());
            if (result != 0) throw new ArgonException(ArgonStatus.of(result));
            return outAddress.asSlice(0, hashLength).toArray(ValueLayout.OfByte.JAVA_BYTE);
        }
    }

    /**
     * Verifies the given hash against the given password, secret, and associated data.
     *
     * @param encodedHash the hash to verify
     * @param password the password to verify
     * @param secret the secret to use
     * @param associatedData the associated data to use
     * @param flag the flag to use
     * @return true if the hash matches the password, false otherwise
     */
    public static boolean verify(@NotNull String encodedHash, byte @NotNull [] password, byte[] secret, byte[] associatedData, @NotNull ArgonFlag flag) {
        try {
            var parts = encodedHash.split("\\$");
            var variant = ArgonVariant.of(parts[1]);
            var version = ArgonVersion.of(Integer.parseInt(parts[2].substring(2)));
            var memory = Integer.parseInt(parts[3].substring(2, parts[3].indexOf(',')));
            var iterations = Integer.parseInt(parts[3].substring(parts[3].indexOf(',') + 3, parts[3].lastIndexOf(',')));
            var parallelism = Integer.parseInt(parts[3].substring(parts[3].lastIndexOf(',') + 3));
            var salt = Base64.getDecoder().decode(parts[4]);
            var hash = Base64.getDecoder().decode(parts[5]);
            return verify(hash, password, salt, secret, associatedData, hash.length, memory, parallelism, iterations, version, flag, variant);
        } catch (Exception e) {
            throw new ArgonException(ArgonStatus.ARGON2_DECODING_FAIL);
        }
    }

    /**
     * Verifies the given hash against the given password, secret, and associated data.
     *
     * @param hash the hash to verify
     * @param password the password to verify
     * @param salt the salt to use
     * @param secret the secret to use
     * @param associatedData the associated data to use
     * @param hashLength the length of the hash
     * @param memoryCost the memory cost
     * @param parallelism the parallelism
     * @param iterations the iterations
     * @param version the version to use
     * @param flag the flag to use
     * @param variant the variant to use
     * @return true if the hash matches the password, false otherwise
     */
    public static boolean verify(byte @NotNull [] hash, byte @NotNull [] password, byte @NotNull [] salt, byte[] secret, byte[] associatedData, int hashLength,
                          int memoryCost, int parallelism, int iterations, @NotNull ArgonVersion version, @NotNull ArgonFlag flag,
                          @NotNull ArgonVariant variant) {
        byte[] hashed = rawHash(password, salt, secret, associatedData, hashLength, memoryCost, parallelism, iterations,
                version, flag, variant);
        return Arrays.equals(hashed, hash);
    }

}
