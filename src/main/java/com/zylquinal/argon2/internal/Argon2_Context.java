// Generated by jextract

package com.zylquinal.argon2.internal;

import com.zylquinal.argon2.api.enumeration.ArgonFlag;
import com.zylquinal.argon2.api.enumeration.ArgonVersion;
import org.jetbrains.annotations.NotNull;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang = c:
 * struct Argon2_Context {
 *     uint8_t *out;
 *     uint32_t outlen;
 *     uint8_t *pwd;
 *     uint32_t pwdlen;
 *     uint8_t *salt;
 *     uint32_t saltlen;
 *     uint8_t *secret;
 *     uint32_t secretlen;
 *     uint8_t *ad;
 *     uint32_t adlen;
 *     uint32_t t_cost;
 *     uint32_t m_cost;
 *     uint32_t lanes;
 *     uint32_t threads;
 *     uint32_t version;
 *     allocate_fptr allocate_cbk;
 *     deallocate_fptr free_cbk;
 *     uint32_t flags;
 * }
 *}
 */
public class Argon2_Context {

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            argon2_h.C_POINTER.withName("out"),
            argon2_h.C_INT.withName("outlen"),
            MemoryLayout.paddingLayout(4),
            argon2_h.C_POINTER.withName("pwd"),
            argon2_h.C_INT.withName("pwdlen"),
            MemoryLayout.paddingLayout(4),
            argon2_h.C_POINTER.withName("salt"),
            argon2_h.C_INT.withName("saltlen"),
            MemoryLayout.paddingLayout(4),
            argon2_h.C_POINTER.withName("secret"),
            argon2_h.C_INT.withName("secretlen"),
            MemoryLayout.paddingLayout(4),
            argon2_h.C_POINTER.withName("ad"),
            argon2_h.C_INT.withName("adlen"),
            argon2_h.C_INT.withName("t_cost"),
            argon2_h.C_INT.withName("m_cost"),
            argon2_h.C_INT.withName("lanes"),
            argon2_h.C_INT.withName("threads"),
            argon2_h.C_INT.withName("version"),
            argon2_h.C_POINTER.withName("allocate_cbk"),
            argon2_h.C_POINTER.withName("free_cbk"),
            argon2_h.C_INT.withName("flags"),
            MemoryLayout.paddingLayout(4)
    ).withName("Argon2_Context");
    private static final AddressLayout out$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("out"));
    private static final long out$OFFSET = 0;
    private static final OfInt outlen$LAYOUT = (OfInt) $LAYOUT.select(groupElement("outlen"));
    private static final long outlen$OFFSET = 8;
    private static final AddressLayout pwd$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("pwd"));
    private static final long pwd$OFFSET = 16;
    private static final OfInt pwdlen$LAYOUT = (OfInt) $LAYOUT.select(groupElement("pwdlen"));
    private static final long pwdlen$OFFSET = 24;
    private static final AddressLayout salt$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("salt"));
    private static final long salt$OFFSET = 32;
    private static final OfInt saltlen$LAYOUT = (OfInt) $LAYOUT.select(groupElement("saltlen"));
    private static final long saltlen$OFFSET = 40;
    private static final AddressLayout secret$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("secret"));
    private static final long secret$OFFSET = 48;
    private static final OfInt secretlen$LAYOUT = (OfInt) $LAYOUT.select(groupElement("secretlen"));
    private static final long secretlen$OFFSET = 56;
    private static final AddressLayout ad$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("ad"));
    private static final long ad$OFFSET = 64;
    private static final OfInt adlen$LAYOUT = (OfInt) $LAYOUT.select(groupElement("adlen"));
    private static final long adlen$OFFSET = 72;
    private static final OfInt t_cost$LAYOUT = (OfInt) $LAYOUT.select(groupElement("t_cost"));
    private static final long t_cost$OFFSET = 76;
    private static final OfInt m_cost$LAYOUT = (OfInt) $LAYOUT.select(groupElement("m_cost"));
    private static final long m_cost$OFFSET = 80;
    private static final OfInt lanes$LAYOUT = (OfInt) $LAYOUT.select(groupElement("lanes"));
    private static final long lanes$OFFSET = 84;
    private static final OfInt threads$LAYOUT = (OfInt) $LAYOUT.select(groupElement("threads"));
    private static final long threads$OFFSET = 88;
    private static final OfInt version$LAYOUT = (OfInt) $LAYOUT.select(groupElement("version"));
    private static final long version$OFFSET = 92;
    private static final AddressLayout allocate_cbk$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("allocate_cbk"));
    private static final long allocate_cbk$OFFSET = 96;
    private static final AddressLayout free_cbk$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("free_cbk"));
    private static final long free_cbk$OFFSET = 104;
    private static final OfInt flags$LAYOUT = (OfInt) $LAYOUT.select(groupElement("flags"));
    private static final long flags$OFFSET = 112;

    Argon2_Context() {
        // Should not be called directly
    }

    public static MemorySegment layout(byte @NotNull [] password, byte @NotNull [] salt, byte[] secret, byte[] associatedData, int hashLength,
                                       int memoryCost, int parallelism, int iterations, @NotNull ArgonVersion version, @NotNull ArgonFlag flag,
                                       Arena arena) {
        MemorySegment passwordPtr = arena.allocate(password.length);
        MemorySegment saltPtr = arena.allocate(salt.length);
        MemorySegment secretPtr = arena.allocate(secret == null ? 0 : secret.length);
        MemorySegment associatedDataPtr = arena.allocate(associatedData == null ? 0 : associatedData.length);
        MemorySegment outPtr = arena.allocate(hashLength);

        passwordPtr.copyFrom(MemorySegment.ofArray(password));
        saltPtr.copyFrom(MemorySegment.ofArray(salt));
        if (secret != null) secretPtr.copyFrom(MemorySegment.ofArray(secret));
        if (associatedData != null) associatedDataPtr.copyFrom(MemorySegment.ofArray(associatedData));

        MemorySegment struct = arena.allocate(Argon2_Context.layout());
        Argon2_Context.pwd(struct, passwordPtr);
        Argon2_Context.pwdlen(struct, password.length);
        Argon2_Context.salt(struct, saltPtr);
        Argon2_Context.saltlen(struct, salt.length);
        Argon2_Context.secret(struct, secretPtr);
        Argon2_Context.secretlen(struct, secret == null ? 0 : secret.length);
        Argon2_Context.ad(struct, associatedDataPtr);
        Argon2_Context.adlen(struct, associatedData == null ? 0 : associatedData.length);
        Argon2_Context.out(struct, outPtr);
        Argon2_Context.outlen(struct, hashLength);
        Argon2_Context.t_cost(struct, iterations);
        Argon2_Context.m_cost(struct, memoryCost);
        Argon2_Context.lanes(struct, parallelism);
        Argon2_Context.threads(struct, parallelism);
        Argon2_Context.version(struct, version.version());
        Argon2_Context.flags(struct, flag.value());
        return struct;
    }

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint8_t *out
     *}
     */
    public static final AddressLayout out$layout() {
        return out$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint8_t *out
     *}
     */
    public static final long out$offset() {
        return out$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint8_t *out
     *}
     */
    public static MemorySegment out(MemorySegment struct) {
        return struct.get(out$LAYOUT, out$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint8_t *out
     *}
     */
    public static void out(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(out$LAYOUT, out$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t outlen
     *}
     */
    public static final OfInt outlen$layout() {
        return outlen$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t outlen
     *}
     */
    public static final long outlen$offset() {
        return outlen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t outlen
     *}
     */
    public static int outlen(MemorySegment struct) {
        return struct.get(outlen$LAYOUT, outlen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t outlen
     *}
     */
    public static void outlen(MemorySegment struct, int fieldValue) {
        struct.set(outlen$LAYOUT, outlen$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint8_t *pwd
     *}
     */
    public static final AddressLayout pwd$layout() {
        return pwd$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint8_t *pwd
     *}
     */
    public static final long pwd$offset() {
        return pwd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint8_t *pwd
     *}
     */
    public static MemorySegment pwd(MemorySegment struct) {
        return struct.get(pwd$LAYOUT, pwd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint8_t *pwd
     *}
     */
    public static void pwd(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwd$LAYOUT, pwd$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t pwdlen
     *}
     */
    public static final OfInt pwdlen$layout() {
        return pwdlen$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t pwdlen
     *}
     */
    public static final long pwdlen$offset() {
        return pwdlen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t pwdlen
     *}
     */
    public static int pwdlen(MemorySegment struct) {
        return struct.get(pwdlen$LAYOUT, pwdlen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t pwdlen
     *}
     */
    public static void pwdlen(MemorySegment struct, int fieldValue) {
        struct.set(pwdlen$LAYOUT, pwdlen$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint8_t *salt
     *}
     */
    public static final AddressLayout salt$layout() {
        return salt$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint8_t *salt
     *}
     */
    public static final long salt$offset() {
        return salt$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint8_t *salt
     *}
     */
    public static MemorySegment salt(MemorySegment struct) {
        return struct.get(salt$LAYOUT, salt$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint8_t *salt
     *}
     */
    public static void salt(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(salt$LAYOUT, salt$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t saltlen
     *}
     */
    public static final OfInt saltlen$layout() {
        return saltlen$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t saltlen
     *}
     */
    public static final long saltlen$offset() {
        return saltlen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t saltlen
     *}
     */
    public static int saltlen(MemorySegment struct) {
        return struct.get(saltlen$LAYOUT, saltlen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t saltlen
     *}
     */
    public static void saltlen(MemorySegment struct, int fieldValue) {
        struct.set(saltlen$LAYOUT, saltlen$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint8_t *secret
     *}
     */
    public static final AddressLayout secret$layout() {
        return secret$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint8_t *secret
     *}
     */
    public static final long secret$offset() {
        return secret$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint8_t *secret
     *}
     */
    public static MemorySegment secret(MemorySegment struct) {
        return struct.get(secret$LAYOUT, secret$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint8_t *secret
     *}
     */
    public static void secret(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(secret$LAYOUT, secret$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t secretlen
     *}
     */
    public static final OfInt secretlen$layout() {
        return secretlen$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t secretlen
     *}
     */
    public static final long secretlen$offset() {
        return secretlen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t secretlen
     *}
     */
    public static int secretlen(MemorySegment struct) {
        return struct.get(secretlen$LAYOUT, secretlen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t secretlen
     *}
     */
    public static void secretlen(MemorySegment struct, int fieldValue) {
        struct.set(secretlen$LAYOUT, secretlen$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint8_t *ad
     *}
     */
    public static final AddressLayout ad$layout() {
        return ad$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint8_t *ad
     *}
     */
    public static final long ad$offset() {
        return ad$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint8_t *ad
     *}
     */
    public static MemorySegment ad(MemorySegment struct) {
        return struct.get(ad$LAYOUT, ad$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint8_t *ad
     *}
     */
    public static void ad(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ad$LAYOUT, ad$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t adlen
     *}
     */
    public static final OfInt adlen$layout() {
        return adlen$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t adlen
     *}
     */
    public static final long adlen$offset() {
        return adlen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t adlen
     *}
     */
    public static int adlen(MemorySegment struct) {
        return struct.get(adlen$LAYOUT, adlen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t adlen
     *}
     */
    public static void adlen(MemorySegment struct, int fieldValue) {
        struct.set(adlen$LAYOUT, adlen$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t t_cost
     *}
     */
    public static final OfInt t_cost$layout() {
        return t_cost$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t t_cost
     *}
     */
    public static final long t_cost$offset() {
        return t_cost$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t t_cost
     *}
     */
    public static int t_cost(MemorySegment struct) {
        return struct.get(t_cost$LAYOUT, t_cost$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t t_cost
     *}
     */
    public static void t_cost(MemorySegment struct, int fieldValue) {
        struct.set(t_cost$LAYOUT, t_cost$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t m_cost
     *}
     */
    public static final OfInt m_cost$layout() {
        return m_cost$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t m_cost
     *}
     */
    public static final long m_cost$offset() {
        return m_cost$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t m_cost
     *}
     */
    public static int m_cost(MemorySegment struct) {
        return struct.get(m_cost$LAYOUT, m_cost$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t m_cost
     *}
     */
    public static void m_cost(MemorySegment struct, int fieldValue) {
        struct.set(m_cost$LAYOUT, m_cost$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t lanes
     *}
     */
    public static final OfInt lanes$layout() {
        return lanes$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t lanes
     *}
     */
    public static final long lanes$offset() {
        return lanes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t lanes
     *}
     */
    public static int lanes(MemorySegment struct) {
        return struct.get(lanes$LAYOUT, lanes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t lanes
     *}
     */
    public static void lanes(MemorySegment struct, int fieldValue) {
        struct.set(lanes$LAYOUT, lanes$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t threads
     *}
     */
    public static final OfInt threads$layout() {
        return threads$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t threads
     *}
     */
    public static final long threads$offset() {
        return threads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t threads
     *}
     */
    public static int threads(MemorySegment struct) {
        return struct.get(threads$LAYOUT, threads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t threads
     *}
     */
    public static void threads(MemorySegment struct, int fieldValue) {
        struct.set(threads$LAYOUT, threads$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t version
     *}
     */
    public static final OfInt version$layout() {
        return version$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t version
     *}
     */
    public static final long version$offset() {
        return version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t version
     *}
     */
    public static int version(MemorySegment struct) {
        return struct.get(version$LAYOUT, version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t version
     *}
     */
    public static void version(MemorySegment struct, int fieldValue) {
        struct.set(version$LAYOUT, version$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * allocate_fptr allocate_cbk
     *}
     */
    public static final AddressLayout allocate_cbk$layout() {
        return allocate_cbk$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * allocate_fptr allocate_cbk
     *}
     */
    public static final long allocate_cbk$offset() {
        return allocate_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * allocate_fptr allocate_cbk
     *}
     */
    public static MemorySegment allocate_cbk(MemorySegment struct) {
        return struct.get(allocate_cbk$LAYOUT, allocate_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * allocate_fptr allocate_cbk
     *}
     */
    public static void allocate_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(allocate_cbk$LAYOUT, allocate_cbk$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * deallocate_fptr free_cbk
     *}
     */
    public static final AddressLayout free_cbk$layout() {
        return free_cbk$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * deallocate_fptr free_cbk
     *}
     */
    public static final long free_cbk$offset() {
        return free_cbk$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * deallocate_fptr free_cbk
     *}
     */
    public static MemorySegment free_cbk(MemorySegment struct) {
        return struct.get(free_cbk$LAYOUT, free_cbk$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * deallocate_fptr free_cbk
     *}
     */
    public static void free_cbk(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(free_cbk$LAYOUT, free_cbk$OFFSET, fieldValue);
    }

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t flags
     *}
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t flags
     *}
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t flags
     *}
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t flags
     *}
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() {
        return layout().byteSize();
    }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

