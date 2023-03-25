package com.zylquinal.argon2.internal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

final class constants$3 {

    static final FunctionDescriptor argon2d_ctx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle argon2d_ctx$MH = RuntimeHelper.downcallHandle(
            "argon2d_ctx",
            constants$3.argon2d_ctx$FUNC
    );
    static final FunctionDescriptor argon2i_ctx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle argon2i_ctx$MH = RuntimeHelper.downcallHandle(
            "argon2i_ctx",
            constants$3.argon2i_ctx$FUNC
    );
    static final FunctionDescriptor argon2id_ctx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle argon2id_ctx$MH = RuntimeHelper.downcallHandle(
            "argon2id_ctx",
            constants$3.argon2id_ctx$FUNC
    );
    static final FunctionDescriptor argon2d_verify_ctx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle argon2d_verify_ctx$MH = RuntimeHelper.downcallHandle(
            "argon2d_verify_ctx",
            constants$3.argon2d_verify_ctx$FUNC
    );
    static final FunctionDescriptor argon2i_verify_ctx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle argon2i_verify_ctx$MH = RuntimeHelper.downcallHandle(
            "argon2i_verify_ctx",
            constants$3.argon2i_verify_ctx$FUNC
    );
    static final FunctionDescriptor argon2id_verify_ctx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle argon2id_verify_ctx$MH = RuntimeHelper.downcallHandle(
            "argon2id_verify_ctx",
            constants$3.argon2id_verify_ctx$FUNC
    );
    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3() {
    }
}


