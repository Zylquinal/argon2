package com.zylquinal.argon2.internal;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("__val")
    ).withName("");
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_LONG.withName("__clang_max_align_nonce1"),
        MemoryLayout.paddingLayout(8),
        MemoryLayout.paddingLayout(16).withName("__clang_max_align_nonce2")
    ).withName("");
    static final VarHandle const$2 = constants$0.const$1.varHandle(PathElement.groupElement("__clang_max_align_nonce1"));
    static final VarHandle const$3 = JAVA_INT.varHandle();
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("FLAG_clear_internal_memory", JAVA_INT);
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
}


