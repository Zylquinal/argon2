package com.zylquinal.argon2.internal;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
public interface allocate_fptr {

    int apply(java.lang.foreign.MemoryAddress memory, long bytes_to_allocate);
    static MemorySegment allocate(allocate_fptr fi, MemorySession session) {
        return RuntimeHelper.upcallStub(allocate_fptr.class, fi, constants$0.allocate_fptr$FUNC, session);
    }
    static allocate_fptr ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _memory, long _bytes_to_allocate) -> {
            try {
                return (int)constants$0.allocate_fptr$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_memory, _bytes_to_allocate);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


