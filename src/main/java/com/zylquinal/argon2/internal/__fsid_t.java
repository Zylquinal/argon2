package com.zylquinal.argon2.internal;

import java.lang.foreign.*;

/**
 * {@snippet :
 * struct __fsid_t {
 *     int __val[2];
 * };
 *}
 */
public class __fsid_t {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("__val")
    ).withName("__fsid_t");

    public static MemoryLayout $LAYOUT() {
        return __fsid_t.$struct$LAYOUT;
    }

    public static MemorySegment __val$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
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
}


