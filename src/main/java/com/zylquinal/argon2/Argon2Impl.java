package com.zylquinal.argon2;

import com.zylquinal.argon2.enumeration.ArgonStatus;
import com.zylquinal.argon2.enumeration.ArgonVariant;
import com.zylquinal.argon2.enumeration.ArgonVersion;
import com.zylquinal.argon2.exception.ArgonException;
import com.zylquinal.argon2.internal.argon2_h;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;
import java.util.Base64;

import static com.zylquinal.argon2.internal.argon2_h.argon2_hash;

record Argon2Impl(ArgonVariant variant, ArgonVersion version, int iterations, int memory, int parallelism,
                         int hashLength) implements Argon2 {

    private static final MemorySegment nullAddress = MemorySegment.allocateNative(0, MemorySession.global());
    private static final Base64.Encoder encoder = Base64.getEncoder().withoutPadding();

    @Override
    public byte[] hashRaw(byte[] password, byte[] salt, int hashLength, ArgonVersion version) {
        return hashRaw(iterations, memory, parallelism, password, salt, hashLength, version, variant);
    }

    private byte[] hashRaw(int iterations, int memory, int parallelism, byte[] password, byte[] salt, int hashLength, ArgonVersion version, ArgonVariant variant) {
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
                    hashLength, nullAddress, 0, variant.variant(), version.version());
            if (result != argon2_h.ARGON2_OK()) throw new ArgonException(ArgonStatus.of(result));
            return hashAddress.toArray(ValueLayout.OfByte.JAVA_BYTE);
        }
    }

    @Override
    public boolean verify(String encoded, byte[] password) {
        var parts = encoded.split("\\$");
        if (parts.length != 6) throw new IllegalArgumentException("Invalid encoded hash");
        var variant = ArgonVariant.of(parts[1]);
        var version = ArgonVersion.of(Integer.parseInt(parts[2].substring(2)));
        var memory = Integer.parseInt(parts[3].substring(2, parts[3].indexOf(',')));
        var iterations = Integer.parseInt(parts[3].substring(parts[3].indexOf(',') + 3, parts[3].lastIndexOf(',')));
        var parallelism = Integer.parseInt(parts[3].substring(parts[3].lastIndexOf(',') + 3));
        var salt = Base64.getDecoder().decode(parts[4]);
        var hash = Base64.getDecoder().decode(parts[5]);
        return Arrays.equals(hash, hashRaw(iterations, memory, parallelism, password, salt, hash.length, version, variant));
    }

    @Override
    public String encodeHash(byte[] hash, byte[] salt, ArgonVersion version) {
        return '$' + variant.variantName() + '$' + "v=" + version.version() + "$m=" + memory + ",t=" + iterations + ",p="
                + parallelism + '$' + encoder.encodeToString(salt) + '$' + encoder.encodeToString(hash);
    }

}
