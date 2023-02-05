package com.zylquinal.argon2.internal;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
public class max_align_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("__clang_max_align_nonce1"),
        MemoryLayout.paddingLayout(64),
        MemoryLayout.paddingLayout(128).withName("__clang_max_align_nonce2")
    );
    public static MemoryLayout $LAYOUT() {
        return max_align_t.$struct$LAYOUT;
    }
    static final VarHandle __clang_max_align_nonce1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__clang_max_align_nonce1"));
    public static VarHandle __clang_max_align_nonce1$VH() {
        return max_align_t.__clang_max_align_nonce1$VH;
    }
    public static long __clang_max_align_nonce1$get(MemorySegment seg) {
        return (long)max_align_t.__clang_max_align_nonce1$VH.get(seg);
    }
    public static void __clang_max_align_nonce1$set( MemorySegment seg, long x) {
        max_align_t.__clang_max_align_nonce1$VH.set(seg, x);
    }
    public static long __clang_max_align_nonce1$get(MemorySegment seg, long index) {
        return (long)max_align_t.__clang_max_align_nonce1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __clang_max_align_nonce1$set(MemorySegment seg, long index, long x) {
        max_align_t.__clang_max_align_nonce1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


