package com.zylquinal.argon2.internal;


import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

final class constants$4 {

    static final FunctionDescriptor argon2_verify_ctx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle argon2_verify_ctx$MH = RuntimeHelper.downcallHandle(
            "argon2_verify_ctx",
            constants$4.argon2_verify_ctx$FUNC
    );
    static final FunctionDescriptor argon2_error_message$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
            Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle argon2_error_message$MH = RuntimeHelper.downcallHandle(
            "argon2_error_message",
            constants$4.argon2_error_message$FUNC
    );
    static final FunctionDescriptor argon2_encodedlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT,
            Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle argon2_encodedlen$MH = RuntimeHelper.downcallHandle(
            "argon2_encodedlen",
            constants$4.argon2_encodedlen$FUNC
    );
    static final MemorySegment NULL$ADDR = MemorySegment.ofAddress(0L);
    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4() {
    }
}


