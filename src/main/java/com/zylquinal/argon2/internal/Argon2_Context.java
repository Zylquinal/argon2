package com.zylquinal.argon2.internal;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class Argon2_Context {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    public static MemoryLayout $LAYOUT() {
        return Argon2_Context.$struct$LAYOUT;
    }
    static final VarHandle out$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("out"));
    public static VarHandle out$VH() {
        return Argon2_Context.out$VH;
    }
    public static MemoryAddress out$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.out$VH.get(seg);
    }
    public static void out$set( MemorySegment seg, MemoryAddress x) {
        Argon2_Context.out$VH.set(seg, x);
    }
    public static MemoryAddress out$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.out$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void out$set(MemorySegment seg, long index, MemoryAddress x) {
        Argon2_Context.out$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle outlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("outlen"));
    public static VarHandle outlen$VH() {
        return Argon2_Context.outlen$VH;
    }
    public static int outlen$get(MemorySegment seg) {
        return (int)Argon2_Context.outlen$VH.get(seg);
    }
    public static void outlen$set( MemorySegment seg, int x) {
        Argon2_Context.outlen$VH.set(seg, x);
    }
    public static int outlen$get(MemorySegment seg, long index) {
        return (int) Argon2_Context.outlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void outlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.outlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwd"));
    public static VarHandle pwd$VH() {
        return Argon2_Context.pwd$VH;
    }
    public static MemoryAddress pwd$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.pwd$VH.get(seg);
    }
    public static void pwd$set( MemorySegment seg, MemoryAddress x) {
        Argon2_Context.pwd$VH.set(seg, x);
    }
    public static MemoryAddress pwd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.pwd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwd$set(MemorySegment seg, long index, MemoryAddress x) {
        Argon2_Context.pwd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwdlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwdlen"));
    public static VarHandle pwdlen$VH() {
        return Argon2_Context.pwdlen$VH;
    }
    public static int pwdlen$get(MemorySegment seg) {
        return (int)Argon2_Context.pwdlen$VH.get(seg);
    }
    public static void pwdlen$set( MemorySegment seg, int x) {
        Argon2_Context.pwdlen$VH.set(seg, x);
    }
    public static int pwdlen$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.pwdlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwdlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.pwdlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle salt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("salt"));
    public static VarHandle salt$VH() {
        return Argon2_Context.salt$VH;
    }
    public static MemoryAddress salt$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.salt$VH.get(seg);
    }
    public static void salt$set( MemorySegment seg, MemoryAddress x) {
        Argon2_Context.salt$VH.set(seg, x);
    }
    public static MemoryAddress salt$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.salt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void salt$set(MemorySegment seg, long index, MemoryAddress x) {
        Argon2_Context.salt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle saltlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("saltlen"));
    public static VarHandle saltlen$VH() {
        return Argon2_Context.saltlen$VH;
    }
    public static int saltlen$get(MemorySegment seg) {
        return (int)Argon2_Context.saltlen$VH.get(seg);
    }
    public static void saltlen$set( MemorySegment seg, int x) {
        Argon2_Context.saltlen$VH.set(seg, x);
    }
    public static int saltlen$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.saltlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void saltlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.saltlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle secret$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("secret"));
    public static VarHandle secret$VH() {
        return Argon2_Context.secret$VH;
    }
    public static MemoryAddress secret$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.secret$VH.get(seg);
    }
    public static void secret$set( MemorySegment seg, MemoryAddress x) {
        Argon2_Context.secret$VH.set(seg, x);
    }
    public static MemoryAddress secret$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.secret$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void secret$set(MemorySegment seg, long index, MemoryAddress x) {
        Argon2_Context.secret$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle secretlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("secretlen"));
    public static VarHandle secretlen$VH() {
        return Argon2_Context.secretlen$VH;
    }
    public static int secretlen$get(MemorySegment seg) {
        return (int)Argon2_Context.secretlen$VH.get(seg);
    }
    public static void secretlen$set( MemorySegment seg, int x) {
        Argon2_Context.secretlen$VH.set(seg, x);
    }
    public static int secretlen$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.secretlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void secretlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.secretlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ad$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ad"));
    public static VarHandle ad$VH() {
        return Argon2_Context.ad$VH;
    }
    public static MemoryAddress ad$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.ad$VH.get(seg);
    }
    public static void ad$set( MemorySegment seg, MemoryAddress x) {
        Argon2_Context.ad$VH.set(seg, x);
    }
    public static MemoryAddress ad$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.ad$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ad$set(MemorySegment seg, long index, MemoryAddress x) {
        Argon2_Context.ad$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle adlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("adlen"));
    public static VarHandle adlen$VH() {
        return Argon2_Context.adlen$VH;
    }
    public static int adlen$get(MemorySegment seg) {
        return (int)Argon2_Context.adlen$VH.get(seg);
    }
    public static void adlen$set( MemorySegment seg, int x) {
        Argon2_Context.adlen$VH.set(seg, x);
    }
    public static int adlen$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.adlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void adlen$set(MemorySegment seg, long index, int x) {
        Argon2_Context.adlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle t_cost$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("t_cost"));
    public static VarHandle t_cost$VH() {
        return Argon2_Context.t_cost$VH;
    }
    public static int t_cost$get(MemorySegment seg) {
        return (int)Argon2_Context.t_cost$VH.get(seg);
    }
    public static void t_cost$set( MemorySegment seg, int x) {
        Argon2_Context.t_cost$VH.set(seg, x);
    }
    public static int t_cost$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.t_cost$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void t_cost$set(MemorySegment seg, long index, int x) {
        Argon2_Context.t_cost$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m_cost$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m_cost"));
    public static VarHandle m_cost$VH() {
        return Argon2_Context.m_cost$VH;
    }
    public static int m_cost$get(MemorySegment seg) {
        return (int)Argon2_Context.m_cost$VH.get(seg);
    }
    public static void m_cost$set( MemorySegment seg, int x) {
        Argon2_Context.m_cost$VH.set(seg, x);
    }
    public static int m_cost$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.m_cost$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m_cost$set(MemorySegment seg, long index, int x) {
        Argon2_Context.m_cost$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lanes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lanes"));
    public static VarHandle lanes$VH() {
        return Argon2_Context.lanes$VH;
    }
    public static int lanes$get(MemorySegment seg) {
        return (int)Argon2_Context.lanes$VH.get(seg);
    }
    public static void lanes$set( MemorySegment seg, int x) {
        Argon2_Context.lanes$VH.set(seg, x);
    }
    public static int lanes$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.lanes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lanes$set(MemorySegment seg, long index, int x) {
        Argon2_Context.lanes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle threads$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("threads"));
    public static VarHandle threads$VH() {
        return Argon2_Context.threads$VH;
    }
    public static int threads$get(MemorySegment seg) {
        return (int)Argon2_Context.threads$VH.get(seg);
    }
    public static void threads$set( MemorySegment seg, int x) {
        Argon2_Context.threads$VH.set(seg, x);
    }
    public static int threads$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.threads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void threads$set(MemorySegment seg, long index, int x) {
        Argon2_Context.threads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("version"));
    public static VarHandle version$VH() {
        return Argon2_Context.version$VH;
    }
    public static int version$get(MemorySegment seg) {
        return (int)Argon2_Context.version$VH.get(seg);
    }
    public static void version$set( MemorySegment seg, int x) {
        Argon2_Context.version$VH.set(seg, x);
    }
    public static int version$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void version$set(MemorySegment seg, long index, int x) {
        Argon2_Context.version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle allocate_cbk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("allocate_cbk"));
    public static VarHandle allocate_cbk$VH() {
        return Argon2_Context.allocate_cbk$VH;
    }
    public static MemoryAddress allocate_cbk$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.allocate_cbk$VH.get(seg);
    }
    public static void allocate_cbk$set( MemorySegment seg, MemoryAddress x) {
        Argon2_Context.allocate_cbk$VH.set(seg, x);
    }
    public static MemoryAddress allocate_cbk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.allocate_cbk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void allocate_cbk$set(MemorySegment seg, long index, MemoryAddress x) {
        Argon2_Context.allocate_cbk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static allocate_fptr allocate_cbk (MemorySegment segment, MemorySession session) {
        return allocate_fptr.ofAddress(allocate_cbk$get(segment), session);
    }
    static final VarHandle free_cbk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("free_cbk"));
    public static VarHandle free_cbk$VH() {
        return Argon2_Context.free_cbk$VH;
    }
    public static MemoryAddress free_cbk$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.free_cbk$VH.get(seg);
    }
    public static void free_cbk$set( MemorySegment seg, MemoryAddress x) {
        Argon2_Context.free_cbk$VH.set(seg, x);
    }
    public static MemoryAddress free_cbk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)Argon2_Context.free_cbk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void free_cbk$set(MemorySegment seg, long index, MemoryAddress x) {
        Argon2_Context.free_cbk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static deallocate_fptr free_cbk (MemorySegment segment, MemorySession session) {
        return deallocate_fptr.ofAddress(free_cbk$get(segment), session);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return Argon2_Context.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)Argon2_Context.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        Argon2_Context.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)Argon2_Context.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        Argon2_Context.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


