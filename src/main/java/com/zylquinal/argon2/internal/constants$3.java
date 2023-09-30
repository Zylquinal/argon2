package com.zylquinal.argon2.internal;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3() {}
    static final VarHandle const$0 = constants$1.const$5.varHandle(PathElement.groupElement("secret"));
    static final VarHandle const$1 = constants$1.const$5.varHandle(PathElement.groupElement("secretlen"));
    static final VarHandle const$2 = constants$1.const$5.varHandle(PathElement.groupElement("ad"));
    static final VarHandle const$3 = constants$1.const$5.varHandle(PathElement.groupElement("adlen"));
    static final VarHandle const$4 = constants$1.const$5.varHandle(PathElement.groupElement("t_cost"));
    static final VarHandle const$5 = constants$1.const$5.varHandle(PathElement.groupElement("m_cost"));
}


