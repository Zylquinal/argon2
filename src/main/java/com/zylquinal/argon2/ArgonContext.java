package com.zylquinal.argon2;

import com.zylquinal.argon2.enumeration.ArgonFlag;
import com.zylquinal.argon2.enumeration.ArgonVariant;
import com.zylquinal.argon2.enumeration.ArgonVersion;
import com.zylquinal.argon2.internal.Argon2_Context;
import lombok.Builder;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;

public class ArgonContext {

    private static final MemorySegment NULL = MemorySegment.allocateNative(0, MemorySession.global());

    private final MemorySession session;
    private final int hashLength;
    private final int memoryCost;
    private final int parallelism;
    private final int iterations;
    private final ArgonVersion version;

    private final ArgonFlag flag;

    private final byte[] password;

    private final byte[] salt;

    private final byte[] secret;

    private final byte[] associatedData;

    private final MemorySegment passwordAddress;
    private final MemorySegment saltAddress;
    private final MemorySegment secretAddress;
    private final MemorySegment associatedDataAddress;
    private final MemorySegment outAddress;

    @Builder
    ArgonContext(@NotNull MemorySession session, int hashLength, int memoryCost, int parallelism, int iterations, @NotNull ArgonVersion version, @NotNull ArgonFlag flag,
                        byte @NonNull [] password, byte @NonNull [] salt, byte @Nullable [] secret, byte @Nullable [] associatedData) {
        this.session = session;
        this.hashLength = hashLength;
        this.memoryCost = memoryCost;
        this.parallelism = parallelism;
        this.iterations = iterations;
        this.version = version;
        this.flag = flag;
        this.password = password;
        this.salt = salt;
        this.secret = secret;
        this.associatedData = associatedData;

        passwordAddress = MemorySegment.allocateNative(password.length, session);
        for (int i = 0; i < password.length; i++) {
            passwordAddress.set(ValueLayout.OfByte.JAVA_BYTE, i, password[i]);
        }

        saltAddress = MemorySegment.allocateNative(salt.length, session);
        for (int i = 0; i < salt.length; i++) {
            saltAddress.set(ValueLayout.OfByte.JAVA_BYTE, i, salt[i]);
        }

        if (secret != null) {
            secretAddress = MemorySegment.allocateNative(secret.length, session);
            for (int i = 0; i < secret.length; i++) {
                secretAddress.set(ValueLayout.OfByte.JAVA_BYTE, i, secret[i]);
            }
        } else {
            secretAddress = NULL;
        }

        if (associatedData != null) {
            associatedDataAddress = MemorySegment.allocateNative(associatedData.length, session);
            for (int i = 0; i < associatedData.length; i++) {
                associatedDataAddress.set(ValueLayout.OfByte.JAVA_BYTE, i, associatedData[i]);
            }
        } else {
            associatedDataAddress = NULL;
        }
        outAddress = MemorySegment.allocateNative(hashLength, session);
    }

    private MemorySegment layout() {
        MemorySegment struct = MemorySegment.allocateNative(Argon2_Context.$LAYOUT(), session);
        Argon2_Context.out$set(struct, outAddress.address());
        Argon2_Context.outlen$set(struct, hashLength);
        Argon2_Context.pwd$set(struct, passwordAddress.address());
        Argon2_Context.pwdlen$set(struct, password.length);
        Argon2_Context.salt$set(struct, saltAddress.address());
        Argon2_Context.saltlen$set(struct, salt.length);
        Argon2_Context.secret$set(struct, secretAddress.address());
        Argon2_Context.secretlen$set(struct, secret == null ? 0 : secret.length);
        Argon2_Context.ad$set(struct, associatedDataAddress.address());
        Argon2_Context.adlen$set(struct, associatedData == null ? 0 : associatedData.length);
        Argon2_Context.t_cost$set(struct, iterations);
        Argon2_Context.m_cost$set(struct, memoryCost);
        Argon2_Context.lanes$set(struct, parallelism);
        Argon2_Context.threads$set(struct, parallelism);
        Argon2_Context.version$set(struct, version.version());
        Argon2_Context.allocate_cbk$set(struct, MemoryAddress.NULL);
        Argon2_Context.free_cbk$set(struct, MemoryAddress.NULL);
        Argon2_Context.flags$set(struct, flag.value());
        return struct;
    }

    public static ArgonContextBuilder builder() {
        return new ArgonContextBuilder();
    }

    public static class ArgonContextBuilder {

        private ArgonFlag flag = ArgonFlag.DEFAULT;

        public ArgonContextBuilder flag(ArgonFlag flag) {
            this.flag = flag;
            return this;
        }

        private ArgonContextBuilder session(MemorySession session) {
            this.session = session;
            return this;
        }

        private ArgonContext build(MemorySession session) {
            return new ArgonContext(session, hashLength, memoryCost, parallelism, iterations, version, flag, password, salt, secret, associatedData);
        }

        MemorySegment create(MemorySession session) {
            return build(session).layout();
        }

        /**
         * Hashes the password using the given information
         *
         * @param variant The variant of Argon2 to use
         * @return The hashed password
         */
        public byte[] hash(ArgonVariant variant) {
            return Argon2.hashRaw(this, variant);
        }

    }

}