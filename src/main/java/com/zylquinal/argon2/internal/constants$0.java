package com.zylquinal.argon2.internal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.OfInt;
class constants$0 {

    static final  OfInt FLAG_clear_internal_memory$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle FLAG_clear_internal_memory$VH = constants$0.FLAG_clear_internal_memory$LAYOUT.varHandle();
    static final MemorySegment FLAG_clear_internal_memory$SEGMENT = RuntimeHelper.lookupGlobalVariable("FLAG_clear_internal_memory", constants$0.FLAG_clear_internal_memory$LAYOUT);
    static final FunctionDescriptor allocate_fptr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle allocate_fptr$MH = RuntimeHelper.downcallHandle(
        constants$0.allocate_fptr$FUNC
    );
    static final FunctionDescriptor deallocate_fptr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle deallocate_fptr$MH = RuntimeHelper.downcallHandle(
        constants$0.deallocate_fptr$FUNC
    );
    static final FunctionDescriptor argon2_type2string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle argon2_type2string$MH = RuntimeHelper.downcallHandle(
        "argon2_type2string",
        constants$0.argon2_type2string$FUNC
    );
}


