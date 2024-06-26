// Generated by jextract

package com.zylquinal.argon2.internal;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef struct Argon2_Context {
 *     uint8_t *out;
 *     uint32_t outlen;
 *     uint8_t *pwd;
 *     uint32_t pwdlen;
 *     uint8_t *salt;
 *     uint32_t saltlen;
 *     uint8_t *secret;
 *     uint32_t secretlen;
 *     uint8_t *ad;
 *     uint32_t adlen;
 *     uint32_t t_cost;
 *     uint32_t m_cost;
 *     uint32_t lanes;
 *     uint32_t threads;
 *     uint32_t version;
 *     allocate_fptr allocate_cbk;
 *     deallocate_fptr free_cbk;
 *     uint32_t flags;
 * } argon2_context
 * }
 */
public class argon2_context$0 extends Argon2_Context {

    argon2_context$0() {
        // Should not be called directly
    }
}

