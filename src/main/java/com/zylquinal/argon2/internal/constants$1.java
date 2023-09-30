package com.zylquinal.argon2.internal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(allocate_fptr.class, "apply", constants$0.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$0.const$5
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(deallocate_fptr.class, "apply", constants$1.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$1.const$2
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("out"),
        JAVA_INT.withName("outlen"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pwd"),
        JAVA_INT.withName("pwdlen"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("salt"),
        JAVA_INT.withName("saltlen"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("secret"),
        JAVA_INT.withName("secretlen"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("ad"),
        JAVA_INT.withName("adlen"),
        JAVA_INT.withName("t_cost"),
        JAVA_INT.withName("m_cost"),
        JAVA_INT.withName("lanes"),
        JAVA_INT.withName("threads"),
        JAVA_INT.withName("version"),
        RuntimeHelper.POINTER.withName("allocate_cbk"),
        RuntimeHelper.POINTER.withName("free_cbk"),
        JAVA_INT.withName("flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("Argon2_Context");
}


