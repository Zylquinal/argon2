package com.zylquinal.argon2.internal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$9 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$9() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "argon2d_verify_ctx",
        constants$9.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "argon2i_verify_ctx",
        constants$9.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "argon2id_verify_ctx",
        constants$9.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "argon2_verify_ctx",
        constants$9.const$4
    );
}


