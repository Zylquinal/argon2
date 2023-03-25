package com.zylquinal.argon2.internal;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;

/**
 * {@snippet :
 * void (*deallocate_fptr)(unsigned char* memory,unsigned long bytes_to_allocate);
 *}
 */
public interface deallocate_fptr {

    static MemorySegment allocate(deallocate_fptr fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$0.deallocate_fptr_UP$MH, fi, constants$0.deallocate_fptr$FUNC, scope);
    }

    static deallocate_fptr ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (MemorySegment _memory, long _bytes_to_allocate) -> {
            try {
                constants$0.deallocate_fptr_DOWN$MH.invokeExact(symbol, _memory, _bytes_to_allocate);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }

    void apply(MemorySegment memory, long bytes_to_allocate);
}


