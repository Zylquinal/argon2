package com.zylquinal.argon2.internal;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
public class argon2_h  {

    public static final OfByte C_CHAR = JAVA_BYTE;
    public static final OfShort C_SHORT = JAVA_SHORT;
    public static final OfInt C_INT = JAVA_INT;
    public static final OfLong C_LONG = JAVA_LONG;
    public static final OfLong C_LONG_LONG = JAVA_LONG;
    public static final OfFloat C_FLOAT = JAVA_FLOAT;
    public static final OfDouble C_DOUBLE = JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = RuntimeHelper.POINTER;
    /**
     * {@snippet :
     * #define _STDINT_H 1
     * }
     */
    public static int _STDINT_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _FEATURES_H 1
     * }
     */
    public static int _FEATURES_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _DEFAULT_SOURCE 1
     * }
     */
    public static int _DEFAULT_SOURCE() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_ISOC2X 0
     * }
     */
    public static int __GLIBC_USE_ISOC2X() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __USE_ISOC11 1
     * }
     */
    public static int __USE_ISOC11() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_ISOC99 1
     * }
     */
    public static int __USE_ISOC99() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_ISOC95 1
     * }
     */
    public static int __USE_ISOC95() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_POSIX_IMPLICITLY 1
     * }
     */
    public static int __USE_POSIX_IMPLICITLY() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _POSIX_SOURCE 1
     * }
     */
    public static int _POSIX_SOURCE() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_POSIX 1
     * }
     */
    public static int __USE_POSIX() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_POSIX2 1
     * }
     */
    public static int __USE_POSIX2() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_POSIX199309 1
     * }
     */
    public static int __USE_POSIX199309() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_POSIX199506 1
     * }
     */
    public static int __USE_POSIX199506() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_XOPEN2K 1
     * }
     */
    public static int __USE_XOPEN2K() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_XOPEN2K8 1
     * }
     */
    public static int __USE_XOPEN2K8() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _ATFILE_SOURCE 1
     * }
     */
    public static int _ATFILE_SOURCE() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __WORDSIZE 64
     * }
     */
    public static int __WORDSIZE() {
        return (int)64L;
    }
    /**
     * {@snippet :
     * #define __WORDSIZE_TIME64_COMPAT32 1
     * }
     */
    public static int __WORDSIZE_TIME64_COMPAT32() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __SYSCALL_WORDSIZE 64
     * }
     */
    public static int __SYSCALL_WORDSIZE() {
        return (int)64L;
    }
    /**
     * {@snippet :
     * #define __USE_MISC 1
     * }
     */
    public static int __USE_MISC() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_ATFILE 1
     * }
     */
    public static int __USE_ATFILE() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __USE_FORTIFY_LEVEL 0
     * }
     */
    public static int __USE_FORTIFY_LEVEL() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_DEPRECATED_GETS 0
     * }
     */
    public static int __GLIBC_USE_DEPRECATED_GETS() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_DEPRECATED_SCANF 0
     * }
     */
    public static int __GLIBC_USE_DEPRECATED_SCANF() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_C2X_STRTOL 0
     * }
     */
    public static int __GLIBC_USE_C2X_STRTOL() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define _STDC_PREDEF_H 1
     * }
     */
    public static int _STDC_PREDEF_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __STDC_IEC_559__ 1
     * }
     */
    public static int __STDC_IEC_559__() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __STDC_IEC_559_COMPLEX__ 1
     * }
     */
    public static int __STDC_IEC_559_COMPLEX__() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __GNU_LIBRARY__ 6
     * }
     */
    public static int __GNU_LIBRARY__() {
        return (int)6L;
    }
    /**
     * {@snippet :
     * #define __GLIBC__ 2
     * }
     */
    public static int __GLIBC__() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_MINOR__ 38
     * }
     */
    public static int __GLIBC_MINOR__() {
        return (int)38L;
    }
    /**
     * {@snippet :
     * #define _SYS_CDEFS_H 1
     * }
     */
    public static int _SYS_CDEFS_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __glibc_c99_flexarr_available 1
     * }
     */
    public static int __glibc_c99_flexarr_available() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __LDOUBLE_REDIRECTS_TO_FLOAT128_ABI 0
     * }
     */
    public static int __LDOUBLE_REDIRECTS_TO_FLOAT128_ABI() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __HAVE_GENERIC_SELECTION 1
     * }
     */
    public static int __HAVE_GENERIC_SELECTION() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_LIB_EXT2 0
     * }
     */
    public static int __GLIBC_USE_LIB_EXT2() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_IEC_60559_BFP_EXT 0
     * }
     */
    public static int __GLIBC_USE_IEC_60559_BFP_EXT() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_IEC_60559_BFP_EXT_C2X 0
     * }
     */
    public static int __GLIBC_USE_IEC_60559_BFP_EXT_C2X() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_IEC_60559_EXT 0
     * }
     */
    public static int __GLIBC_USE_IEC_60559_EXT() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_IEC_60559_FUNCS_EXT 0
     * }
     */
    public static int __GLIBC_USE_IEC_60559_FUNCS_EXT() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_IEC_60559_FUNCS_EXT_C2X 0
     * }
     */
    public static int __GLIBC_USE_IEC_60559_FUNCS_EXT_C2X() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define __GLIBC_USE_IEC_60559_TYPES_EXT 0
     * }
     */
    public static int __GLIBC_USE_IEC_60559_TYPES_EXT() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define _BITS_TYPES_H 1
     * }
     */
    public static int _BITS_TYPES_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _BITS_TYPESIZES_H 1
     * }
     */
    public static int _BITS_TYPESIZES_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __OFF_T_MATCHES_OFF64_T 1
     * }
     */
    public static int __OFF_T_MATCHES_OFF64_T() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __INO_T_MATCHES_INO64_T 1
     * }
     */
    public static int __INO_T_MATCHES_INO64_T() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __RLIM_T_MATCHES_RLIM64_T 1
     * }
     */
    public static int __RLIM_T_MATCHES_RLIM64_T() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __STATFS_MATCHES_STATFS64 1
     * }
     */
    public static int __STATFS_MATCHES_STATFS64() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __KERNEL_OLD_TIMEVAL_MATCHES_TIMEVAL64 1
     * }
     */
    public static int __KERNEL_OLD_TIMEVAL_MATCHES_TIMEVAL64() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define __FD_SETSIZE 1024
     * }
     */
    public static int __FD_SETSIZE() {
        return (int)1024L;
    }
    /**
     * {@snippet :
     * #define _BITS_TIME64_H 1
     * }
     */
    public static int _BITS_TIME64_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _BITS_WCHAR_H 1
     * }
     */
    public static int _BITS_WCHAR_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _BITS_STDINT_INTN_H 1
     * }
     */
    public static int _BITS_STDINT_INTN_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _BITS_STDINT_UINTN_H 1
     * }
     */
    public static int _BITS_STDINT_UINTN_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _LIBC_LIMITS_H_ 1
     * }
     */
    public static int _LIBC_LIMITS_H_() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define MB_LEN_MAX 16
     * }
     */
    public static int MB_LEN_MAX() {
        return (int)16L;
    }
    /**
     * {@snippet :
     * #define _BITS_POSIX1_LIM_H 1
     * }
     */
    public static int _BITS_POSIX1_LIM_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _POSIX_AIO_LISTIO_MAX 2
     * }
     */
    public static int _POSIX_AIO_LISTIO_MAX() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define _POSIX_AIO_MAX 1
     * }
     */
    public static int _POSIX_AIO_MAX() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _POSIX_ARG_MAX 4096
     * }
     */
    public static int _POSIX_ARG_MAX() {
        return (int)4096L;
    }
    /**
     * {@snippet :
     * #define _POSIX_CHILD_MAX 25
     * }
     */
    public static int _POSIX_CHILD_MAX() {
        return (int)25L;
    }
    /**
     * {@snippet :
     * #define _POSIX_DELAYTIMER_MAX 32
     * }
     */
    public static int _POSIX_DELAYTIMER_MAX() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define _POSIX_HOST_NAME_MAX 255
     * }
     */
    public static int _POSIX_HOST_NAME_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define _POSIX_LINK_MAX 8
     * }
     */
    public static int _POSIX_LINK_MAX() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define _POSIX_LOGIN_NAME_MAX 9
     * }
     */
    public static int _POSIX_LOGIN_NAME_MAX() {
        return (int)9L;
    }
    /**
     * {@snippet :
     * #define _POSIX_MAX_CANON 255
     * }
     */
    public static int _POSIX_MAX_CANON() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define _POSIX_MAX_INPUT 255
     * }
     */
    public static int _POSIX_MAX_INPUT() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define _POSIX_MQ_OPEN_MAX 8
     * }
     */
    public static int _POSIX_MQ_OPEN_MAX() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define _POSIX_MQ_PRIO_MAX 32
     * }
     */
    public static int _POSIX_MQ_PRIO_MAX() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define _POSIX_NAME_MAX 14
     * }
     */
    public static int _POSIX_NAME_MAX() {
        return (int)14L;
    }
    /**
     * {@snippet :
     * #define _POSIX_NGROUPS_MAX 8
     * }
     */
    public static int _POSIX_NGROUPS_MAX() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define _POSIX_OPEN_MAX 20
     * }
     */
    public static int _POSIX_OPEN_MAX() {
        return (int)20L;
    }
    /**
     * {@snippet :
     * #define _POSIX_PATH_MAX 256
     * }
     */
    public static int _POSIX_PATH_MAX() {
        return (int)256L;
    }
    /**
     * {@snippet :
     * #define _POSIX_PIPE_BUF 512
     * }
     */
    public static int _POSIX_PIPE_BUF() {
        return (int)512L;
    }
    /**
     * {@snippet :
     * #define _POSIX_RE_DUP_MAX 255
     * }
     */
    public static int _POSIX_RE_DUP_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define _POSIX_RTSIG_MAX 8
     * }
     */
    public static int _POSIX_RTSIG_MAX() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define _POSIX_SEM_NSEMS_MAX 256
     * }
     */
    public static int _POSIX_SEM_NSEMS_MAX() {
        return (int)256L;
    }
    /**
     * {@snippet :
     * #define _POSIX_SEM_VALUE_MAX 32767
     * }
     */
    public static int _POSIX_SEM_VALUE_MAX() {
        return (int)32767L;
    }
    /**
     * {@snippet :
     * #define _POSIX_SIGQUEUE_MAX 32
     * }
     */
    public static int _POSIX_SIGQUEUE_MAX() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define _POSIX_SSIZE_MAX 32767
     * }
     */
    public static int _POSIX_SSIZE_MAX() {
        return (int)32767L;
    }
    /**
     * {@snippet :
     * #define _POSIX_STREAM_MAX 8
     * }
     */
    public static int _POSIX_STREAM_MAX() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define _POSIX_SYMLINK_MAX 255
     * }
     */
    public static int _POSIX_SYMLINK_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define _POSIX_SYMLOOP_MAX 8
     * }
     */
    public static int _POSIX_SYMLOOP_MAX() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define _POSIX_TIMER_MAX 32
     * }
     */
    public static int _POSIX_TIMER_MAX() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define _POSIX_TTY_NAME_MAX 9
     * }
     */
    public static int _POSIX_TTY_NAME_MAX() {
        return (int)9L;
    }
    /**
     * {@snippet :
     * #define _POSIX_TZNAME_MAX 6
     * }
     */
    public static int _POSIX_TZNAME_MAX() {
        return (int)6L;
    }
    /**
     * {@snippet :
     * #define _POSIX_CLOCKRES_MIN 20000000
     * }
     */
    public static int _POSIX_CLOCKRES_MIN() {
        return (int)20000000L;
    }
    /**
     * {@snippet :
     * #define NR_OPEN 1024
     * }
     */
    public static int NR_OPEN() {
        return (int)1024L;
    }
    /**
     * {@snippet :
     * #define NGROUPS_MAX 65536
     * }
     */
    public static int NGROUPS_MAX() {
        return (int)65536L;
    }
    /**
     * {@snippet :
     * #define ARG_MAX 131072
     * }
     */
    public static int ARG_MAX() {
        return (int)131072L;
    }
    /**
     * {@snippet :
     * #define LINK_MAX 127
     * }
     */
    public static int LINK_MAX() {
        return (int)127L;
    }
    /**
     * {@snippet :
     * #define MAX_CANON 255
     * }
     */
    public static int MAX_CANON() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define MAX_INPUT 255
     * }
     */
    public static int MAX_INPUT() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define NAME_MAX 255
     * }
     */
    public static int NAME_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define PATH_MAX 4096
     * }
     */
    public static int PATH_MAX() {
        return (int)4096L;
    }
    /**
     * {@snippet :
     * #define PIPE_BUF 4096
     * }
     */
    public static int PIPE_BUF() {
        return (int)4096L;
    }
    /**
     * {@snippet :
     * #define XATTR_NAME_MAX 255
     * }
     */
    public static int XATTR_NAME_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define XATTR_SIZE_MAX 65536
     * }
     */
    public static int XATTR_SIZE_MAX() {
        return (int)65536L;
    }
    /**
     * {@snippet :
     * #define XATTR_LIST_MAX 65536
     * }
     */
    public static int XATTR_LIST_MAX() {
        return (int)65536L;
    }
    /**
     * {@snippet :
     * #define RTSIG_MAX 32
     * }
     */
    public static int RTSIG_MAX() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define _POSIX_THREAD_KEYS_MAX 128
     * }
     */
    public static int _POSIX_THREAD_KEYS_MAX() {
        return (int)128L;
    }
    /**
     * {@snippet :
     * #define PTHREAD_KEYS_MAX 1024
     * }
     */
    public static int PTHREAD_KEYS_MAX() {
        return (int)1024L;
    }
    /**
     * {@snippet :
     * #define _POSIX_THREAD_DESTRUCTOR_ITERATIONS 4
     * }
     */
    public static int _POSIX_THREAD_DESTRUCTOR_ITERATIONS() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define _POSIX_THREAD_THREADS_MAX 64
     * }
     */
    public static int _POSIX_THREAD_THREADS_MAX() {
        return (int)64L;
    }
    /**
     * {@snippet :
     * #define AIO_PRIO_DELTA_MAX 20
     * }
     */
    public static int AIO_PRIO_DELTA_MAX() {
        return (int)20L;
    }
    /**
     * {@snippet :
     * #define PTHREAD_STACK_MIN 16384
     * }
     */
    public static int PTHREAD_STACK_MIN() {
        return (int)16384L;
    }
    /**
     * {@snippet :
     * #define DELAYTIMER_MAX 2147483647
     * }
     */
    public static int DELAYTIMER_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define TTY_NAME_MAX 32
     * }
     */
    public static int TTY_NAME_MAX() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define LOGIN_NAME_MAX 256
     * }
     */
    public static int LOGIN_NAME_MAX() {
        return (int)256L;
    }
    /**
     * {@snippet :
     * #define HOST_NAME_MAX 64
     * }
     */
    public static int HOST_NAME_MAX() {
        return (int)64L;
    }
    /**
     * {@snippet :
     * #define MQ_PRIO_MAX 32768
     * }
     */
    public static int MQ_PRIO_MAX() {
        return (int)32768L;
    }
    /**
     * {@snippet :
     * #define _BITS_POSIX2_LIM_H 1
     * }
     */
    public static int _BITS_POSIX2_LIM_H() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define _POSIX2_BC_BASE_MAX 99
     * }
     */
    public static int _POSIX2_BC_BASE_MAX() {
        return (int)99L;
    }
    /**
     * {@snippet :
     * #define _POSIX2_BC_DIM_MAX 2048
     * }
     */
    public static int _POSIX2_BC_DIM_MAX() {
        return (int)2048L;
    }
    /**
     * {@snippet :
     * #define _POSIX2_BC_SCALE_MAX 99
     * }
     */
    public static int _POSIX2_BC_SCALE_MAX() {
        return (int)99L;
    }
    /**
     * {@snippet :
     * #define _POSIX2_BC_STRING_MAX 1000
     * }
     */
    public static int _POSIX2_BC_STRING_MAX() {
        return (int)1000L;
    }
    /**
     * {@snippet :
     * #define _POSIX2_COLL_WEIGHTS_MAX 2
     * }
     */
    public static int _POSIX2_COLL_WEIGHTS_MAX() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * #define _POSIX2_EXPR_NEST_MAX 32
     * }
     */
    public static int _POSIX2_EXPR_NEST_MAX() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define _POSIX2_LINE_MAX 2048
     * }
     */
    public static int _POSIX2_LINE_MAX() {
        return (int)2048L;
    }
    /**
     * {@snippet :
     * #define _POSIX2_RE_DUP_MAX 255
     * }
     */
    public static int _POSIX2_RE_DUP_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define _POSIX2_CHARCLASS_NAME_MAX 14
     * }
     */
    public static int _POSIX2_CHARCLASS_NAME_MAX() {
        return (int)14L;
    }
    /**
     * {@snippet :
     * #define COLL_WEIGHTS_MAX 255
     * }
     */
    public static int COLL_WEIGHTS_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define CHARCLASS_NAME_MAX 2048
     * }
     */
    public static int CHARCLASS_NAME_MAX() {
        return (int)2048L;
    }
    /**
     * {@snippet :
     * typedef unsigned char __u_char;
     * }
     */
    public static final OfByte __u_char = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned short __u_short;
     * }
     */
    public static final OfShort __u_short = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef unsigned int __u_int;
     * }
     */
    public static final OfInt __u_int = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned long __u_long;
     * }
     */
    public static final OfLong __u_long = JAVA_LONG;
    /**
     * {@snippet :
     * typedef signed char __int8_t;
     * }
     */
    public static final OfByte __int8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned char __uint8_t;
     * }
     */
    public static final OfByte __uint8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef short __int16_t;
     * }
     */
    public static final OfShort __int16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef unsigned short __uint16_t;
     * }
     */
    public static final OfShort __uint16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef int __int32_t;
     * }
     */
    public static final OfInt __int32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned int __uint32_t;
     * }
     */
    public static final OfInt __uint32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long __int64_t;
     * }
     */
    public static final OfLong __int64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __uint64_t;
     * }
     */
    public static final OfLong __uint64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef signed char __int_least8_t;
     * }
     */
    public static final OfByte __int_least8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned char __uint_least8_t;
     * }
     */
    public static final OfByte __uint_least8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef short __int_least16_t;
     * }
     */
    public static final OfShort __int_least16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef unsigned short __uint_least16_t;
     * }
     */
    public static final OfShort __uint_least16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef int __int_least32_t;
     * }
     */
    public static final OfInt __int_least32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned int __uint_least32_t;
     * }
     */
    public static final OfInt __uint_least32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long __int_least64_t;
     * }
     */
    public static final OfLong __int_least64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __uint_least64_t;
     * }
     */
    public static final OfLong __uint_least64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __quad_t;
     * }
     */
    public static final OfLong __quad_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __u_quad_t;
     * }
     */
    public static final OfLong __u_quad_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __intmax_t;
     * }
     */
    public static final OfLong __intmax_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __uintmax_t;
     * }
     */
    public static final OfLong __uintmax_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __dev_t;
     * }
     */
    public static final OfLong __dev_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned int __uid_t;
     * }
     */
    public static final OfInt __uid_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned int __gid_t;
     * }
     */
    public static final OfInt __gid_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned long __ino_t;
     * }
     */
    public static final OfLong __ino_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __ino64_t;
     * }
     */
    public static final OfLong __ino64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned int __mode_t;
     * }
     */
    public static final OfInt __mode_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned long __nlink_t;
     * }
     */
    public static final OfLong __nlink_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __off_t;
     * }
     */
    public static final OfLong __off_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __off64_t;
     * }
     */
    public static final OfLong __off64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef int __pid_t;
     * }
     */
    public static final OfInt __pid_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long __clock_t;
     * }
     */
    public static final OfLong __clock_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __rlim_t;
     * }
     */
    public static final OfLong __rlim_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __rlim64_t;
     * }
     */
    public static final OfLong __rlim64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned int __id_t;
     * }
     */
    public static final OfInt __id_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long __time_t;
     * }
     */
    public static final OfLong __time_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned int __useconds_t;
     * }
     */
    public static final OfInt __useconds_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long __suseconds_t;
     * }
     */
    public static final OfLong __suseconds_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __suseconds64_t;
     * }
     */
    public static final OfLong __suseconds64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef int __daddr_t;
     * }
     */
    public static final OfInt __daddr_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef int __key_t;
     * }
     */
    public static final OfInt __key_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef int __clockid_t;
     * }
     */
    public static final OfInt __clockid_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef void* __timer_t;
     * }
     */
    public static final AddressLayout __timer_t = RuntimeHelper.POINTER;
    /**
     * {@snippet :
     * typedef long __blksize_t;
     * }
     */
    public static final OfLong __blksize_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __blkcnt_t;
     * }
     */
    public static final OfLong __blkcnt_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __blkcnt64_t;
     * }
     */
    public static final OfLong __blkcnt64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __fsblkcnt_t;
     * }
     */
    public static final OfLong __fsblkcnt_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __fsblkcnt64_t;
     * }
     */
    public static final OfLong __fsblkcnt64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __fsfilcnt_t;
     * }
     */
    public static final OfLong __fsfilcnt_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __fsfilcnt64_t;
     * }
     */
    public static final OfLong __fsfilcnt64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __fsword_t;
     * }
     */
    public static final OfLong __fsword_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __ssize_t;
     * }
     */
    public static final OfLong __ssize_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __syscall_slong_t;
     * }
     */
    public static final OfLong __syscall_slong_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long __syscall_ulong_t;
     * }
     */
    public static final OfLong __syscall_ulong_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long __loff_t;
     * }
     */
    public static final OfLong __loff_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef char* __caddr_t;
     * }
     */
    public static final AddressLayout __caddr_t = RuntimeHelper.POINTER;
    /**
     * {@snippet :
     * typedef long __intptr_t;
     * }
     */
    public static final OfLong __intptr_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned int __socklen_t;
     * }
     */
    public static final OfInt __socklen_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef int __sig_atomic_t;
     * }
     */
    public static final OfInt __sig_atomic_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef signed char int8_t;
     * }
     */
    public static final OfByte int8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef short int16_t;
     * }
     */
    public static final OfShort int16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef int int32_t;
     * }
     */
    public static final OfInt int32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long int64_t;
     * }
     */
    public static final OfLong int64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned char uint8_t;
     * }
     */
    public static final OfByte uint8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned short uint16_t;
     * }
     */
    public static final OfShort uint16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef unsigned int uint32_t;
     * }
     */
    public static final OfInt uint32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned long uint64_t;
     * }
     */
    public static final OfLong uint64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef signed char int_least8_t;
     * }
     */
    public static final OfByte int_least8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef short int_least16_t;
     * }
     */
    public static final OfShort int_least16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef int int_least32_t;
     * }
     */
    public static final OfInt int_least32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef long int_least64_t;
     * }
     */
    public static final OfLong int_least64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned char uint_least8_t;
     * }
     */
    public static final OfByte uint_least8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned short uint_least16_t;
     * }
     */
    public static final OfShort uint_least16_t = JAVA_SHORT;
    /**
     * {@snippet :
     * typedef unsigned int uint_least32_t;
     * }
     */
    public static final OfInt uint_least32_t = JAVA_INT;
    /**
     * {@snippet :
     * typedef unsigned long uint_least64_t;
     * }
     */
    public static final OfLong uint_least64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef signed char int_fast8_t;
     * }
     */
    public static final OfByte int_fast8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef long int_fast16_t;
     * }
     */
    public static final OfLong int_fast16_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long int_fast32_t;
     * }
     */
    public static final OfLong int_fast32_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long int_fast64_t;
     * }
     */
    public static final OfLong int_fast64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned char uint_fast8_t;
     * }
     */
    public static final OfByte uint_fast8_t = JAVA_BYTE;
    /**
     * {@snippet :
     * typedef unsigned long uint_fast16_t;
     * }
     */
    public static final OfLong uint_fast16_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long uint_fast32_t;
     * }
     */
    public static final OfLong uint_fast32_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long uint_fast64_t;
     * }
     */
    public static final OfLong uint_fast64_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long intptr_t;
     * }
     */
    public static final OfLong intptr_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long uintptr_t;
     * }
     */
    public static final OfLong uintptr_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long intmax_t;
     * }
     */
    public static final OfLong intmax_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long uintmax_t;
     * }
     */
    public static final OfLong uintmax_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef long ptrdiff_t;
     * }
     */
    public static final OfLong ptrdiff_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef unsigned long size_t;
     * }
     */
    public static final OfLong size_t = JAVA_LONG;
    /**
     * {@snippet :
     * typedef int wchar_t;
     * }
     */
    public static final OfInt wchar_t = JAVA_INT;
    public static MemoryLayout FLAG_clear_internal_memory$LAYOUT() {
        return JAVA_INT;
    }
    public static VarHandle FLAG_clear_internal_memory$VH() {
        return constants$0.const$3;
    }
    public static MemorySegment FLAG_clear_internal_memory$SEGMENT() {
        return RuntimeHelper.requireNonNull(constants$0.const$4,"FLAG_clear_internal_memory");
    }
    /**
     * Getter for variable:
     * {@snippet :
     * int FLAG_clear_internal_memory;
     * }
     */
    public static int FLAG_clear_internal_memory$get() {
        return (int) constants$0.const$3.get(RuntimeHelper.requireNonNull(constants$0.const$4, "FLAG_clear_internal_memory"));
    }
    /**
     * Setter for variable:
     * {@snippet :
     * int FLAG_clear_internal_memory;
     * }
     */
    public static void FLAG_clear_internal_memory$set(int x) {
        constants$0.const$3.set(RuntimeHelper.requireNonNull(constants$0.const$4, "FLAG_clear_internal_memory"), x);
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_OK = 0;
     * }
     */
    public static int ARGON2_OK() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_OUTPUT_PTR_NULL = -1;
     * }
     */
    public static int ARGON2_OUTPUT_PTR_NULL() {
        return (int)-1L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_OUTPUT_TOO_SHORT = -2;
     * }
     */
    public static int ARGON2_OUTPUT_TOO_SHORT() {
        return (int)-2L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_OUTPUT_TOO_LONG = -3;
     * }
     */
    public static int ARGON2_OUTPUT_TOO_LONG() {
        return (int)-3L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_PWD_TOO_SHORT = -4;
     * }
     */
    public static int ARGON2_PWD_TOO_SHORT() {
        return (int)-4L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_PWD_TOO_LONG = -5;
     * }
     */
    public static int ARGON2_PWD_TOO_LONG() {
        return (int)-5L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_SALT_TOO_SHORT = -6;
     * }
     */
    public static int ARGON2_SALT_TOO_SHORT() {
        return (int)-6L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_SALT_TOO_LONG = -7;
     * }
     */
    public static int ARGON2_SALT_TOO_LONG() {
        return (int)-7L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_AD_TOO_SHORT = -8;
     * }
     */
    public static int ARGON2_AD_TOO_SHORT() {
        return (int)-8L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_AD_TOO_LONG = -9;
     * }
     */
    public static int ARGON2_AD_TOO_LONG() {
        return (int)-9L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_SECRET_TOO_SHORT = -10;
     * }
     */
    public static int ARGON2_SECRET_TOO_SHORT() {
        return (int)-10L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_SECRET_TOO_LONG = -11;
     * }
     */
    public static int ARGON2_SECRET_TOO_LONG() {
        return (int)-11L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_TIME_TOO_SMALL = -12;
     * }
     */
    public static int ARGON2_TIME_TOO_SMALL() {
        return (int)-12L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_TIME_TOO_LARGE = -13;
     * }
     */
    public static int ARGON2_TIME_TOO_LARGE() {
        return (int)-13L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_MEMORY_TOO_LITTLE = -14;
     * }
     */
    public static int ARGON2_MEMORY_TOO_LITTLE() {
        return (int)-14L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_MEMORY_TOO_MUCH = -15;
     * }
     */
    public static int ARGON2_MEMORY_TOO_MUCH() {
        return (int)-15L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_LANES_TOO_FEW = -16;
     * }
     */
    public static int ARGON2_LANES_TOO_FEW() {
        return (int)-16L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_LANES_TOO_MANY = -17;
     * }
     */
    public static int ARGON2_LANES_TOO_MANY() {
        return (int)-17L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_PWD_PTR_MISMATCH = -18;
     * }
     */
    public static int ARGON2_PWD_PTR_MISMATCH() {
        return (int)-18L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_SALT_PTR_MISMATCH = -19;
     * }
     */
    public static int ARGON2_SALT_PTR_MISMATCH() {
        return (int)-19L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_SECRET_PTR_MISMATCH = -20;
     * }
     */
    public static int ARGON2_SECRET_PTR_MISMATCH() {
        return (int)-20L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_AD_PTR_MISMATCH = -21;
     * }
     */
    public static int ARGON2_AD_PTR_MISMATCH() {
        return (int)-21L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_MEMORY_ALLOCATION_ERROR = -22;
     * }
     */
    public static int ARGON2_MEMORY_ALLOCATION_ERROR() {
        return (int)-22L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_FREE_MEMORY_CBK_NULL = -23;
     * }
     */
    public static int ARGON2_FREE_MEMORY_CBK_NULL() {
        return (int)-23L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_ALLOCATE_MEMORY_CBK_NULL = -24;
     * }
     */
    public static int ARGON2_ALLOCATE_MEMORY_CBK_NULL() {
        return (int)-24L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_INCORRECT_PARAMETER = -25;
     * }
     */
    public static int ARGON2_INCORRECT_PARAMETER() {
        return (int)-25L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_INCORRECT_TYPE = -26;
     * }
     */
    public static int ARGON2_INCORRECT_TYPE() {
        return (int)-26L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_OUT_PTR_MISMATCH = -27;
     * }
     */
    public static int ARGON2_OUT_PTR_MISMATCH() {
        return (int)-27L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_THREADS_TOO_FEW = -28;
     * }
     */
    public static int ARGON2_THREADS_TOO_FEW() {
        return (int)-28L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_THREADS_TOO_MANY = -29;
     * }
     */
    public static int ARGON2_THREADS_TOO_MANY() {
        return (int)-29L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_MISSING_ARGS = -30;
     * }
     */
    public static int ARGON2_MISSING_ARGS() {
        return (int)-30L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_ENCODING_FAIL = -31;
     * }
     */
    public static int ARGON2_ENCODING_FAIL() {
        return (int)-31L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_DECODING_FAIL = -32;
     * }
     */
    public static int ARGON2_DECODING_FAIL() {
        return (int)-32L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_THREAD_FAIL = -33;
     * }
     */
    public static int ARGON2_THREAD_FAIL() {
        return (int)-33L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_DECODING_LENGTH_FAIL = -34;
     * }
     */
    public static int ARGON2_DECODING_LENGTH_FAIL() {
        return (int)-34L;
    }
    /**
     * {@snippet :
     * enum Argon2_ErrorCodes.ARGON2_VERIFY_MISMATCH = -35;
     * }
     */
    public static int ARGON2_VERIFY_MISMATCH() {
        return (int)-35L;
    }
    /**
     * {@snippet :
     * enum Argon2_type.Argon2_d = 0;
     * }
     */
    public static int Argon2_d() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * enum Argon2_type.Argon2_i = 1;
     * }
     */
    public static int Argon2_i() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * enum Argon2_type.Argon2_id = 2;
     * }
     */
    public static int Argon2_id() {
        return (int)2L;
    }
    /**
     * {@snippet :
     * enum Argon2_version.ARGON2_VERSION_10 = 16;
     * }
     */
    public static int ARGON2_VERSION_10() {
        return (int)16L;
    }
    /**
     * {@snippet :
     * enum Argon2_version.ARGON2_VERSION_13 = 19;
     * }
     */
    public static int ARGON2_VERSION_13() {
        return (int)19L;
    }
    /**
     * {@snippet :
     * enum Argon2_version.ARGON2_VERSION_NUMBER = 19;
     * }
     */
    public static int ARGON2_VERSION_NUMBER() {
        return (int)19L;
    }
    public static MethodHandle argon2_type2string$MH() {
        return RuntimeHelper.requireNonNull(constants$5.const$1,"argon2_type2string");
    }
    /**
     * {@snippet :
     * char* argon2_type2string(argon2_type type, int uppercase);
     * }
     */
    public static MemorySegment argon2_type2string(int type, int uppercase) {
        var mh$ = argon2_type2string$MH();
        try {
            return (MemorySegment)mh$.invokeExact(type, uppercase);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$5.const$3,"argon2_ctx");
    }
    /**
     * {@snippet :
     * int argon2_ctx(argon2_context* context, argon2_type type);
     * }
     */
    public static int argon2_ctx(MemorySegment context, int type) {
        var mh$ = argon2_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_hash_encoded$MH() {
        return RuntimeHelper.requireNonNull(constants$5.const$5,"argon2i_hash_encoded");
    }
    /**
     * {@snippet :
     * int argon2i_hash_encoded(const uint32_t t_cost, const uint32_t m_cost, const uint32_t parallelism, void* pwd, const size_t pwdlen, void* salt, const size_t saltlen, const size_t hashlen, char* encoded, const size_t encodedlen);
     * }
     */
    public static int argon2i_hash_encoded(int t_cost, int m_cost, int parallelism, MemorySegment pwd, long pwdlen, MemorySegment salt, long saltlen, long hashlen, MemorySegment encoded, long encodedlen) {
        var mh$ = argon2i_hash_encoded$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hashlen, encoded, encodedlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_hash_raw$MH() {
        return RuntimeHelper.requireNonNull(constants$6.const$1,"argon2i_hash_raw");
    }
    /**
     * {@snippet :
     * int argon2i_hash_raw(const uint32_t t_cost, const uint32_t m_cost, const uint32_t parallelism, void* pwd, const size_t pwdlen, void* salt, const size_t saltlen, void* hash, const size_t hashlen);
     * }
     */
    public static int argon2i_hash_raw(int t_cost, int m_cost, int parallelism, MemorySegment pwd, long pwdlen, MemorySegment salt, long saltlen, MemorySegment hash, long hashlen) {
        var mh$ = argon2i_hash_raw$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hash, hashlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_hash_encoded$MH() {
        return RuntimeHelper.requireNonNull(constants$6.const$2,"argon2d_hash_encoded");
    }
    /**
     * {@snippet :
     * int argon2d_hash_encoded(const uint32_t t_cost, const uint32_t m_cost, const uint32_t parallelism, void* pwd, const size_t pwdlen, void* salt, const size_t saltlen, const size_t hashlen, char* encoded, const size_t encodedlen);
     * }
     */
    public static int argon2d_hash_encoded(int t_cost, int m_cost, int parallelism, MemorySegment pwd, long pwdlen, MemorySegment salt, long saltlen, long hashlen, MemorySegment encoded, long encodedlen) {
        var mh$ = argon2d_hash_encoded$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hashlen, encoded, encodedlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_hash_raw$MH() {
        return RuntimeHelper.requireNonNull(constants$6.const$3,"argon2d_hash_raw");
    }
    /**
     * {@snippet :
     * int argon2d_hash_raw(const uint32_t t_cost, const uint32_t m_cost, const uint32_t parallelism, void* pwd, const size_t pwdlen, void* salt, const size_t saltlen, void* hash, const size_t hashlen);
     * }
     */
    public static int argon2d_hash_raw(int t_cost, int m_cost, int parallelism, MemorySegment pwd, long pwdlen, MemorySegment salt, long saltlen, MemorySegment hash, long hashlen) {
        var mh$ = argon2d_hash_raw$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hash, hashlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_hash_encoded$MH() {
        return RuntimeHelper.requireNonNull(constants$6.const$4,"argon2id_hash_encoded");
    }
    /**
     * {@snippet :
     * int argon2id_hash_encoded(const uint32_t t_cost, const uint32_t m_cost, const uint32_t parallelism, void* pwd, const size_t pwdlen, void* salt, const size_t saltlen, const size_t hashlen, char* encoded, const size_t encodedlen);
     * }
     */
    public static int argon2id_hash_encoded(int t_cost, int m_cost, int parallelism, MemorySegment pwd, long pwdlen, MemorySegment salt, long saltlen, long hashlen, MemorySegment encoded, long encodedlen) {
        var mh$ = argon2id_hash_encoded$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hashlen, encoded, encodedlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_hash_raw$MH() {
        return RuntimeHelper.requireNonNull(constants$6.const$5,"argon2id_hash_raw");
    }
    /**
     * {@snippet :
     * int argon2id_hash_raw(const uint32_t t_cost, const uint32_t m_cost, const uint32_t parallelism, void* pwd, const size_t pwdlen, void* salt, const size_t saltlen, void* hash, const size_t hashlen);
     * }
     */
    public static int argon2id_hash_raw(int t_cost, int m_cost, int parallelism, MemorySegment pwd, long pwdlen, MemorySegment salt, long saltlen, MemorySegment hash, long hashlen) {
        var mh$ = argon2id_hash_raw$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hash, hashlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_hash$MH() {
        return RuntimeHelper.requireNonNull(constants$7.const$1,"argon2_hash");
    }
    /**
     * {@snippet :
     * int argon2_hash(const uint32_t t_cost, const uint32_t m_cost, const uint32_t parallelism, void* pwd, const size_t pwdlen, void* salt, const size_t saltlen, void* hash, const size_t hashlen, char* encoded, const size_t encodedlen, argon2_type type, const uint32_t version);
     * }
     */
    public static int argon2_hash(int t_cost, int m_cost, int parallelism, MemorySegment pwd, long pwdlen, MemorySegment salt, long saltlen, MemorySegment hash, long hashlen, MemorySegment encoded, long encodedlen, int type, int version) {
        var mh$ = argon2_hash$MH();
        try {
            return (int)mh$.invokeExact(t_cost, m_cost, parallelism, pwd, pwdlen, salt, saltlen, hash, hashlen, encoded, encodedlen, type, version);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_verify$MH() {
        return RuntimeHelper.requireNonNull(constants$7.const$3,"argon2i_verify");
    }
    /**
     * {@snippet :
     * int argon2i_verify(char* encoded, void* pwd, const size_t pwdlen);
     * }
     */
    public static int argon2i_verify(MemorySegment encoded, MemorySegment pwd, long pwdlen) {
        var mh$ = argon2i_verify$MH();
        try {
            return (int)mh$.invokeExact(encoded, pwd, pwdlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_verify$MH() {
        return RuntimeHelper.requireNonNull(constants$7.const$4,"argon2d_verify");
    }
    /**
     * {@snippet :
     * int argon2d_verify(char* encoded, void* pwd, const size_t pwdlen);
     * }
     */
    public static int argon2d_verify(MemorySegment encoded, MemorySegment pwd, long pwdlen) {
        var mh$ = argon2d_verify$MH();
        try {
            return (int)mh$.invokeExact(encoded, pwd, pwdlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_verify$MH() {
        return RuntimeHelper.requireNonNull(constants$7.const$5,"argon2id_verify");
    }
    /**
     * {@snippet :
     * int argon2id_verify(char* encoded, void* pwd, const size_t pwdlen);
     * }
     */
    public static int argon2id_verify(MemorySegment encoded, MemorySegment pwd, long pwdlen) {
        var mh$ = argon2id_verify$MH();
        try {
            return (int)mh$.invokeExact(encoded, pwd, pwdlen);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_verify$MH() {
        return RuntimeHelper.requireNonNull(constants$8.const$1,"argon2_verify");
    }
    /**
     * {@snippet :
     * int argon2_verify(char* encoded, void* pwd, const size_t pwdlen, argon2_type type);
     * }
     */
    public static int argon2_verify(MemorySegment encoded, MemorySegment pwd, long pwdlen, int type) {
        var mh$ = argon2_verify$MH();
        try {
            return (int)mh$.invokeExact(encoded, pwd, pwdlen, type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$8.const$3,"argon2d_ctx");
    }
    /**
     * {@snippet :
     * int argon2d_ctx(argon2_context* context);
     * }
     */
    public static int argon2d_ctx(MemorySegment context) {
        var mh$ = argon2d_ctx$MH();
        try {
            return (int)mh$.invokeExact(context);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$8.const$4,"argon2i_ctx");
    }
    /**
     * {@snippet :
     * int argon2i_ctx(argon2_context* context);
     * }
     */
    public static int argon2i_ctx(MemorySegment context) {
        var mh$ = argon2i_ctx$MH();
        try {
            return (int)mh$.invokeExact(context);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$8.const$5,"argon2id_ctx");
    }
    /**
     * {@snippet :
     * int argon2id_ctx(argon2_context* context);
     * }
     */
    public static int argon2id_ctx(MemorySegment context) {
        var mh$ = argon2id_ctx$MH();
        try {
            return (int)mh$.invokeExact(context);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2d_verify_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$9.const$1,"argon2d_verify_ctx");
    }
    /**
     * {@snippet :
     * int argon2d_verify_ctx(argon2_context* context, char* hash);
     * }
     */
    public static int argon2d_verify_ctx(MemorySegment context, MemorySegment hash) {
        var mh$ = argon2d_verify_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, hash);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2i_verify_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$9.const$2,"argon2i_verify_ctx");
    }
    /**
     * {@snippet :
     * int argon2i_verify_ctx(argon2_context* context, char* hash);
     * }
     */
    public static int argon2i_verify_ctx(MemorySegment context, MemorySegment hash) {
        var mh$ = argon2i_verify_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, hash);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2id_verify_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$9.const$3,"argon2id_verify_ctx");
    }
    /**
     * {@snippet :
     * int argon2id_verify_ctx(argon2_context* context, char* hash);
     * }
     */
    public static int argon2id_verify_ctx(MemorySegment context, MemorySegment hash) {
        var mh$ = argon2id_verify_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, hash);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_verify_ctx$MH() {
        return RuntimeHelper.requireNonNull(constants$9.const$5,"argon2_verify_ctx");
    }
    /**
     * {@snippet :
     * int argon2_verify_ctx(argon2_context* context, char* hash, argon2_type type);
     * }
     */
    public static int argon2_verify_ctx(MemorySegment context, MemorySegment hash, int type) {
        var mh$ = argon2_verify_ctx$MH();
        try {
            return (int)mh$.invokeExact(context, hash, type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_error_message$MH() {
        return RuntimeHelper.requireNonNull(constants$10.const$1,"argon2_error_message");
    }
    /**
     * {@snippet :
     * char* argon2_error_message(int error_code);
     * }
     */
    public static MemorySegment argon2_error_message(int error_code) {
        var mh$ = argon2_error_message$MH();
        try {
            return (MemorySegment)mh$.invokeExact(error_code);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle argon2_encodedlen$MH() {
        return RuntimeHelper.requireNonNull(constants$10.const$3,"argon2_encodedlen");
    }
    /**
     * {@snippet :
     * size_t argon2_encodedlen(uint32_t t_cost, uint32_t m_cost, uint32_t parallelism, uint32_t saltlen, uint32_t hashlen, argon2_type type);
     * }
     */
    public static long argon2_encodedlen(int t_cost, int m_cost, int parallelism, int saltlen, int hashlen, int type) {
        var mh$ = argon2_encodedlen$MH();
        try {
            return (long)mh$.invokeExact(t_cost, m_cost, parallelism, saltlen, hashlen, type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    /**
     * {@snippet :
     * #define _POSIX_C_SOURCE 200809
     * }
     */
    public static long _POSIX_C_SOURCE() {
        return 200809L;
    }
    /**
     * {@snippet :
     * #define __TIMESIZE 64
     * }
     */
    public static int __TIMESIZE() {
        return (int)64L;
    }
    /**
     * {@snippet :
     * #define __STDC_IEC_60559_BFP__ 201404
     * }
     */
    public static long __STDC_IEC_60559_BFP__() {
        return 201404L;
    }
    /**
     * {@snippet :
     * #define __STDC_IEC_60559_COMPLEX__ 201404
     * }
     */
    public static long __STDC_IEC_60559_COMPLEX__() {
        return 201404L;
    }
    /**
     * {@snippet :
     * #define __STDC_ISO_10646__ 201706
     * }
     */
    public static long __STDC_ISO_10646__() {
        return 201706L;
    }
    /**
     * {@snippet :
     * #define __WCHAR_MAX 2147483647
     * }
     */
    public static int __WCHAR_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define __WCHAR_MIN -2147483648
     * }
     */
    public static int __WCHAR_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define INT8_MIN -128
     * }
     */
    public static int INT8_MIN() {
        return (int)-128L;
    }
    /**
     * {@snippet :
     * #define INT16_MIN -32768
     * }
     */
    public static int INT16_MIN() {
        return (int)-32768L;
    }
    /**
     * {@snippet :
     * #define INT32_MIN -2147483648
     * }
     */
    public static int INT32_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define INT64_MIN -9223372036854775808
     * }
     */
    public static long INT64_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INT8_MAX 127
     * }
     */
    public static int INT8_MAX() {
        return (int)127L;
    }
    /**
     * {@snippet :
     * #define INT16_MAX 32767
     * }
     */
    public static int INT16_MAX() {
        return (int)32767L;
    }
    /**
     * {@snippet :
     * #define INT32_MAX 2147483647
     * }
     */
    public static int INT32_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define INT64_MAX 9223372036854775807
     * }
     */
    public static long INT64_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINT8_MAX 255
     * }
     */
    public static int UINT8_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define UINT16_MAX 65535
     * }
     */
    public static int UINT16_MAX() {
        return (int)65535L;
    }
    /**
     * {@snippet :
     * #define UINT32_MAX 4294967295
     * }
     */
    public static int UINT32_MAX() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define UINT64_MAX -1
     * }
     */
    public static long UINT64_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST8_MIN -128
     * }
     */
    public static int INT_LEAST8_MIN() {
        return (int)-128L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST16_MIN -32768
     * }
     */
    public static int INT_LEAST16_MIN() {
        return (int)-32768L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST32_MIN -2147483648
     * }
     */
    public static int INT_LEAST32_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST64_MIN -9223372036854775808
     * }
     */
    public static long INT_LEAST64_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST8_MAX 127
     * }
     */
    public static int INT_LEAST8_MAX() {
        return (int)127L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST16_MAX 32767
     * }
     */
    public static int INT_LEAST16_MAX() {
        return (int)32767L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST32_MAX 2147483647
     * }
     */
    public static int INT_LEAST32_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define INT_LEAST64_MAX 9223372036854775807
     * }
     */
    public static long INT_LEAST64_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINT_LEAST8_MAX 255
     * }
     */
    public static int UINT_LEAST8_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define UINT_LEAST16_MAX 65535
     * }
     */
    public static int UINT_LEAST16_MAX() {
        return (int)65535L;
    }
    /**
     * {@snippet :
     * #define UINT_LEAST32_MAX 4294967295
     * }
     */
    public static int UINT_LEAST32_MAX() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define UINT_LEAST64_MAX -1
     * }
     */
    public static long UINT_LEAST64_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define INT_FAST8_MIN -128
     * }
     */
    public static int INT_FAST8_MIN() {
        return (int)-128L;
    }
    /**
     * {@snippet :
     * #define INT_FAST16_MIN -9223372036854775808
     * }
     */
    public static long INT_FAST16_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INT_FAST32_MIN -9223372036854775808
     * }
     */
    public static long INT_FAST32_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INT_FAST64_MIN -9223372036854775808
     * }
     */
    public static long INT_FAST64_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INT_FAST8_MAX 127
     * }
     */
    public static int INT_FAST8_MAX() {
        return (int)127L;
    }
    /**
     * {@snippet :
     * #define INT_FAST16_MAX 9223372036854775807
     * }
     */
    public static long INT_FAST16_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define INT_FAST32_MAX 9223372036854775807
     * }
     */
    public static long INT_FAST32_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define INT_FAST64_MAX 9223372036854775807
     * }
     */
    public static long INT_FAST64_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINT_FAST8_MAX 255
     * }
     */
    public static int UINT_FAST8_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define UINT_FAST16_MAX -1
     * }
     */
    public static long UINT_FAST16_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define UINT_FAST32_MAX -1
     * }
     */
    public static long UINT_FAST32_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define UINT_FAST64_MAX -1
     * }
     */
    public static long UINT_FAST64_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define INTPTR_MIN -9223372036854775808
     * }
     */
    public static long INTPTR_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INTPTR_MAX 9223372036854775807
     * }
     */
    public static long INTPTR_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINTPTR_MAX -1
     * }
     */
    public static long UINTPTR_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define INTMAX_MIN -9223372036854775808
     * }
     */
    public static long INTMAX_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define INTMAX_MAX 9223372036854775807
     * }
     */
    public static long INTMAX_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define UINTMAX_MAX -1
     * }
     */
    public static long UINTMAX_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define PTRDIFF_MIN -9223372036854775808
     * }
     */
    public static long PTRDIFF_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define PTRDIFF_MAX 9223372036854775807
     * }
     */
    public static long PTRDIFF_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define SIG_ATOMIC_MIN -2147483648
     * }
     */
    public static int SIG_ATOMIC_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define SIG_ATOMIC_MAX 2147483647
     * }
     */
    public static int SIG_ATOMIC_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define SIZE_MAX -1
     * }
     */
    public static long SIZE_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define WCHAR_MIN -2147483648
     * }
     */
    public static int WCHAR_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define WCHAR_MAX 2147483647
     * }
     */
    public static int WCHAR_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define WINT_MIN 0
     * }
     */
    public static int WINT_MIN() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define WINT_MAX 4294967295
     * }
     */
    public static int WINT_MAX() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define NULL 0
     * }
     */
    public static MemorySegment NULL() {
        return constants$10.const$4;
    }
    /**
     * {@snippet :
     * #define LLONG_MIN -9223372036854775808
     * }
     */
    public static long LLONG_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define LLONG_MAX 9223372036854775807
     * }
     */
    public static long LLONG_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define ULLONG_MAX -1
     * }
     */
    public static long ULLONG_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define PTHREAD_DESTRUCTOR_ITERATIONS 4
     * }
     */
    public static int PTHREAD_DESTRUCTOR_ITERATIONS() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define SEM_VALUE_MAX 2147483647
     * }
     */
    public static int SEM_VALUE_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define SSIZE_MAX 9223372036854775807
     * }
     */
    public static long SSIZE_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define BC_BASE_MAX 99
     * }
     */
    public static int BC_BASE_MAX() {
        return (int)99L;
    }
    /**
     * {@snippet :
     * #define BC_DIM_MAX 2048
     * }
     */
    public static int BC_DIM_MAX() {
        return (int)2048L;
    }
    /**
     * {@snippet :
     * #define BC_SCALE_MAX 99
     * }
     */
    public static int BC_SCALE_MAX() {
        return (int)99L;
    }
    /**
     * {@snippet :
     * #define BC_STRING_MAX 1000
     * }
     */
    public static int BC_STRING_MAX() {
        return (int)1000L;
    }
    /**
     * {@snippet :
     * #define EXPR_NEST_MAX 32
     * }
     */
    public static int EXPR_NEST_MAX() {
        return (int)32L;
    }
    /**
     * {@snippet :
     * #define LINE_MAX 2048
     * }
     */
    public static int LINE_MAX() {
        return (int)2048L;
    }
    /**
     * {@snippet :
     * #define RE_DUP_MAX 32767
     * }
     */
    public static int RE_DUP_MAX() {
        return (int)32767L;
    }
    /**
     * {@snippet :
     * #define SCHAR_MAX 127
     * }
     */
    public static int SCHAR_MAX() {
        return (int)127L;
    }
    /**
     * {@snippet :
     * #define SHRT_MAX 32767
     * }
     */
    public static int SHRT_MAX() {
        return (int)32767L;
    }
    /**
     * {@snippet :
     * #define INT_MAX 2147483647
     * }
     */
    public static int INT_MAX() {
        return (int)2147483647L;
    }
    /**
     * {@snippet :
     * #define LONG_MAX 9223372036854775807
     * }
     */
    public static long LONG_MAX() {
        return 9223372036854775807L;
    }
    /**
     * {@snippet :
     * #define SCHAR_MIN -128
     * }
     */
    public static int SCHAR_MIN() {
        return (int)-128L;
    }
    /**
     * {@snippet :
     * #define SHRT_MIN -32768
     * }
     */
    public static int SHRT_MIN() {
        return (int)-32768L;
    }
    /**
     * {@snippet :
     * #define INT_MIN -2147483648
     * }
     */
    public static int INT_MIN() {
        return (int)-2147483648L;
    }
    /**
     * {@snippet :
     * #define LONG_MIN -9223372036854775808
     * }
     */
    public static long LONG_MIN() {
        return -9223372036854775808L;
    }
    /**
     * {@snippet :
     * #define UCHAR_MAX 255
     * }
     */
    public static int UCHAR_MAX() {
        return (int)255L;
    }
    /**
     * {@snippet :
     * #define USHRT_MAX 65535
     * }
     */
    public static int USHRT_MAX() {
        return (int)65535L;
    }
    /**
     * {@snippet :
     * #define UINT_MAX 4294967295
     * }
     */
    public static int UINT_MAX() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define ULONG_MAX -1
     * }
     */
    public static long ULONG_MAX() {
        return -1L;
    }
    /**
     * {@snippet :
     * #define CHAR_BIT 8
     * }
     */
    public static int CHAR_BIT() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define CHAR_MIN -128
     * }
     */
    public static int CHAR_MIN() {
        return (int)-128L;
    }
    /**
     * {@snippet :
     * #define CHAR_MAX 127
     * }
     */
    public static int CHAR_MAX() {
        return (int)127L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MIN_LANES 1
     * }
     */
    public static int ARGON2_MIN_LANES() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_LANES 16777215
     * }
     */
    public static int ARGON2_MAX_LANES() {
        return (int)16777215L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MIN_THREADS 1
     * }
     */
    public static int ARGON2_MIN_THREADS() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_THREADS 16777215
     * }
     */
    public static int ARGON2_MAX_THREADS() {
        return (int)16777215L;
    }
    /**
     * {@snippet :
     * #define ARGON2_SYNC_POINTS 4
     * }
     */
    public static int ARGON2_SYNC_POINTS() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MIN_OUTLEN 4
     * }
     */
    public static int ARGON2_MIN_OUTLEN() {
        return (int)4L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_OUTLEN 4294967295
     * }
     */
    public static int ARGON2_MAX_OUTLEN() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MIN_MEMORY 8
     * }
     */
    public static int ARGON2_MIN_MEMORY() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_MEMORY_BITS 32
     * }
     */
    public static long ARGON2_MAX_MEMORY_BITS() {
        return 32L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_MEMORY 4294967295
     * }
     */
    public static long ARGON2_MAX_MEMORY() {
        return 4294967295L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MIN_TIME 1
     * }
     */
    public static int ARGON2_MIN_TIME() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_TIME 4294967295
     * }
     */
    public static int ARGON2_MAX_TIME() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MIN_PWD_LENGTH 0
     * }
     */
    public static int ARGON2_MIN_PWD_LENGTH() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_PWD_LENGTH 4294967295
     * }
     */
    public static int ARGON2_MAX_PWD_LENGTH() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MIN_AD_LENGTH 0
     * }
     */
    public static int ARGON2_MIN_AD_LENGTH() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_AD_LENGTH 4294967295
     * }
     */
    public static int ARGON2_MAX_AD_LENGTH() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MIN_SALT_LENGTH 8
     * }
     */
    public static int ARGON2_MIN_SALT_LENGTH() {
        return (int)8L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_SALT_LENGTH 4294967295
     * }
     */
    public static int ARGON2_MAX_SALT_LENGTH() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MIN_SECRET 0
     * }
     */
    public static int ARGON2_MIN_SECRET() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define ARGON2_MAX_SECRET 4294967295
     * }
     */
    public static int ARGON2_MAX_SECRET() {
        return (int)4294967295L;
    }
    /**
     * {@snippet :
     * #define ARGON2_DEFAULT_FLAGS 0
     * }
     */
    public static int ARGON2_DEFAULT_FLAGS() {
        return (int)0L;
    }
    /**
     * {@snippet :
     * #define ARGON2_FLAG_CLEAR_PASSWORD 1
     * }
     */
    public static int ARGON2_FLAG_CLEAR_PASSWORD() {
        return (int)1L;
    }
    /**
     * {@snippet :
     * #define ARGON2_FLAG_CLEAR_SECRET 2
     * }
     */
    public static int ARGON2_FLAG_CLEAR_SECRET() {
        return (int)2L;
    }
}


