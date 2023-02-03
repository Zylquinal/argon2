package com.zylquinal.argon2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Argon2Test {

    private static final Argon2 argon2 = Argon2.create(2, 65536, 1);

    private static final byte[] PASSWORD = "password".getBytes();
    private static final byte[] SALT = "thepasswordsalt".getBytes();

    private static final byte[] RAW = {
            -58, -51, 110, 67, -9, 88, 78, 64, 93, -37, 37, -33, 85, -108, 96, -89,
            87, 80, -55, -87, 8, 79, -16, -78, 101, -47, -105, 41, -93, 17, -124, 122
    };
    private static final String ENCODED = "$argon2id$v=19$m=65536,t=2,p=1$dGhlcGFzc3dvcmRzYWx0$xs1uQ/dYTkBd2yXfVZRgp1dQyakIT/CyZdGXKaMRhHo";

    @Test
    public void testRaw() {
        var raw = argon2.hashRaw(PASSWORD, SALT);
        assert Arrays.equals(raw, RAW);
    }

    @Test
    public void testEncoded() {
        var encoded = argon2.hashEncoded(PASSWORD, SALT);
        assert encoded.equals(ENCODED);
    }

    @Test
    public void testVerify() {
        assert argon2.verify(ENCODED, PASSWORD);
    }

}
