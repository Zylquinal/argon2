package com.zylquinal.argon2.internal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$10 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$10() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "argon2_error_message",
        constants$10.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "argon2_encodedlen",
        constants$10.const$2
    );
    static final MemorySegment const$4 = MemorySegment.ofAddress(0L);
}


