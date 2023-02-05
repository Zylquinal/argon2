package com.zylquinal.argon2;

import com.zylquinal.argon2.enumeration.ArgonFlag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Argon2Test {

    private static final Argon2 argon2 = Argon2.create(2, 65536, 1);

    private static final byte[] PASSWORD = "password".getBytes();
    private static final byte[] SALT = "thepasswordsalt".getBytes();
    private static final byte[] secret = "secret".getBytes();
    private static final byte[] associatedData = "associatedData".getBytes();

    private static final byte[] RAW = {
            -58, -51, 110, 67, -9, 88, 78, 64, 93, -37, 37, -33, 85, -108, 96, -89,
            87, 80, -55, -87, 8, 79, -16, -78, 101, -47, -105, 41, -93, 17, -124, 122
    };

    private static final byte[] RAW_CONTEXT = {
            70, -85, -125, 101, 44, -29, -115, 57, -106, 116, -11, 43, 102, 69, -91, 83,
            -13, -1, 112, 25, 115, 75, -124, -101, 32, -58, 119, -124, -37, 117, 56, 126
    };

    private static final String ENCODED = "$argon2id$v=19$m=65536,t=2,p=1$dGhlcGFzc3dvcmRzYWx0$xs1uQ/dYTkBd2yXfVZRgp1dQyakIT/CyZdGXKaMRhHo";
    private static final String ENCODED_CONTEXT = "$argon2id$v=19$m=65536,t=2,p=1$dGhlcGFzc3dvcmRzYWx0$RquDZSzjjTmWdPUrZkWlU/P/cBlzS4SbIMZ3hNt1OH4";

    @Test
    public void verifyRawContext() {
        var raw = argon2.hashRaw(Arrays.copyOf(PASSWORD, PASSWORD.length), SALT, 32, secret, associatedData, ArgonFlag.CLEAR_ALL);
        assert Arrays.equals(raw, RAW_CONTEXT);
    }

    @Test
    public void verifyEncodedContext() {
        assert argon2.verify(ENCODED_CONTEXT, Arrays.copyOf(PASSWORD, PASSWORD.length), secret, associatedData);
    }

    @Test
    public void verifyRaw() {
        var raw = argon2.hashRaw(Arrays.copyOf(PASSWORD, PASSWORD.length), SALT);
        assert Arrays.equals(raw, RAW);
    }

    @Test
    public void verifyEncoded() {
        var encoded = argon2.hashEncoded(Arrays.copyOf(PASSWORD, PASSWORD.length), SALT);
        assert encoded.equals(ENCODED);
    }

    @Test
    public void testVerify() {
        assert argon2.verify(ENCODED, Arrays.copyOf(PASSWORD, PASSWORD.length));
    }

}
