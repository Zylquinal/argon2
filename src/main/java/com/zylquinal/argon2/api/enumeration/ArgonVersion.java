package com.zylquinal.argon2.api.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum ArgonVersion {
    VERSION_10(0x10),
    VERSION_13(0x13),
    DEFAULT(VERSION_13.version);

    private static final Map<Integer, ArgonVersion> VERSION_MAP = Map.ofEntries(
            Map.entry(VERSION_10.version, VERSION_10),
            Map.entry(VERSION_13.version, VERSION_13)
    );

    private final int version;

    public static ArgonVersion of(int version) {
        return VERSION_MAP.getOrDefault(version, DEFAULT);
    }

}
