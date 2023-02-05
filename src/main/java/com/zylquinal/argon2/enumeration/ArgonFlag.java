package com.zylquinal.argon2.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum ArgonFlag {
    DEFAULT(0),
    CLEAR_PASSWORD(1),
    CLEAR_SECRET(1  << 1),

    CLEAR_ALL(CLEAR_PASSWORD.value | CLEAR_SECRET.value);

    private final int value;

}
