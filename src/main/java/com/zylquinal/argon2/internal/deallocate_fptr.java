package com.zylquinal.argon2.internal;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*deallocate_fptr)(unsigned char* memory,unsigned long bytes_to_allocate);
 * }
 */
public interface deallocate_fptr {

    void apply(MemorySegment memory, long bytes_to_allocate);
    static MemorySegment allocate(deallocate_fptr fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1.const$3, fi, constants$1.const$2, scope);
    }
    static deallocate_fptr ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (MemorySegment _memory, long _bytes_to_allocate) -> {
            try {
                constants$1.const$4.invokeExact(symbol, _memory, _bytes_to_allocate);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


