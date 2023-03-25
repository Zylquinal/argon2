package com.zylquinal.argon2.internal;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;

/**
 * {@snippet :
 * int (*allocate_fptr)(unsigned char** memory,unsigned long bytes_to_allocate);
 *}
 */
public interface allocate_fptr {

    static MemorySegment allocate(allocate_fptr fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$0.allocate_fptr_UP$MH, fi, constants$0.allocate_fptr$FUNC, scope);
    }

    static allocate_fptr ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (MemorySegment _memory, long _bytes_to_allocate) -> {
            try {
                return (int) constants$0.allocate_fptr_DOWN$MH.invokeExact(symbol, _memory, _bytes_to_allocate);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }

    int apply(MemorySegment memory, long bytes_to_allocate);
}


