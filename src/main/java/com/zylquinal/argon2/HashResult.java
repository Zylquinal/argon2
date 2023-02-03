package com.zylquinal.argon2;

public interface HashResult {

    byte[] raw();

    byte[] salt();

    String encoded();

    static HashResult of(byte[] raw, byte[] salt, String encoded) {
        return new HashResultImpl(raw, salt, encoded);
    }

    record HashResultImpl(byte[] raw, byte[] salt, String encoded) implements HashResult {

    }

}
