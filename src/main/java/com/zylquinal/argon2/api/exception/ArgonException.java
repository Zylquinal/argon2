package com.zylquinal.argon2.api.exception;

import com.zylquinal.argon2.api.enumeration.ArgonStatus;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class ArgonException extends RuntimeException {

    private final ArgonStatus status;

    public ArgonException(ArgonStatus status) {
        super(status.name());
        this.status = status;
    }

}
