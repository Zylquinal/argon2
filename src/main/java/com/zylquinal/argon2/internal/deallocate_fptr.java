package com.zylquinal.argon2.internal;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
public interface deallocate_fptr {

    void apply(java.lang.foreign.MemoryAddress memory, long bytes_to_allocate);
    static MemorySegment allocate(deallocate_fptr fi, MemorySession session) {
        return RuntimeHelper.upcallStub(deallocate_fptr.class, fi, constants$0.deallocate_fptr$FUNC, session);
    }
    static deallocate_fptr ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _memory, long _bytes_to_allocate) -> {
            try {
                constants$0.deallocate_fptr$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_memory, _bytes_to_allocate);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


