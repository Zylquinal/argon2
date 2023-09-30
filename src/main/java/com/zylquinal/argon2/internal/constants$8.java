package com.zylquinal.argon2.internal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$8 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$8() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "argon2_verify",
        constants$8.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "argon2d_ctx",
        constants$8.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "argon2i_ctx",
        constants$8.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "argon2id_ctx",
        constants$8.const$2
    );
}


