package com.zylquinal.argon2.internal;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2() {}
    static final VarHandle const$0 = constants$1.const$5.varHandle(PathElement.groupElement("out"));
    static final VarHandle const$1 = constants$1.const$5.varHandle(PathElement.groupElement("outlen"));
    static final VarHandle const$2 = constants$1.const$5.varHandle(PathElement.groupElement("pwd"));
    static final VarHandle const$3 = constants$1.const$5.varHandle(PathElement.groupElement("pwdlen"));
    static final VarHandle const$4 = constants$1.const$5.varHandle(PathElement.groupElement("salt"));
    static final VarHandle const$5 = constants$1.const$5.varHandle(PathElement.groupElement("saltlen"));
}


