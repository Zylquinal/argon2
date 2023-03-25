package com.zylquinal.argon2;

import com.zylquinal.argon2.api.Argon;
import com.zylquinal.argon2.api.ArgonConfig;
import com.zylquinal.argon2.api.ComputedHash;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Argon2Test {

    private static final ArgonConfig CONFIG = ArgonConfig.of(65536, 1, 2);
    private static final Argon argon = Argon.of(CONFIG);

    private static final byte[] PASSWORD = { 112, 97, 115, 115, 119, 111, 114, 100 }; // in string: password
    private static final byte[] SALT = { 116, 104, 101, 112, 97, 115, 115, 119, 111, 114, 100, 115, 97, 108, 116 }; // in string: thepasswordsalt
    private static final byte[] SECRET = { 115, 101, 99, 114, 101, 116 };
    private static final byte[] ASSOCIATED_DATA = { 97, 115, 115, 111, 99, 105, 97, 116, 101, 100, 68, 97, 116, 97 };

    private static final byte[] RAW = {
            -58, -51, 110, 67, -9, 88, 78, 64, 93, -37, 37, -33, 85, -108, 96, -89,
            87, 80, -55, -87, 8, 79, -16, -78, 101, -47, -105, 41, -93, 17, -124, 122
    };

    private static final byte[] RAW_WS2AD = {
            70, -85, -125, 101, 44, -29, -115, 57, -106, 116, -11, 43, 102, 69, -91, 83,
            -13, -1, 112, 25, 115, 75, -124, -101, 32, -58, 119, -124, -37, 117, 56, 126
    };

    private static final String ENCODED = "$argon2id$v=19$m=65536,t=2,p=1$dGhlcGFzc3dvcmRzYWx0$xs1uQ/dYTkBd2yXfVZRgp1dQyakIT/CyZdGXKaMRhHo";
    private static final String ENCODED_WS2AD = "$argon2id$v=19$m=65536,t=2,p=1$dGhlcGFzc3dvcmRzYWx0$RquDZSzjjTmWdPUrZkWlU/P/cBlzS4SbIMZ3hNt1OH4";

    @Test
    public void testHashing() {
        ComputedHash hash = argon.hash(PASSWORD, SALT);
        assert Arrays.equals(hash.raw(), RAW);
        assert hash.encode().equals(ENCODED);
    }

    @Test
    public void testVerify() {
        assert argon.verify(RAW, SALT, PASSWORD);
        assert argon.verify(ENCODED, PASSWORD);
    }

    @Test
    public void testWIthSecretAndAssociatedData() {
        ComputedHash hash = argon.hash(PASSWORD, SALT, SECRET, ASSOCIATED_DATA);
        assert Arrays.equals(hash.raw(), RAW_WS2AD);
        assert hash.encode().equals(ENCODED_WS2AD);
    }

    @Test
    public void testVerifyWIthSecretAndAssociatedData() {
        assert argon.verify(RAW_WS2AD, PASSWORD, SALT, SECRET, ASSOCIATED_DATA);
        assert argon.verify(ENCODED_WS2AD, PASSWORD, SECRET, ASSOCIATED_DATA);
    }

}
