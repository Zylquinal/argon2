package com.zylquinal.argon2.internal;

import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.PathElement;
final class constants$4 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4() {}
    static final VarHandle const$0 = constants$1.const$5.varHandle(PathElement.groupElement("lanes"));
    static final VarHandle const$1 = constants$1.const$5.varHandle(PathElement.groupElement("threads"));
    static final VarHandle const$2 = constants$1.const$5.varHandle(PathElement.groupElement("version"));
    static final VarHandle const$3 = constants$1.const$5.varHandle(PathElement.groupElement("allocate_cbk"));
    static final VarHandle const$4 = constants$1.const$5.varHandle(PathElement.groupElement("free_cbk"));
    static final VarHandle const$5 = constants$1.const$5.varHandle(PathElement.groupElement("flags"));
}


