package com.zylquinal.argon2.internal;

import com.zylquinal.argon2.api.enumeration.ArgonFlag;
import com.zylquinal.argon2.api.enumeration.ArgonVersion;
import org.jetbrains.annotations.NotNull;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct Argon2_Context {
 *     uint8_t* out;
 *     uint32_t outlen;
 *     uint8_t* pwd;
 *     uint32_t pwdlen;
 *     uint8_t* salt;
 *     uint32_t saltlen;
 *     uint8_t* secret;
 *     uint32_t secretlen;
 *     uint8_t* ad;
 *     uint32_t adlen;
 *     uint32_t t_cost;
 *     uint32_t m_cost;
 *     uint32_t lanes;
 *     uint32_t threads;
 *     uint32_t version;
 *     allocate_fptr allocate_cbk;
 *     deallocate_fptr free_cbk;
 *     uint32_t flags;
 * };
 * }
 */
public class Argon2_Context {

    /**
     * Creates a MemorySegment of {@link Argon2_Context#$LAYOUT()}.
     *
     * @param password       the password to hash
     * @param salt           the salt to use
     * @param secret         the secret to use
     * @param associatedData the associated data to use
     * @param hashLength     the length of the hash
     * @param memoryCost     the memory cost
     * @param parallelism    the parallelism
     * @param iterations     the iterations
     * @param version        the version to use
     * @param flag           the flag to use
     * @param arena          the arena to use
     * @return the {@link MemorySegment} of {@link Argon2_Context#$LAYOUT()}
     */
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

        MemorySegment struct = arena.allocate(Argon2_Context.$LAYOUT());
        Argon2_Context.pwd$set(struct, passwordPtr);
        Argon2_Context.pwdlen$set(struct, password.length);
        Argon2_Context.salt$set(struct, saltPtr);
        Argon2_Context.saltlen$set(struct, salt.length);
        Argon2_Context.secret$set(struct, secretPtr);
        Argon2_Context.secretlen$set(struct, secret == null ? 0 : secret.length);
        Argon2_Context.ad$set(struct, associatedDataPtr);
        Argon2_Context.adlen$set(struct, associatedData == null ? 0 : associatedData.length);
        Argon2_Context.out$set(struct, outPtr);
        Argon2_Context.outlen$set(struct, hashLength);
        Argon2_Context.t_cost$set(struct, iterations);
        Argon2_Context.m_cost$set(struct, memoryCost);
        Argon2_Context.lanes$set(struct, parallelism);
        Argon2_Context.threads$set(struct, parallelism);
        Argon2_Context.version$set(struct, version.version());
        Argon2_Context.flags$set(struct, flag.value());
        return struct;
    }

    public static MemoryLayout $LAYOUT() {
        return constants$1.const$5;
    }
    public static VarHandle out$VH() {
        return constants$2.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* out;
     * }
     */
    public static MemorySegment out$get(MemorySegment seg) {
        return (MemorySegment)constants$2.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* out;
     * }
     */
    public static void out$set(MemorySegment seg, MemorySegment x) {
        constants$2.const$0.set(seg, x);
    }
    public static MemorySegment out$get(MemorySegment seg, long index) {
        return (MemorySegment)constants$2.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void out$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle outlen$VH() {
        return constants$2.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t outlen;
     * }
     */
    public static int outlen$get(MemorySegment seg) {
        return (int)constants$2.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t outlen;
     * }
     */
    public static void outlen$set(MemorySegment seg, int x) {
        constants$2.const$1.set(seg, x);
    }
    public static int outlen$get(MemorySegment seg, long index) {
        return (int)constants$2.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void outlen$set(MemorySegment seg, long index, int x) {
        constants$2.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pwd$VH() {
        return constants$2.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* pwd;
     * }
     */
    public static MemorySegment pwd$get(MemorySegment seg) {
        return (MemorySegment)constants$2.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* pwd;
     * }
     */
    public static void pwd$set(MemorySegment seg, MemorySegment x) {
        constants$2.const$2.set(seg, x);
    }
    public static MemorySegment pwd$get(MemorySegment seg, long index) {
        return (MemorySegment)constants$2.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pwd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pwdlen$VH() {
        return constants$2.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t pwdlen;
     * }
     */
    public static int pwdlen$get(MemorySegment seg) {
        return (int)constants$2.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t pwdlen;
     * }
     */
    public static void pwdlen$set(MemorySegment seg, int x) {
        constants$2.const$3.set(seg, x);
    }
    public static int pwdlen$get(MemorySegment seg, long index) {
        return (int)constants$2.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pwdlen$set(MemorySegment seg, long index, int x) {
        constants$2.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle salt$VH() {
        return constants$2.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* salt;
     * }
     */
    public static MemorySegment salt$get(MemorySegment seg) {
        return (MemorySegment)constants$2.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* salt;
     * }
     */
    public static void salt$set(MemorySegment seg, MemorySegment x) {
        constants$2.const$4.set(seg, x);
    }
    public static MemorySegment salt$get(MemorySegment seg, long index) {
        return (MemorySegment)constants$2.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void salt$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle saltlen$VH() {
        return constants$2.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t saltlen;
     * }
     */
    public static int saltlen$get(MemorySegment seg) {
        return (int)constants$2.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t saltlen;
     * }
     */
    public static void saltlen$set(MemorySegment seg, int x) {
        constants$2.const$5.set(seg, x);
    }
    public static int saltlen$get(MemorySegment seg, long index) {
        return (int)constants$2.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void saltlen$set(MemorySegment seg, long index, int x) {
        constants$2.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle secret$VH() {
        return constants$3.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* secret;
     * }
     */
    public static MemorySegment secret$get(MemorySegment seg) {
        return (MemorySegment)constants$3.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* secret;
     * }
     */
    public static void secret$set(MemorySegment seg, MemorySegment x) {
        constants$3.const$0.set(seg, x);
    }
    public static MemorySegment secret$get(MemorySegment seg, long index) {
        return (MemorySegment)constants$3.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void secret$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle secretlen$VH() {
        return constants$3.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t secretlen;
     * }
     */
    public static int secretlen$get(MemorySegment seg) {
        return (int)constants$3.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t secretlen;
     * }
     */
    public static void secretlen$set(MemorySegment seg, int x) {
        constants$3.const$1.set(seg, x);
    }
    public static int secretlen$get(MemorySegment seg, long index) {
        return (int)constants$3.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void secretlen$set(MemorySegment seg, long index, int x) {
        constants$3.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ad$VH() {
        return constants$3.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint8_t* ad;
     * }
     */
    public static MemorySegment ad$get(MemorySegment seg) {
        return (MemorySegment)constants$3.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint8_t* ad;
     * }
     */
    public static void ad$set(MemorySegment seg, MemorySegment x) {
        constants$3.const$2.set(seg, x);
    }
    public static MemorySegment ad$get(MemorySegment seg, long index) {
        return (MemorySegment)constants$3.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ad$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle adlen$VH() {
        return constants$3.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t adlen;
     * }
     */
    public static int adlen$get(MemorySegment seg) {
        return (int)constants$3.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t adlen;
     * }
     */
    public static void adlen$set(MemorySegment seg, int x) {
        constants$3.const$3.set(seg, x);
    }
    public static int adlen$get(MemorySegment seg, long index) {
        return (int)constants$3.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void adlen$set(MemorySegment seg, long index, int x) {
        constants$3.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle t_cost$VH() {
        return constants$3.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t t_cost;
     * }
     */
    public static int t_cost$get(MemorySegment seg) {
        return (int)constants$3.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t t_cost;
     * }
     */
    public static void t_cost$set(MemorySegment seg, int x) {
        constants$3.const$4.set(seg, x);
    }
    public static int t_cost$get(MemorySegment seg, long index) {
        return (int)constants$3.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void t_cost$set(MemorySegment seg, long index, int x) {
        constants$3.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle m_cost$VH() {
        return constants$3.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t m_cost;
     * }
     */
    public static int m_cost$get(MemorySegment seg) {
        return (int)constants$3.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t m_cost;
     * }
     */
    public static void m_cost$set(MemorySegment seg, int x) {
        constants$3.const$5.set(seg, x);
    }
    public static int m_cost$get(MemorySegment seg, long index) {
        return (int)constants$3.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void m_cost$set(MemorySegment seg, long index, int x) {
        constants$3.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lanes$VH() {
        return constants$4.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t lanes;
     * }
     */
    public static int lanes$get(MemorySegment seg) {
        return (int)constants$4.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t lanes;
     * }
     */
    public static void lanes$set(MemorySegment seg, int x) {
        constants$4.const$0.set(seg, x);
    }
    public static int lanes$get(MemorySegment seg, long index) {
        return (int)constants$4.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lanes$set(MemorySegment seg, long index, int x) {
        constants$4.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle threads$VH() {
        return constants$4.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t threads;
     * }
     */
    public static int threads$get(MemorySegment seg) {
        return (int)constants$4.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t threads;
     * }
     */
    public static void threads$set(MemorySegment seg, int x) {
        constants$4.const$1.set(seg, x);
    }
    public static int threads$get(MemorySegment seg, long index) {
        return (int)constants$4.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void threads$set(MemorySegment seg, long index, int x) {
        constants$4.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle version$VH() {
        return constants$4.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t version;
     * }
     */
    public static int version$get(MemorySegment seg) {
        return (int)constants$4.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t version;
     * }
     */
    public static void version$set(MemorySegment seg, int x) {
        constants$4.const$2.set(seg, x);
    }
    public static int version$get(MemorySegment seg, long index) {
        return (int)constants$4.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void version$set(MemorySegment seg, long index, int x) {
        constants$4.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle allocate_cbk$VH() {
        return constants$4.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * allocate_fptr allocate_cbk;
     * }
     */
    public static MemorySegment allocate_cbk$get(MemorySegment seg) {
        return (MemorySegment)constants$4.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * allocate_fptr allocate_cbk;
     * }
     */
    public static void allocate_cbk$set(MemorySegment seg, MemorySegment x) {
        constants$4.const$3.set(seg, x);
    }
    public static MemorySegment allocate_cbk$get(MemorySegment seg, long index) {
        return (MemorySegment)constants$4.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void allocate_cbk$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static allocate_fptr allocate_cbk(MemorySegment segment, Arena scope) {
        return allocate_fptr.ofAddress(allocate_cbk$get(segment), scope);
    }
    public static VarHandle free_cbk$VH() {
        return constants$4.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * deallocate_fptr free_cbk;
     * }
     */
    public static MemorySegment free_cbk$get(MemorySegment seg) {
        return (MemorySegment)constants$4.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * deallocate_fptr free_cbk;
     * }
     */
    public static void free_cbk$set(MemorySegment seg, MemorySegment x) {
        constants$4.const$4.set(seg, x);
    }
    public static MemorySegment free_cbk$get(MemorySegment seg, long index) {
        return (MemorySegment)constants$4.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void free_cbk$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static deallocate_fptr free_cbk(MemorySegment segment, Arena scope) {
        return deallocate_fptr.ofAddress(free_cbk$get(segment), scope);
    }
    public static VarHandle flags$VH() {
        return constants$4.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$4.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$4.const$5.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$4.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$4.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


