package com.zylquinal.argon2;

import com.zylquinal.argon2.enumeration.ArgonStatus;
import com.zylquinal.argon2.enumeration.ArgonVariant;
import com.zylquinal.argon2.enumeration.ArgonVersion;
import com.zylquinal.argon2.exception.ArgonException;
import com.zylquinal.argon2.internal.argon2_h;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static com.zylquinal.argon2.internal.argon2_h.argon2_hash;
import static com.zylquinal.argon2.internal.argon2_h.argon2id_verify;

record Argon2Impl(ArgonVariant variant, ArgonVersion version, int iterations, int memory, int parallelism,
                         int hashLength) implements Argon2 {

    private static final Base64.Encoder encoder = Base64.getEncoder().withoutPadding();

    @Override
    public byte[] hashRaw(byte[] password, byte[] salt, int hashLength, ArgonVersion version) {
        try (MemorySession session = MemorySession.openConfined()) {
            MemorySegment passwordAddress = MemorySegment.allocateNative(password.length, session);
            passwordAddress.asByteBuffer().put(password);
            MemorySegment saltAddress = MemorySegment.allocateNative(salt.length, session);
            saltAddress.asByteBuffer().put(salt);
            MemorySegment hashAddress = MemorySegment.allocateNative(hashLength, session);
            MemorySegment nullAddress = MemorySegment.allocateNative(0, session);
            var result = argon2_hash(iterations, memory, parallelism, passwordAddress, password.length, saltAddress, salt.length, hashAddress,
                    hashLength, nullAddress, 0, variant.variant(), version.version());
            if (result != argon2_h.ARGON2_OK()) throw new ArgonException(ArgonStatus.of(result));
            return hashAddress.toArray(ValueLayout.OfByte.JAVA_BYTE);
        }
    }

    @Override
    public boolean verify(String encoded, byte[] password) {
        try (MemorySession session = MemorySession.openConfined()) {
            MemorySegment passwordAddress = MemorySegment.allocateNative(password.length, session);
            passwordAddress.asByteBuffer().put(password);
            MemorySegment encodedAddress = MemorySegment.allocateNative(encoded.length(), session);
            encodedAddress.asByteBuffer().put(encoded.getBytes(StandardCharsets.US_ASCII));
            return argon2id_verify(encodedAddress, passwordAddress, password.length) == argon2_h.ARGON2_OK();
        }
    }

    @Override
    public String encodeHash(byte[] hash, byte[] salt, ArgonVersion version) {
        return '$' + variant.variantName() + '$' + "v=" + version.version() + "$m=" + memory + ",t=" + iterations + ",p="
                + parallelism + '$' + encoder.encodeToString(salt) + '$' + encoder.encodeToString(hash);
    }

}
