package com.zylquinal.argon2.internal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

final class constants$2 {

    static final FunctionDescriptor argon2id_hash_raw$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle argon2id_hash_raw$MH = RuntimeHelper.downcallHandle(
            "argon2id_hash_raw",
            constants$2.argon2id_hash_raw$FUNC
    );
    static final FunctionDescriptor argon2_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle argon2_hash$MH = RuntimeHelper.downcallHandle(
            "argon2_hash",
            constants$2.argon2_hash$FUNC
    );
    static final FunctionDescriptor argon2i_verify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle argon2i_verify$MH = RuntimeHelper.downcallHandle(
            "argon2i_verify",
            constants$2.argon2i_verify$FUNC
    );
    static final FunctionDescriptor argon2d_verify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle argon2d_verify$MH = RuntimeHelper.downcallHandle(
            "argon2d_verify",
            constants$2.argon2d_verify$FUNC
    );
    static final FunctionDescriptor argon2id_verify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle argon2id_verify$MH = RuntimeHelper.downcallHandle(
            "argon2id_verify",
            constants$2.argon2id_verify$FUNC
    );
    static final FunctionDescriptor argon2_verify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle argon2_verify$MH = RuntimeHelper.downcallHandle(
            "argon2_verify",
            constants$2.argon2_verify$FUNC
    );
    private constants$2() {
    }
}


