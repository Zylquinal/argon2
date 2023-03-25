package com.zylquinal.argon2.api;

import com.zylquinal.argon2.api.enumeration.ArgonFlag;
import com.zylquinal.argon2.api.enumeration.ArgonVariant;
import com.zylquinal.argon2.api.enumeration.ArgonVersion;
import lombok.Builder;

@Builder
public record ArgonConfig(int hashLength, int memoryCost, int parallelism, int iterations, ArgonVersion version,
                          ArgonFlag flag, ArgonVariant variant) {

    public static ArgonConfig of(int memoryCost, int parallelism, int iterations) {
        return new ArgonConfig(ArgonConstant.DEFAULT_HASH_LENGTH, memoryCost, parallelism, iterations, ArgonVersion.DEFAULT,
                               ArgonFlag.DEFAULT, ArgonVariant.DEFAULT);
    }

    public static ArgonConfig of(int memoryCost, int parallelism, int iterations, ArgonVersion version, ArgonVariant variant) {
        return new ArgonConfig(ArgonConstant.DEFAULT_HASH_LENGTH, memoryCost, parallelism, iterations, version, ArgonFlag.DEFAULT,
                               ArgonVariant.DEFAULT);
    }

    public static ArgonConfig of(int hashLength, int memoryCost, int parallelism, int iterations) {
        return new ArgonConfig(hashLength, memoryCost, parallelism, iterations, ArgonVersion.DEFAULT, ArgonFlag.DEFAULT,
                               ArgonVariant.DEFAULT);
    }

    public static ArgonConfig of(int hashLength, int memoryCost, int parallelism, int iterations, ArgonVariant variant) {
        return new ArgonConfig(hashLength, memoryCost, parallelism, iterations, ArgonVersion.DEFAULT, ArgonFlag.DEFAULT,
                variant);
    }

    public static ArgonConfig of(int hashLength, int memoryCost, int parallelism, int iterations, ArgonVersion version,
                                 ArgonFlag flag) {
        return new ArgonConfig(hashLength, memoryCost, parallelism, iterations, version, flag, ArgonVariant.DEFAULT);
    }

    public static ArgonConfig of(int hashLength, int memoryCost, int parallelism, int iterations, ArgonVersion version,
                                 ArgonFlag flag, ArgonVariant variant) {
        return new ArgonConfig(hashLength, memoryCost, parallelism, iterations, version, flag, variant);
    }

}
