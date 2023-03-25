package com.zylquinal.argon2.internal;

import com.zylquinal.argon2.api.enumeration.ArgonFlag;
import com.zylquinal.argon2.api.enumeration.ArgonVersion;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.PathElement;

/**
 * {@snippet :
 * struct Argon2_Context {
 *     unsigned char* out;
 *     unsigned int outlen;
 *     unsigned char* pwd;
 *     unsigned int pwdlen;
 *     unsigned char* salt;
 *     unsigned int saltlen;
 *     unsigned char* secret;
 *     unsigned int secretlen;
 *     unsigned char* ad;
 *     unsigned int adlen;
 *     unsigned int t_cost;
 *     unsigned int m_cost;
 *     unsigned int lanes;
 *     unsigned int threads;
 *     unsigned int version;
 *     int (*allocate_cbk)(unsigned char**,unsigned long);
 *     void (*free_cbk)(unsigned char*,unsigned long);
 *     unsigned int flags;
 * };
 *}
 */
public class Argon2_Context {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("out"),
            Constants$root.C_INT$LAYOUT.withName("outlen"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pwd"),
            Constants$root.C_INT$LAYOUT.withName("pwdlen"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("salt"),
            Constants$root.C_INT$LAYOUT.withName("saltlen"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("secret"),
            Constants$root.C_INT$LAYOUT.withName("secretlen"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("ad"),
            Constants$root.C_INT$LAYOUT.withName("adlen"),
            Constants$root.C_INT$LAYOUT.withName("t_cost"),
            Constants$root.C_INT$LAYOUT.withName("m_cost"),
            Constants$root.C_INT$LAYOUT.withName("lanes"),
            Constants$root.C_INT$LAYOUT.withName("threads"),
            Constants$root.C_INT$LAYOUT.withName("version"),
            Constants$root.C_POINTER$LAYOUT.withName("allocate_cbk"),
            Constants$root.C_POINTER$LAYOUT.withName("free_cbk"),
            Constants$root.C_INT$LAYOUT.withName("flags"),
            MemoryLayout.paddingLayout(32)
    ).withName("Argon2_Context");
    static final VarHandle out$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("out"));
    static final VarHandle outlen$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("outlen"));
    static final VarHandle pwd$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pwd"));
    static final VarHandle pwdlen$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pwdlen"));
    static final VarHandle salt$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("salt"));
    static final VarHandle saltlen$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("saltlen"));
    static final VarHandle secret$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("secret"));
    static final VarHandle secretlen$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("secretlen"));
    static final VarHandle ad$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("ad"));
    static final VarHandle adlen$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("adlen"));
    static final VarHandle t_cost$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("t_cost"));
    static final VarHandle m_cost$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("m_cost"));
    static final VarHandle lanes$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("lanes"));
    static final VarHandle threads$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("threads"));
    static final VarHandle version$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("version"));
    static final FunctionDescriptor allocate_cbk$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor allocate_cbk_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle allocate_cbk_UP$MH = RuntimeHelper.upcallHandle(allocate_cbk.class, "apply", Argon2_Context.allocate_cbk_UP$FUNC);
    static final FunctionDescriptor allocate_cbk_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle allocate_cbk_DOWN$MH = RuntimeHelper.downcallHandle(
            Argon2_Context.allocate_cbk_DOWN$FUNC
    );
    static final VarHandle allocate_cbk$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("allocate_cbk"));
    static final FunctionDescriptor free_cbk$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor free_cbk_UP$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle free_cbk_UP$MH = RuntimeHelper.upcallHandle(free_cbk.class, "apply", Argon2_Context.free_cbk_UP$FUNC);
    static final FunctionDescriptor free_cbk_DOWN$FUNC = FunctionDescriptor.ofVoid(
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle free_cbk_DOWN$MH = RuntimeHelper.downcallHandle(
            Argon2_Context.free_cbk_DOWN$FUNC
    );
    static final VarHandle free_cbk$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("free_cbk"));
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("flags"));

    public static MemoryLayout $LAYOUT() {
        return Argon2_Context.$struct$LAYOUT;
    }

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
     * @param scope          the session to use
     * @return the {@link MemorySegment} of {@link Argon2_Context#$LAYOUT()}
     */
    public static MemorySegment layout(byte @NotNull [] password, byte @NotNull [] salt, byte[] secret, byte[] associatedData, int hashLength,
                                       int memoryCost, int parallelism, int iterations, @NotNull ArgonVersion version, @NotNull ArgonFlag flag,
                                       SegmentScope scope) {
        MemorySegment passwordPtr = MemorySegment.allocateNative(password.length, scope);
        MemorySegment saltPtr = MemorySegment.allocateNative(salt.length, scope);
        MemorySegment secretPtr = MemorySegment.allocateNative(secret == null ? 0 : secret.length, scope);
        MemorySegment associatedDataPtr = MemorySegment.allocateNative(associatedData == null ? 0 : associatedData.length, scope);
        MemorySegment outPtr = MemorySegment.allocateNative(hashLength, scope);

        passwordPtr.copyFrom(MemorySegment.ofArray(password));
        saltPtr.copyFrom(MemorySegment.ofArray(salt));
        if (secret != null) secretPtr.copyFrom(MemorySegment.ofArray(secret));
        if (associatedData != null) associatedDataPtr.copyFrom(MemorySegment.ofArray(associatedData));

        MemorySegment struct = MemorySegment.allocateNative(Argon2_Context.$LAYOUT(), scope);
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

    public static VarHandle out$VH() {
        return Argon2_Context.out$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* out;
     *}
     */
    public static MemorySegment out$get(MemorySegment seg) {
        return (MemorySegment) Argon2_Context.out$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* out;
     *}
     */
    public static void out$set(MemorySegment seg, MemorySegment x) {
        Argon2_Context.out$VH.set(seg, x);
    }

    public static MemorySegment out$get(MemorySegment seg, long index) {
        return (MemorySegment) Argon2_Context.out$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void out$set(MemorySegment seg, long index, MemorySegment x) {
        Argon2_Context.out$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle outlen$VH() {
        return Argon2_Context.outlen$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int outlen;
     *}
     */
    public static int outlen$get(MemorySegment seg) {
        return (int) Argon2_Context.outlen$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int outlen;
     *}
     */
    public static void outlen$set(MemorySegment seg, int x) {
        Argon2_Context.outlen$VH.set(seg, x);
    }

    public static int outlen$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.outlen$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void outlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.outlen$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle pwd$VH() {
        return Argon2_Context.pwd$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* pwd;
     *}
     */
    public static MemorySegment pwd$get(MemorySegment seg) {
        return (MemorySegment) Argon2_Context.pwd$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* pwd;
     *}
     */
    public static void pwd$set(MemorySegment seg, MemorySegment x) {
        Argon2_Context.pwd$VH.set(seg, x);
    }

    public static MemorySegment pwd$get(MemorySegment seg, long index) {
        return (MemorySegment) Argon2_Context.pwd$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void pwd$set(MemorySegment seg, long index, MemorySegment x) {
        Argon2_Context.pwd$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle pwdlen$VH() {
        return Argon2_Context.pwdlen$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int pwdlen;
     *}
     */
    public static int pwdlen$get(MemorySegment seg) {
        return (int) Argon2_Context.pwdlen$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int pwdlen;
     *}
     */
    public static void pwdlen$set(MemorySegment seg, int x) {
        Argon2_Context.pwdlen$VH.set(seg, x);
    }

    public static int pwdlen$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.pwdlen$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void pwdlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.pwdlen$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle salt$VH() {
        return Argon2_Context.salt$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* salt;
     *}
     */
    public static MemorySegment salt$get(MemorySegment seg) {
        return (MemorySegment) Argon2_Context.salt$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* salt;
     *}
     */
    public static void salt$set(MemorySegment seg, MemorySegment x) {
        Argon2_Context.salt$VH.set(seg, x);
    }

    public static MemorySegment salt$get(MemorySegment seg, long index) {
        return (MemorySegment) Argon2_Context.salt$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void salt$set(MemorySegment seg, long index, MemorySegment x) {
        Argon2_Context.salt$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle saltlen$VH() {
        return Argon2_Context.saltlen$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int saltlen;
     *}
     */
    public static int saltlen$get(MemorySegment seg) {
        return (int) Argon2_Context.saltlen$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int saltlen;
     *}
     */
    public static void saltlen$set(MemorySegment seg, int x) {
        Argon2_Context.saltlen$VH.set(seg, x);
    }

    public static int saltlen$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.saltlen$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void saltlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.saltlen$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle secret$VH() {
        return Argon2_Context.secret$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* secret;
     *}
     */
    public static MemorySegment secret$get(MemorySegment seg) {
        return (MemorySegment) Argon2_Context.secret$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* secret;
     *}
     */
    public static void secret$set(MemorySegment seg, MemorySegment x) {
        Argon2_Context.secret$VH.set(seg, x);
    }

    public static MemorySegment secret$get(MemorySegment seg, long index) {
        return (MemorySegment) Argon2_Context.secret$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void secret$set(MemorySegment seg, long index, MemorySegment x) {
        Argon2_Context.secret$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle secretlen$VH() {
        return Argon2_Context.secretlen$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int secretlen;
     *}
     */
    public static int secretlen$get(MemorySegment seg) {
        return (int) Argon2_Context.secretlen$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int secretlen;
     *}
     */
    public static void secretlen$set(MemorySegment seg, int x) {
        Argon2_Context.secretlen$VH.set(seg, x);
    }

    public static int secretlen$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.secretlen$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void secretlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.secretlen$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle ad$VH() {
        return Argon2_Context.ad$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* ad;
     *}
     */
    public static MemorySegment ad$get(MemorySegment seg) {
        return (MemorySegment) Argon2_Context.ad$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* ad;
     *}
     */
    public static void ad$set(MemorySegment seg, MemorySegment x) {
        Argon2_Context.ad$VH.set(seg, x);
    }

    public static MemorySegment ad$get(MemorySegment seg, long index) {
        return (MemorySegment) Argon2_Context.ad$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void ad$set(MemorySegment seg, long index, MemorySegment x) {
        Argon2_Context.ad$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle adlen$VH() {
        return Argon2_Context.adlen$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int adlen;
     *}
     */
    public static int adlen$get(MemorySegment seg) {
        return (int) Argon2_Context.adlen$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int adlen;
     *}
     */
    public static void adlen$set(MemorySegment seg, int x) {
        Argon2_Context.adlen$VH.set(seg, x);
    }

    public static int adlen$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.adlen$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void adlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.adlen$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle t_cost$VH() {
        return Argon2_Context.t_cost$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int t_cost;
     *}
     */
    public static int t_cost$get(MemorySegment seg) {
        return (int) Argon2_Context.t_cost$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int t_cost;
     *}
     */
    public static void t_cost$set(MemorySegment seg, int x) {
        Argon2_Context.t_cost$VH.set(seg, x);
    }

    public static int t_cost$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.t_cost$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void t_cost$set(MemorySegment seg, long index, int x) {
        Argon2_Context.t_cost$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle m_cost$VH() {
        return Argon2_Context.m_cost$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int m_cost;
     *}
     */
    public static int m_cost$get(MemorySegment seg) {
        return (int) Argon2_Context.m_cost$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int m_cost;
     *}
     */
    public static void m_cost$set(MemorySegment seg, int x) {
        Argon2_Context.m_cost$VH.set(seg, x);
    }

    public static int m_cost$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.m_cost$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void m_cost$set(MemorySegment seg, long index, int x) {
        Argon2_Context.m_cost$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle lanes$VH() {
        return Argon2_Context.lanes$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int lanes;
     *}
     */
    public static int lanes$get(MemorySegment seg) {
        return (int) Argon2_Context.lanes$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int lanes;
     *}
     */
    public static void lanes$set(MemorySegment seg, int x) {
        Argon2_Context.lanes$VH.set(seg, x);
    }

    public static int lanes$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.lanes$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void lanes$set(MemorySegment seg, long index, int x) {
        Argon2_Context.lanes$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle threads$VH() {
        return Argon2_Context.threads$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int threads;
     *}
     */
    public static int threads$get(MemorySegment seg) {
        return (int) Argon2_Context.threads$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int threads;
     *}
     */
    public static void threads$set(MemorySegment seg, int x) {
        Argon2_Context.threads$VH.set(seg, x);
    }

    public static int threads$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.threads$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void threads$set(MemorySegment seg, long index, int x) {
        Argon2_Context.threads$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle version$VH() {
        return Argon2_Context.version$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int version;
     *}
     */
    public static int version$get(MemorySegment seg) {
        return (int) Argon2_Context.version$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int version;
     *}
     */
    public static void version$set(MemorySegment seg, int x) {
        Argon2_Context.version$VH.set(seg, x);
    }

    public static int version$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.version$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void version$set(MemorySegment seg, long index, int x) {
        Argon2_Context.version$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static VarHandle allocate_cbk$VH() {
        return Argon2_Context.allocate_cbk$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * int (*allocate_cbk)(unsigned char**,unsigned long);
     *}
     */
    public static MemorySegment allocate_cbk$get(MemorySegment seg) {
        return (MemorySegment) Argon2_Context.allocate_cbk$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * int (*allocate_cbk)(unsigned char**,unsigned long);
     *}
     */
    public static void allocate_cbk$set(MemorySegment seg, MemorySegment x) {
        Argon2_Context.allocate_cbk$VH.set(seg, x);
    }

    public static MemorySegment allocate_cbk$get(MemorySegment seg, long index) {
        return (MemorySegment) Argon2_Context.allocate_cbk$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void allocate_cbk$set(MemorySegment seg, long index, MemorySegment x) {
        Argon2_Context.allocate_cbk$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static allocate_cbk allocate_cbk(MemorySegment segment, SegmentScope scope) {
        return allocate_cbk.ofAddress(allocate_cbk$get(segment), scope);
    }

    public static VarHandle free_cbk$VH() {
        return Argon2_Context.free_cbk$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * void (*free_cbk)(unsigned char*,unsigned long);
     *}
     */
    public static MemorySegment free_cbk$get(MemorySegment seg) {
        return (MemorySegment) Argon2_Context.free_cbk$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * void (*free_cbk)(unsigned char*,unsigned long);
     *}
     */
    public static void free_cbk$set(MemorySegment seg, MemorySegment x) {
        Argon2_Context.free_cbk$VH.set(seg, x);
    }

    public static MemorySegment free_cbk$get(MemorySegment seg, long index) {
        return (MemorySegment) Argon2_Context.free_cbk$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void free_cbk$set(MemorySegment seg, long index, MemorySegment x) {
        Argon2_Context.free_cbk$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static free_cbk free_cbk(MemorySegment segment, SegmentScope scope) {
        return free_cbk.ofAddress(free_cbk$get(segment), scope);
    }

    public static VarHandle flags$VH() {
        return Argon2_Context.flags$VH;
    }

    /**
     * Getter for field:
     * {@snippet :
     * unsigned int flags;
     *}
     */
    public static int flags$get(MemorySegment seg) {
        return (int) Argon2_Context.flags$VH.get(seg);
    }

    /**
     * Setter for field:
     * {@snippet :
     * unsigned int flags;
     *}
     */
    public static void flags$set(MemorySegment seg, int x) {
        Argon2_Context.flags$VH.set(seg, x);
    }

    public static int flags$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.flags$VH.get(seg.asSlice(index * sizeof()));
    }

    public static void flags$set(MemorySegment seg, long index, int x) {
        Argon2_Context.flags$VH.set(seg.asSlice(index * sizeof()), x);
    }

    public static long sizeof() {
        return $LAYOUT().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate($LAYOUT());
    }

    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope);
    }

    /**
     * {@snippet :
     * int (*allocate_cbk)(unsigned char**,unsigned long);
     *}
     */
    public interface allocate_cbk {

        static MemorySegment allocate(allocate_cbk fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(Argon2_Context.allocate_cbk_UP$MH, fi, Argon2_Context.allocate_cbk$FUNC, scope);
        }

        static allocate_cbk ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (MemorySegment _memory, long _bytes_to_allocate) -> {
                try {
                    return (int) Argon2_Context.allocate_cbk_DOWN$MH.invokeExact(symbol, _memory, _bytes_to_allocate);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }

        int apply(MemorySegment memory, long bytes_to_allocate);
    }

    /**
     * {@snippet :
     * void (*free_cbk)(unsigned char*,unsigned long);
     *}
     */
    public interface free_cbk {

        static MemorySegment allocate(free_cbk fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(Argon2_Context.free_cbk_UP$MH, fi, Argon2_Context.free_cbk$FUNC, scope);
        }

        static free_cbk ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (MemorySegment _memory, long _bytes_to_allocate) -> {
                try {
                    Argon2_Context.free_cbk_DOWN$MH.invokeExact(symbol, _memory, _bytes_to_allocate);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }

        void apply(MemorySegment memory, long bytes_to_allocate);
    }
}


