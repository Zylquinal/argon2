package com.zylquinal.argon2.internal;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*allocate_fptr)(unsigned char** memory,unsigned long bytes_to_allocate);
 * }
 */
public interface allocate_fptr {

    int apply(MemorySegment memory, long bytes_to_allocate);
    static MemorySegment allocate(allocate_fptr fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1.const$0, fi, constants$0.const$5, scope);
    }
    static allocate_fptr ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (MemorySegment _memory, long _bytes_to_allocate) -> {
            try {
                return (int)constants$1.const$1.invokeExact(symbol, _memory, _bytes_to_allocate);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


