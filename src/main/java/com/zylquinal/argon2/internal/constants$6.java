package com.zylquinal.argon2.internal;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$6 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$6() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "argon2i_hash_raw",
        constants$6.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "argon2d_hash_encoded",
        constants$5.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "argon2d_hash_raw",
        constants$6.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "argon2id_hash_encoded",
        constants$5.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "argon2id_hash_raw",
        constants$6.const$0
    );
}


