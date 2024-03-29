package com.zylquinal.argon2.internal;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct {
 *     long long __clang_max_align_nonce1;
 *     long double __clang_max_align_nonce2;
 * };
 * }
 */
public class max_align_t {

    public static MemoryLayout $LAYOUT() {
        return constants$0.const$1;
    }
    public static VarHandle __clang_max_align_nonce1$VH() {
        return constants$0.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long __clang_max_align_nonce1;
     * }
     */
    public static long __clang_max_align_nonce1$get(MemorySegment seg) {
        return (long)constants$0.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long __clang_max_align_nonce1;
     * }
     */
    public static void __clang_max_align_nonce1$set(MemorySegment seg, long x) {
        constants$0.const$2.set(seg, x);
    }
    public static long __clang_max_align_nonce1$get(MemorySegment seg, long index) {
        return (long)constants$0.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void __clang_max_align_nonce1$set(MemorySegment seg, long index, long x) {
        constants$0.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


