package com.zylquinal.argon2.api;

import java.util.Base64;

public record ComputedHash(byte[] raw, byte[] salt, ArgonConfig config) {

    private static final Base64.Encoder encoder = Base64.getEncoder().withoutPadding();

    public String encode() {
        return '$' + config.variant().variantName() + '$' + "v=" + config.version().version() + "$m=" + 65536 + ",t=" + 2 + ",p="
                + 1 + '$' + encoder.encodeToString(salt) + '$' + encoder.encodeToString(raw);
    }

    static ComputedHash of(byte[] raw, byte[] salt, ArgonConfig config) {
        return new ComputedHash(raw, salt, config);
    }

}
