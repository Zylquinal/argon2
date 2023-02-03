package com.zylquinal.argon2.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum ArgonVersion {
    VERSION_10(0x10),
    VERSION_13(0x13),
    DEFAULT(VERSION_13.version);

    private final int version;

}
