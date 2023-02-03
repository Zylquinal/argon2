package com.zylquinal.argon2.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor
public enum ArgonVariant {
    ARGON_2D(0, "argon2d"),
    ARGON_2I(1, "argon2i"),
    ARGON_2ID(2, "argon2id"),
    DEFAULT(ARGON_2ID.variant, ARGON_2ID.variantName);

    private final int variant;
    private final String variantName;

}
