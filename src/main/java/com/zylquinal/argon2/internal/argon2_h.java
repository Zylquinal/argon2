package com.zylquinal.argon2.internal;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
public class argon2_h  {

    /* package-private */ argon2_h() {}
    public static OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static OfInt C_INT = Constants$root.C_INT$LAYOUT;
    public static OfLong C_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    public static int _STDINT_H() {
        return (int)1L;
    }
    public static int _FEATURES_H() {
        return (int)1L;
    }
    public static int _DEFAULT_SOURCE() {
        return (int)1L;
    }
    public static int __GLIBC_USE_ISOC2X() {
        return (int)0L;
    }
    public static int __USE_ISOC11() {
        return (int)1L;
    }
    public static int __USE_ISOC99() {
        return (int)1L;
    }
    public static int __USE_ISOC95() {
        return (int)1L;
    }
    public static int __USE_POSIX_IMPLICITLY() {
        return (int)1L;
    }
    public static int _POSIX_SOURCE() {
        return (int)1L;
    }
    public static int __USE_POSIX() {
        return (int)1L;
    }
    public static int __USE_POSIX2() {
        return (int)1L;
    }
    public static int __USE_POSIX199309() {
        return (int)1L;
    }
    public static int __USE_POSIX199506() {
        return (int)1L;
    }
    public static int __USE_XOPEN2K() {
        return (int)1L;
    }
    public static int __USE_XOPEN2K8() {
        return (int)1L;
    }
    public static int _ATFILE_SOURCE() {
        return (int)1L;
    }
    public static int __WORDSIZE() {
        return (int)64L;
    }
    public static int __WORDSIZE_TIME64_COMPAT32() {
        return (int)1L;
    }
    public static int __SYSCALL_WORDSIZE() {
        return (int)64L;
    }
    public static int __USE_MISC() {
        return (int)1L;
    }
    public static int __USE_ATFILE() {
        return (int)1L;
    }
    public static int __USE_FORTIFY_LEVEL() {
        return (int)0L;
    }
    public static int __GLIBC_USE_DEPRECATED_GETS() {
        return (int)0L;
    }
    public static int __GLIBC_USE_DEPRECATED_SCANF() {
        return (int)0L;
    }
    public static int _STDC_PREDEF_H() {
        return (int)1L;
    }
    public static int __STDC_IEC_559__() {
        return (int)1L;
    }
    public static int __STDC_IEC_559_COMPLEX__() {
        return (int)1L;
    }
    public static int __GNU_LIBRARY__() {
        return (int)6L;
    }
    public static int __GLIBC__() {
        return (int)2L;
    }
    public static int __GLIBC_MINOR__() {
        return (int)35L;
    }
    public static int _SYS_CDEFS_H() {
        return (int)1L;
    }
    public static int __glibc_c99_flexarr_available() {
        return (int)1L;
    }
    public static int __LDOUBLE_REDIRECTS_TO_FLOAT128_ABI() {
        return (int)0L;
    }
    public static int __HAVE_GENERIC_SELECTION() {
        return (int)1L;
    }
    public static int __GLIBC_USE_LIB_EXT2() {
        return (int)0L;
    }
    public static int __GLIBC_USE_IEC_60559_BFP_EXT() {
        return (int)0L;
    }
    public static int __GLIBC_USE_IEC_60559_BFP_EXT_C2X() {
        return (int)0L;
    }
    public static int __GLIBC_USE_IEC_60559_EXT() {
        return (int)0L;
    }
    public static int __GLIBC_USE_IEC_60559_FUNCS_EXT() {
        return (int)0L;
    }
    public static int __GLIBC_USE_IEC_60559_FUNCS_EXT_C2X() {
        return (int)0L;
    }
    public static int __GLIBC_USE_IEC_60559_TYPES_EXT() {
        return (int)0L;
    }
    public static int _BITS_TYPES_H() {
        return (int)1L;
    }
    public static int _BITS_TYPESIZES_H() {
        return (int)1L;
    }
    public static int __OFF_T_MATCHES_OFF64_T() {
        return (int)1L;
    }
    public static int __INO_T_MATCHES_INO64_T() {
        return (int)1L;
    }
    public static int __RLIM_T_MATCHES_RLIM64_T() {
        return (int)1L;
    }
    public static int __STATFS_MATCHES_STATFS64() {
        return (int)1L;
    }
    public static int __KERNEL_OLD_TIMEVAL_MATCHES_TIMEVAL64() {
        return (int)1L;
    }
    public static int __FD_SETSIZE() {
        return (int)1024L;
    }
    public static int _BITS_TIME64_H() {
        return (int)1L;
    }
    public static int _BITS_WCHAR_H() {
        return (int)1L;
    }
    public static int _BITS_STDINT_INTN_H() {
        return (int)1L;
    }
    public static int _BITS_STDINT_UINTN_H() {
        return (int)1L;
    }
    public static int _LIBC_LIMITS_H_() {
        return (int)1L;
    }
    public static int MB_LEN_MAX() {
        return (int)16L;
    }
    public static int _BITS_POSIX1_LIM_H() {
        return (int)1L;
    }
    public static int _POSIX_AIO_LISTIO_MAX() {
        return (int)2L;
    }
    public static int _POSIX_AIO_MAX() {
        return (int)1L;
    }
    public static int _POSIX_ARG_MAX() {
        return (int)4096L;
    }
    public static int _POSIX_CHILD_MAX() {
        return (int)25L;
    }
    public static int _POSIX_DELAYTIMER_MAX() {
        return (int)32L;
    }
    public static int _POSIX_HOST_NAME_MAX() {
        return (int)255L;
    }
    public static int _POSIX_LINK_MAX() {
        return (int)8L;
    }
    public static int _POSIX_LOGIN_NAME_MAX() {
        return (int)9L;
    }
    public static int _POSIX_MAX_CANON() {
        return (int)255L;
    }
    public static int _POSIX_MAX_INPUT() {
        return (int)255L;
    }
    public static int _POSIX_MQ_OPEN_MAX() {
        return (int)8L;
    }
    public static int _POSIX_MQ_PRIO_MAX() {
        return (int)32L;
    }
    public static int _POSIX_NAME_MAX() {
        return (int)14L;
    }
    public static int _POSIX_NGROUPS_MAX() {
        return (int)8L;
    }
    public static int _POSIX_OPEN_MAX() {
        return (int)20L;
    }
    public static int _POSIX_PATH_MAX() {
        return (int)256L;
    }
    public static int _POSIX_PIPE_BUF() {
        return (int)512L;
    }
    public static int _POSIX_RE_DUP_MAX() {
        return (int)255L;
    }
    public static int _POSIX_RTSIG_MAX() {
        return (int)8L;
    }
    public static int _POSIX_SEM_NSEMS_MAX() {
        return (int)256L;
    }
    public static int _POSIX_SEM_VALUE_MAX() {
        return (int)32767L;
    }
    public static int _POSIX_SIGQUEUE_MAX() {
        return (int)32L;
    }
    public static int _POSIX_SSIZE_MAX() {
        return (int)32767L;
    }
    public static int _POSIX_STREAM_MAX() {
        return (int)8L;
    }
    public static int _POSIX_SYMLINK_MAX() {
        return (int)255L;
    }
    public static int _POSIX_SYMLOOP_MAX() {
        return (int)8L;
    }
    public static int _POSIX_TIMER_MAX() {
        return (int)32L;
    }
    public static int _POSIX_TTY_NAME_MAX() {
        return (int)9L;
    }
    public static int _POSIX_TZNAME_MAX() {
        return (int)6L;
    }
    public static int _POSIX_CLOCKRES_MIN() {
        return (int)20000000L;
    }
    public static int NR_OPEN() {
        return (int)1024L;
    }
    public static int NGROUPS_MAX() {
        return (int)65536L;
    }
    public static int ARG_MAX() {
        return (int)131072L;
    }
    public static int LINK_MAX() {
        return (int)127L;
    }
    public static int MAX_CANON() {
        return (int)255L;
    }
    public static int MAX_INPUT() {
        return (int)255L;
    }
    public static int NAME_MAX() {
        return (int)255L;
    }
    public static int PATH_MAX() {
        return (int)4096L;
    }
    public static int PIPE_BUF() {
        return (int)4096L;
    }
    public static int XATTR_NAME_MAX() {
        return (int)255L;
    }
    public static int XATTR_SIZE_MAX() {
        return (int)65536L;
    }
    public static int XATTR_LIST_MAX() {
        return (int)65536L;
    }
    public static int RTSIG_MAX() {
        return (int)32L;
    }
    public static int _POSIX_THREAD_KEYS_MAX() {
        return (int)128L;
    }
    public static int PTHREAD_KEYS_MAX() {
        return (int)1024L;
    }
    public static int _POSIX_THREAD_DESTRUCTOR_ITERATIONS() {
        return (int)4L;
    }
    public static int _POSIX_THREAD_THREADS_MAX() {
        return (int)64L;
    }
    public static int AIO_PRIO_DELTA_MAX() {
        return (int)20L;
    }
    public static int PTHREAD_STACK_MIN() {
        return (int)16384L;
    }
    public static int DELAYTIMER_MAX() {
        return (int)2147483647L;
    }
    public static int TTY_NAME_MAX() {
        return (int)32L;
    }
    public static int LOGIN_NAME_MAX() {
        return (int)256L;
    }
    public static int HOST_NAME_MAX() {
        return (int)64L;
    }
    public static int MQ_PRIO_MAX() {
        return (int)32768L;
    }
    public static int _BITS_POSIX2_LIM_H() {
        return (int)1L;
    }
    public static int _POSIX2_BC_BASE_MAX() {
        return (int)99L;
    }
    public static int _POSIX2_BC_DIM_MAX() {
        return (int)2048L;
    }
    public static int _POSIX2_BC_SCALE_MAX() {
        return (int)99L;
    }
    public static int _POSIX2_BC_STRING_MAX() {
        return (int)1000L;
    }
    public static int _POSIX2_COLL_WEIGHTS_MAX() {
        return (int)2L;
    }
    public static int _POSIX2_EXPR_NEST_MAX() {
        return (int)32L;
    }
    public static int _POSIX2_LINE_MAX() {
        return (int)2048L;
    }
    public static int _POSIX2_RE_DUP_MAX() {
        return (int)255L;
    }
    public static int _POSIX2_CHARCLASS_NAME_MAX() {
        return (int)14L;
    }
    public static int COLL_WEIGHTS_MAX() {
        return (int)255L;
    }
    public static int CHARCLASS_NAME_MAX() {
        return (int)2048L;
    }
    public static OfShort __int16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt __int32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong __int64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfShort __int_least16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt __int_least32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong __int_least64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __quad_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __intmax_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __off_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __off64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt __pid_t = Constants$root.C_INT$LAYOUT;
    public static OfLong __clock_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __time_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __suseconds_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __suseconds64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt __daddr_t = Constants$root.C_INT$LAYOUT;
    public static OfInt __key_t = Constants$root.C_INT$LAYOUT;
    public static OfInt __clockid_t = Constants$root.C_INT$LAYOUT;
    public static OfAddress __timer_t = Constants$root.C_POINTER$LAYOUT;
    public static OfLong __blksize_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __blkcnt_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __blkcnt64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __fsword_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __ssize_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __syscall_slong_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __loff_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfAddress __caddr_t = Constants$root.C_POINTER$LAYOUT;
    public static OfLong __intptr_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt __sig_atomic_t = Constants$root.C_INT$LAYOUT;
    public static OfShort int16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt int32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong int64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfShort int_least16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt int_least32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong int_least64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong int_fast16_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong int_fast32_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong int_fast64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong intptr_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong intmax_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong ptrdiff_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt wchar_t = Constants$root.C_INT$LAYOUT;
    public static MemoryLayout FLAG_clear_internal_memory$LAYOUT() {
        return constants$0.FLAG_clear_internal_memory$LAYOUT;
    }
    public static VarHandle FLAG_clear_internal_memory$VH() {
        return constants$0.FLAG_clear_internal_memory$VH;
    }
    public static MemorySegment FLAG_clear_internal_memory$SEGMENT() {
        return RuntimeHelper.requireNonNull(constants$0.FLAG_clear_internal_memory$SEGMENT,"FLAG_clear_internal_memory");
    }
    public static int FLAG_clear_internal_memory$get() {
        return (int) constants$0.FLAG_clear_internal_memory$VH.get(RuntimeHelper.requireNonNull(constants$0.FLAG_clear_internal_memory$SEGMENT, "FLAG_clear_internal_memory"));
    }
    public static void FLAG_clear_internal_memory$set( int x) {
        constants$0.FLAG_clear_internal_memory$VH.set(RuntimeHelper.requireNonNull(constants$0.FLAG_clear_internal_memory$SEGMENT, "FLAG_clear_internal_memory"), x);
    }
    public static int ARGON2_OK() {
        return (int)0L;
    }
    public static int ARGON2_OUTPUT_PTR_NULL() {
        return (int)-1L;
    }
    public static int ARGON2_OUTPUT_TOO_SHORT() {
        return (int)-2L;
    }
    public static int ARGON2_OUTPUT_TOO_LONG() {
        return (int)-3L;
    }
    public static int ARGON2_PWD_TOO_SHORT() {
        return (int)-4L;
    }
    public static int ARGON2_PWD_TOO_LONG() {
        return (int)-5L;
    }
    public static int ARGON2_SALT_TOO_SHORT() {
        return (int)-6L;
    }
    public static int ARGON2_SALT_TOO_LONG() {
        return (int)-7L;
    }
    public static int ARGON2_AD_TOO_SHORT() {
        return (int)-8L;
    }
    public static int ARGON2_AD_TOO_LONG() {
        return (int)-9L;
    }
    public static int ARGON2_SECRET_TOO_SHORT() {
        return (int)-10L;
    }
    public static int ARGON2_SECRET_TOO_LONG() {
        return (int)-11L;
    }
    public static int ARGON2_TIME_TOO_SMALL() {
        return (int)-12L;
    }
    public static int ARGON2_TIME_TOO_LARGE() {
        return (int)-13L;
    }
    public static int ARGON2_MEMORY_TOO_LITTLE() {
        return (int)-14L;
    }
    public static int ARGON2_MEMORY_TOO_MUCH() {
        return (int)-15L;
    }
    public static int ARGON2_LANES_TOO_FEW() {
        return (int)-16L;
    }
    public static int ARGON2_LANES_TOO_MANY() {
        return (int)-17L;
    }
    public static int ARGON2_PWD_PTR_MISMATCH() {
        return (int)-18L;
    }
    public static int ARGON2_SALT_PTR_MISMATCH() {
        return (int)-19L;
    }
    public static int ARGON2_SECRET_PTR_MISMATCH() {
        return (int)-20L;
    }
    public static int ARGON2_AD_PTR_MISMATCH() {
        return (int)-21L;
    }
    public static int ARGON2_MEMORY_ALLOCATION_ERROR() {
        return (int)-22L;
    }
    public static int ARGON2_FREE_MEMORY_CBK_NULL() {
        return (int)-23L;
    }
    public static int ARGON2_ALLOCATE_MEMORY_CBK_NULL() {
        return (int)-24L;
    }
    public static int ARGON2_INCORRECT_PARAMETER() {
        return (int)-25L;
    }
    public static int ARGON2_INCORRECT_TYPE() {
        return (int)-26L;
    }
    public static int ARGON2_OUT_PTR_MISMATCH() {
        return (int)-27L;
    }
    public static int ARGON2_THREADS_TOO_FEW() {
        return (int)-28L;
    }
    public static int ARGON2_THREADS_TOO_MANY() {
        return (int)-29L;
    }
    public static int ARGON2_MISSING_ARGS() {
        return (int)-30L;
    }
    public static int ARGON2_ENCODING_FAIL() {
        return (int)-31L;
    }
    public static int ARGON2_DECODING_FAIL() {
        return (int)-32L;
    }
    public static int ARGON2_THREAD_FAIL() {
        return (int)-33L;
    }
    public static int ARGON2_DECODING_LENGTH_FAIL() {
        return (int)-34L;
    }
    public static int ARGON2_VERIFY_MISMATCH() {
        return (int)-35L;
    }
    public static int Argon2_d() {
        return (int)0L;
    }
    public static int Argon2_i() {
        return (int)1L;
    }
    public static int Argon2_id() {
        return (int)2L;
    }
    public static int ARGON2_VERSION_10() {
        return (int)16L;
    }
    public static int ARGON2_VERSION_13() {
        return (int)19L;
    }
    public static int ARGON2_VERSION_NUMBER() {
        return (int)19L;
    }
    public static MethodHandle argon2_type2string$MH() {
        return RuntimeHelper.requireNonNull(constants$0.argon2_type2string$MH,"argon2_type2string");
    }
    public static MemoryAddress argon2_type2string ( int type,  int uppercase) {
        var mh$ = argon2_type2string$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact(type, uppercase);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$1.argon2_ctx$MH,"argon2_ctx");
    }
    public static int argon2_ctx ( Addressable context,  int type) {
        var mh$ = argon2_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_hash_encoded$MH() {
        return RuntimeHelper.requireNonNull(constants$1.argon2i_hash_encoded$MH,"argon2i_hash_encoded");
    }
    public static int argon2i_hash_encoded ( int t_cost,  int m_cost,  int parallelism,  Addressable pwd,  long pwdlen,  Addressable salt,  long saltlen,  long hashlen,  Addressable encoded,  long encodedlen) {
        var mh$ = argon2i_hash_encoded$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hashlen, encoded, encodedlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_hash_raw$MH() {
        return RuntimeHelper.requireNonNull(constants$1.argon2i_hash_raw$MH,"argon2i_hash_raw");
    }
    public static int argon2i_hash_raw ( int t_cost,  int m_cost,  int parallelism,  Addressable pwd,  long pwdlen,  Addressable salt,  long saltlen,  Addressable hash,  long hashlen) {
        var mh$ = argon2i_hash_raw$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hash, hashlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_hash_encoded$MH() {
        return RuntimeHelper.requireNonNull(constants$1.argon2d_hash_encoded$MH,"argon2d_hash_encoded");
    }
    public static int argon2d_hash_encoded ( int t_cost,  int m_cost,  int parallelism,  Addressable pwd,  long pwdlen,  Addressable salt,  long saltlen,  long hashlen,  Addressable encoded,  long encodedlen) {
        var mh$ = argon2d_hash_encoded$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hashlen, encoded, encodedlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_hash_raw$MH() {
        return RuntimeHelper.requireNonNull(constants$1.argon2d_hash_raw$MH,"argon2d_hash_raw");
    }
    public static int argon2d_hash_raw ( int t_cost,  int m_cost,  int parallelism,  Addressable pwd,  long pwdlen,  Addressable salt,  long saltlen,  Addressable hash,  long hashlen) {
        var mh$ = argon2d_hash_raw$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hash, hashlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_hash_encoded$MH() {
        return RuntimeHelper.requireNonNull(constants$1.argon2id_hash_encoded$MH,"argon2id_hash_encoded");
    }
    public static int argon2id_hash_encoded ( int t_cost,  int m_cost,  int parallelism,  Addressable pwd,  long pwdlen,  Addressable salt,  long saltlen,  long hashlen,  Addressable encoded,  long encodedlen) {
        var mh$ = argon2id_hash_encoded$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hashlen, encoded, encodedlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_hash_raw$MH() {
        return RuntimeHelper.requireNonNull(constants$2.argon2id_hash_raw$MH,"argon2id_hash_raw");
    }
    public static int argon2id_hash_raw ( int t_cost,  int m_cost,  int parallelism,  Addressable pwd,  long pwdlen,  Addressable salt,  long saltlen,  Addressable hash,  long hashlen) {
        var mh$ = argon2id_hash_raw$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hash, hashlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_hash$MH() {
        return RuntimeHelper.requireNonNull(constants$2.argon2_hash$MH,"argon2_hash");
    }
    public static int argon2_hash ( int t_cost,  int m_cost,  int parallelism,  Addressable pwd,  long pwdlen,  Addressable salt,  long saltlen,  Addressable hash,  long hashlen,  Addressable encoded,  long encodedlen,  int type,  int version) {
        var mh$ = argon2_hash$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hash, hashlen, encoded, encodedlen, type, version);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_verify$MH() {
        return RuntimeHelper.requireNonNull(constants$2.argon2i_verify$MH,"argon2i_verify");
    }
    public static int argon2i_verify ( Addressable encoded,  Addressable pwd,  long pwdlen) {
        var mh$ = argon2i_verify$MH();
        try {
            return (int)mh$.invokeExact(encoded, pwd, pwdlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_verify$MH() {
        return RuntimeHelper.requireNonNull(constants$2.argon2d_verify$MH,"argon2d_verify");
    }
    public static int argon2d_verify ( Addressable encoded,  Addressable pwd,  long pwdlen) {
        var mh$ = argon2d_verify$MH();
        try {
            return (int)mh$.invokeExact(encoded, pwd, pwdlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_verify$MH() {
        return RuntimeHelper.requireNonNull(constants$2.argon2id_verify$MH,"argon2id_verify");
    }
    public static int argon2id_verify ( Addressable encoded,  Addressable pwd,  long pwdlen) {
        var mh$ = argon2id_verify$MH();
        try {
            return (int)mh$.invokeExact(encoded, pwd, pwdlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_verify$MH() {
        return RuntimeHelper.requireNonNull(constants$2.argon2_verify$MH,"argon2_verify");
    }
    public static int argon2_verify ( Addressable encoded,  Addressable pwd,  long pwdlen,  int type) {
        var mh$ = argon2_verify$MH();
        try {
            return (int)mh$.invokeExact(encoded, pwd, pwdlen, type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$3.argon2d_ctx$MH,"argon2d_ctx");
    }
    public static int argon2d_ctx ( Addressable context) {
        var mh$ = argon2d_ctx$MH();
        try {
            return (int)mh$.invokeExact(context);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$3.argon2i_ctx$MH,"argon2i_ctx");
    }
    public static int argon2i_ctx ( Addressable context) {
        var mh$ = argon2i_ctx$MH();
        try {
            return (int)mh$.invokeExact(context);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$3.argon2id_ctx$MH,"argon2id_ctx");
    }
    public static int argon2id_ctx ( Addressable context) {
        var mh$ = argon2id_ctx$MH();
        try {
            return (int)mh$.invokeExact(context);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_verify_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$3.argon2d_verify_ctx$MH,"argon2d_verify_ctx");
    }
    public static int argon2d_verify_ctx ( Addressable context,  Addressable hash) {
        var mh$ = argon2d_verify_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, hash);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_verify_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$3.argon2i_verify_ctx$MH,"argon2i_verify_ctx");
    }
    public static int argon2i_verify_ctx ( Addressable context,  Addressable hash) {
        var mh$ = argon2i_verify_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, hash);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_verify_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$3.argon2id_verify_ctx$MH,"argon2id_verify_ctx");
    }
    public static int argon2id_verify_ctx ( Addressable context,  Addressable hash) {
        var mh$ = argon2id_verify_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, hash);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_verify_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$4.argon2_verify_ctx$MH,"argon2_verify_ctx");
    }
    public static int argon2_verify_ctx ( Addressable context,  Addressable hash,  int type) {
        var mh$ = argon2_verify_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, hash, type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_error_message$MH() {
        return RuntimeHelper.requireNonNull(constants$4.argon2_error_message$MH,"argon2_error_message");
    }
    public static MemoryAddress argon2_error_message ( int error_code) {
        var mh$ = argon2_error_message$MH();
        try {
            return (java.lang.foreign.MemoryAddress)mh$.invokeExact(error_code);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_encodedlen$MH() {
        return RuntimeHelper.requireNonNull(constants$4.argon2_encodedlen$MH,"argon2_encodedlen");
    }
    public static long argon2_encodedlen ( int t_cost,  int m_cost,  int parallelism,  int saltlen,  int hashlen,  int type) {
        var mh$ = argon2_encodedlen$MH();
        try {
            return (long)mh$.invokeExact(t_cost, m_cost, parallelism, saltlen, hashlen, type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static long _POSIX_C_SOURCE() {
        return 200809L;
    }
    public static int __TIMESIZE() {
        return (int)64L;
    }
    public static long __STDC_IEC_60559_BFP__() {
        return 201404L;
    }
    public static long __STDC_IEC_60559_COMPLEX__() {
        return 201404L;
    }
    public static long __STDC_ISO_10646__() {
        return 201706L;
    }
    public static int __WCHAR_MAX() {
        return (int)2147483647L;
    }
    public static int __WCHAR_MIN() {
        return (int)-2147483648L;
    }
    public static int INT8_MIN() {
        return (int)-128L;
    }
    public static int INT16_MIN() {
        return (int)-32768L;
    }
    public static int INT32_MIN() {
        return (int)-2147483648L;
    }
    public static long INT64_MIN() {
        return -9223372036854775808L;
    }
    public static int INT8_MAX() {
        return (int)127L;
    }
    public static int INT16_MAX() {
        return (int)32767L;
    }
    public static int INT32_MAX() {
        return (int)2147483647L;
    }
    public static long INT64_MAX() {
        return 9223372036854775807L;
    }
    public static int UINT8_MAX() {
        return (int)255L;
    }
    public static int UINT16_MAX() {
        return (int)65535L;
    }
    public static int UINT32_MAX() {
        return (int)4294967295L;
    }
    public static long UINT64_MAX() {
        return -1L;
    }
    public static int INT_LEAST8_MIN() {
        return (int)-128L;
    }
    public static int INT_LEAST16_MIN() {
        return (int)-32768L;
    }
    public static int INT_LEAST32_MIN() {
        return (int)-2147483648L;
    }
    public static long INT_LEAST64_MIN() {
        return -9223372036854775808L;
    }
    public static int INT_LEAST8_MAX() {
        return (int)127L;
    }
    public static int INT_LEAST16_MAX() {
        return (int)32767L;
    }
    public static int INT_LEAST32_MAX() {
        return (int)2147483647L;
    }
    public static long INT_LEAST64_MAX() {
        return 9223372036854775807L;
    }
    public static int UINT_LEAST8_MAX() {
        return (int)255L;
    }
    public static int UINT_LEAST16_MAX() {
        return (int)65535L;
    }
    public static int UINT_LEAST32_MAX() {
        return (int)4294967295L;
    }
    public static long UINT_LEAST64_MAX() {
        return -1L;
    }
    public static int INT_FAST8_MIN() {
        return (int)-128L;
    }
    public static long INT_FAST16_MIN() {
        return -9223372036854775808L;
    }
    public static long INT_FAST32_MIN() {
        return -9223372036854775808L;
    }
    public static long INT_FAST64_MIN() {
        return -9223372036854775808L;
    }
    public static int INT_FAST8_MAX() {
        return (int)127L;
    }
    public static long INT_FAST16_MAX() {
        return 9223372036854775807L;
    }
    public static long INT_FAST32_MAX() {
        return 9223372036854775807L;
    }
    public static long INT_FAST64_MAX() {
        return 9223372036854775807L;
    }
    public static int UINT_FAST8_MAX() {
        return (int)255L;
    }
    public static long UINT_FAST16_MAX() {
        return -1L;
    }
    public static long UINT_FAST32_MAX() {
        return -1L;
    }
    public static long UINT_FAST64_MAX() {
        return -1L;
    }
    public static long INTPTR_MIN() {
        return -9223372036854775808L;
    }
    public static long INTPTR_MAX() {
        return 9223372036854775807L;
    }
    public static long UINTPTR_MAX() {
        return -1L;
    }
    public static long INTMAX_MIN() {
        return -9223372036854775808L;
    }
    public static long INTMAX_MAX() {
        return 9223372036854775807L;
    }
    public static long UINTMAX_MAX() {
        return -1L;
    }
    public static long PTRDIFF_MIN() {
        return -9223372036854775808L;
    }
    public static long PTRDIFF_MAX() {
        return 9223372036854775807L;
    }
    public static int SIG_ATOMIC_MIN() {
        return (int)-2147483648L;
    }
    public static int SIG_ATOMIC_MAX() {
        return (int)2147483647L;
    }
    public static long SIZE_MAX() {
        return -1L;
    }
    public static int WCHAR_MIN() {
        return (int)-2147483648L;
    }
    public static int WCHAR_MAX() {
        return (int)2147483647L;
    }
    public static int WINT_MIN() {
        return (int)0L;
    }
    public static int WINT_MAX() {
        return (int)4294967295L;
    }
    public static MemoryAddress NULL() {
        return constants$4.NULL$ADDR;
    }
    public static long LLONG_MIN() {
        return -9223372036854775808L;
    }
    public static long LLONG_MAX() {
        return 9223372036854775807L;
    }
    public static long ULLONG_MAX() {
        return -1L;
    }
    public static int PTHREAD_DESTRUCTOR_ITERATIONS() {
        return (int)4L;
    }
    public static int SEM_VALUE_MAX() {
        return (int)2147483647L;
    }
    public static long SSIZE_MAX() {
        return 9223372036854775807L;
    }
    public static int BC_BASE_MAX() {
        return (int)99L;
    }
    public static int BC_DIM_MAX() {
        return (int)2048L;
    }
    public static int BC_SCALE_MAX() {
        return (int)99L;
    }
    public static int BC_STRING_MAX() {
        return (int)1000L;
    }
    public static int EXPR_NEST_MAX() {
        return (int)32L;
    }
    public static int LINE_MAX() {
        return (int)2048L;
    }
    public static int RE_DUP_MAX() {
        return (int)32767L;
    }
    public static int SCHAR_MAX() {
        return (int)127L;
    }
    public static int SHRT_MAX() {
        return (int)32767L;
    }
    public static int INT_MAX() {
        return (int)2147483647L;
    }
    public static long LONG_MAX() {
        return 9223372036854775807L;
    }
    public static int SCHAR_MIN() {
        return (int)-128L;
    }
    public static int SHRT_MIN() {
        return (int)-32768L;
    }
    public static int INT_MIN() {
        return (int)-2147483648L;
    }
    public static long LONG_MIN() {
        return -9223372036854775808L;
    }
    public static int UCHAR_MAX() {
        return (int)255L;
    }
    public static int USHRT_MAX() {
        return (int)65535L;
    }
    public static int UINT_MAX() {
        return (int)4294967295L;
    }
    public static long ULONG_MAX() {
        return -1L;
    }
    public static int CHAR_BIT() {
        return (int)8L;
    }
    public static int CHAR_MIN() {
        return (int)-128L;
    }
    public static int CHAR_MAX() {
        return (int)127L;
    }
    public static int ARGON2_MIN_LANES() {
        return (int)1L;
    }
    public static int ARGON2_MAX_LANES() {
        return (int)16777215L;
    }
    public static int ARGON2_MIN_THREADS() {
        return (int)1L;
    }
    public static int ARGON2_MAX_THREADS() {
        return (int)16777215L;
    }
    public static int ARGON2_SYNC_POINTS() {
        return (int)4L;
    }
    public static int ARGON2_MIN_OUTLEN() {
        return (int)4L;
    }
    public static int ARGON2_MAX_OUTLEN() {
        return (int)4294967295L;
    }
    public static int ARGON2_MIN_MEMORY() {
        return (int)8L;
    }
    public static long ARGON2_MAX_MEMORY_BITS() {
        return 32L;
    }
    public static long ARGON2_MAX_MEMORY() {
        return 4294967295L;
    }
    public static int ARGON2_MIN_TIME() {
        return (int)1L;
    }
    public static int ARGON2_MAX_TIME() {
        return (int)4294967295L;
    }
    public static int ARGON2_MIN_PWD_LENGTH() {
        return (int)0L;
    }
    public static int ARGON2_MAX_PWD_LENGTH() {
        return (int)4294967295L;
    }
    public static int ARGON2_MIN_AD_LENGTH() {
        return (int)0L;
    }
    public static int ARGON2_MAX_AD_LENGTH() {
        return (int)4294967295L;
    }
    public static int ARGON2_MIN_SALT_LENGTH() {
        return (int)8L;
    }
    public static int ARGON2_MAX_SALT_LENGTH() {
        return (int)4294967295L;
    }
    public static int ARGON2_MIN_SECRET() {
        return (int)0L;
    }
    public static int ARGON2_MAX_SECRET() {
        return (int)4294967295L;
    }
    public static int ARGON2_DEFAULT_FLAGS() {
        return (int)0L;
    }
    public static int ARGON2_FLAG_CLEAR_PASSWORD() {
        return (int)1L;
    }
    public static int ARGON2_FLAG_CLEAR_SECRET() {
        return (int)2L;
    }
}


