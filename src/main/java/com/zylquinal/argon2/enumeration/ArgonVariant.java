package com.zylquinal.argon2.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum ArgonVariant {
    ARGON_2D(0, "argon2d"),
    ARGON_2I(1, "argon2i"),
    ARGON_2ID(2, "argon2id"),
    DEFAULT(ARGON_2ID.variant, ARGON_2ID.variantName);

    private static final Map<String, ArgonVariant> VARIANT_MAP = Map.ofEntries(
            Map.entry(ARGON_2D.variantName, ARGON_2D),
            Map.entry(ARGON_2I.variantName, ARGON_2I),
            Map.entry(ARGON_2ID.variantName, ARGON_2ID)
    );

    private final int variant;
    private final String variantName;

    public static ArgonVariant of(String variantName) {
        return VARIANT_MAP.getOrDefault(variantName, DEFAULT);
    }

}
