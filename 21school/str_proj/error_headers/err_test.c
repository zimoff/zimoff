#include <stdio.h>
#include <string.h>
#include <errno.h>

int main(){


    printf("start:\n");
    int count = 1;

    
    for(int i = -1; i <= 134; i++){
        printf("test code:%3d | %s\n", i, strerror(i));
    }

//sysdeps/gnu/errlist.h

 //EPERM                          0x40000001
    printf("err code:%3d | %s\n", EPERM, strerror(EPERM));
    printf("count:%d\n\n", count++);

 //ENOENT                         0x40000002
    printf("err code:%3d | %s\n", ENOENT, strerror(ENOENT));
    printf("count:%d\n\n", count++);

 //ESRCH                          0x40000003
    printf("err code:%3d | %s\n", ESRCH, strerror(ESRCH));
    printf("count:%d\n\n", count++);

 //EINTR                          0x40000004
    printf("err code:%3d | %s\n", EINTR, strerror(EINTR));
    printf("count:%d\n\n", count++);

 //EIO                            0x40000005
    printf("err code:%3d | %s\n", EIO, strerror(EIO));
    printf("count:%d\n\n", count++);

 //ENXIO                          0x40000006
    printf("err code:%3d | %s\n", ENXIO, strerror(ENXIO));
    printf("count:%d\n\n", count++);

 //E2BIG                          0x40000007
    printf("err code:%3d | %s\n", E2BIG, strerror(E2BIG));
    printf("count:%d\n\n", count++);

 //ENOEXEC                        0x40000008
    printf("err code:%3d | %s\n", ENOEXEC, strerror(ENOEXEC));
    printf("count:%d\n\n", count++);

 //EBADF                          0x40000009
    printf("err code:%3d | %s\n", EBADF, strerror(EBADF));
    printf("count:%d\n\n", count++);
    
 //ECHILD                         0x4000000a
    printf("err code:%3d | %s\n", ECHILD, strerror(ECHILD));
    printf("count:%d\n\n", count++);

 //EDEADLK                        0x4000000b
    printf("err code:%3d | %s\n", EDEADLK, strerror(EDEADLK));
    printf("count:%d\n\n", count++);
    
 //ENOMEM                         0x4000000c
    printf("err code:%3d | %s\n", ENOMEM, strerror(ENOMEM));
    printf("count:%d\n\n", count++);

 //EACCES                         0x4000000d
    printf("err code:%3d | %s\n", EACCES, strerror(EACCES));
    printf("count:%d\n\n", count++);

 //EFAULT                         0x4000000e
    printf("err code:%3d | %s\n", EFAULT, strerror(EFAULT));
    printf("count:%d\n\n", count++);

 //ENOTBLK                        0x4000000f
    printf("err code:%3d | %s\n", ENOTBLK, strerror(ENOTBLK));
    printf("count:%d\n\n", count++);

 //EBUSY                          0x40000010
    printf("err code:%3d | %s\n", EBUSY, strerror(EBUSY));
    printf("count:%d\n\n", count++);

 //EEXIST                         0x40000011
    printf("err code:%3d | %s\n", EEXIST, strerror(EEXIST));
    printf("count:%d\n\n", count++);

 //EXDEV                          0x40000012
    printf("err code:%3d | %s\n", EXDEV, strerror(EXDEV));
    printf("count:%d\n\n", count++);

 //ENODEV                         0x40000013
    printf("err code:%3d | %s\n", ENODEV, strerror(ENODEV));
    printf("count:%d\n\n", count++);

 //ENOTDIR                        0x40000014
    printf("err code:%3d | %s\n", ENOTDIR, strerror(ENOTDIR));
    printf("count:%d\n\n", count++);

 //EISDIR                         0x40000015
    printf("err code:%3d | %s\n", EISDIR, strerror(EISDIR));
    printf("count:%d\n\n", count++);

 //EINVAL                         0x40000016
    printf("err code:%3d | %s\n", EINVAL, strerror(EINVAL));
    printf("count:%d\n\n", count++);

 //EMFILE                         0x40000018
    printf("err code:%3d | %s\n", EMFILE, strerror(EMFILE));
    printf("count:%d\n\n", count++);

 //ENFILE                         0x40000017
    printf("err code:%3d | %s\n", ENFILE, strerror(ENFILE));
    printf("count:%d\n\n", count++);

 //ENOTTY                         0x40000019
    printf("err code:%3d | %s\n", ENOTTY, strerror(ENOTTY));
    printf("count:%d\n\n", count++);

 //ETXTBSY                        0x4000001a
    printf("err code:%3d | %s\n", ETXTBSY, strerror(ETXTBSY));
    printf("count:%d\n\n", count++);

 //EFBIG                          0x4000001b
    printf("err code:%3d | %s\n", EFBIG, strerror(EFBIG));
    printf("count:%d\n\n", count++);

 //ENOSPC                         0x4000001c
    printf("err code:%3d | %s\n", ENOSPC, strerror(ENOSPC));
    printf("count:%d\n\n", count++);

 //ESPIPE                         0x4000001d
    printf("err code:%3d | %s\n", ESPIPE, strerror(ESPIPE));
    printf("count:%d\n\n", count++);

 //EROFS                          0x4000001e
    printf("err code:%3d | %s\n", EROFS, strerror(EROFS));
    printf("count:%d\n\n", count++);

 //EMLINK                         0x4000001f
    printf("err code:%3d | %s\n", EMLINK, strerror(EMLINK));
    printf("count:%d\n\n", count++);

 //EPIPE                          0x40000020
    printf("err code:%3d | %s\n", EPIPE, strerror(EPIPE));
    printf("count:%d\n\n", count++);

 //EDOM                           0x40000021
    printf("err code:%3d | %s\n", EDOM, strerror(EDOM));
    printf("count:%d\n\n", count++);

 //ERANGE                         0x40000022
    printf("err code:%3d | %s\n", ERANGE, strerror(ERANGE));
    printf("count:%d\n\n", count++);

 //EAGAIN                         0x40000023
    printf("err code:%3d | %s\n", EAGAIN, strerror(EAGAIN));
    printf("count:%d\n\n", count++);

#define EWOULDBLOCK                    EAGAIN
    printf("err code:%3d | %s\n", EWOULDBLOCK, strerror(EWOULDBLOCK));
    printf("count:%d\n\n", count++);
    
 //EINPROGRESS                    0x40000024
    printf("err code:%3d | %s\n", EINPROGRESS, strerror(EINPROGRESS));
    printf("count:%d\n\n", count++);

 //EALREADY                       0x40000025
    printf("err code:%3d | %s\n", EALREADY, strerror(EALREADY));
    printf("count:%d\n\n", count++);

 //ENOTSOCK                       0x40000026
    printf("err code:%3d | %s\n", ENOTSOCK, strerror(ENOTSOCK));
    printf("count:%d\n\n", count++);

 //EMSGSIZE                       0x40000028
    printf("err code:%3d | %s\n", EMSGSIZE, strerror(EMSGSIZE));
    printf("count:%d\n\n", count++);

 //EPROTOTYPE                     0x40000029
    printf("err code:%3d | %s\n", EPROTOTYPE, strerror(EPROTOTYPE));
    printf("count:%d\n\n", count++);

 //ENOPROTOOPT                    0x4000002a
    printf("err code:%3d | %s\n", ENOPROTOOPT, strerror(ENOPROTOOPT));
    printf("count:%d\n\n", count++);

 //EPROTONOSUPPORT                0x4000002b
    printf("err code:%3d | %s\n", EPROTONOSUPPORT, strerror(EPROTONOSUPPORT));
    printf("count:%d\n\n", count++);
    

////*ESOCKTNOSUPPORT                0x4000002c

 //EOPNOTSUPP                     0x4000002d
    printf("err code:%3d | %s\n", EOPNOTSUPP, strerror(EOPNOTSUPP));
    printf("count:%d\n\n", count++);
    

////*EPFNOSUPPORT                   0x4000002e


 //EAFNOSUPPORT                   0x4000002f
    printf("err code:%3d | %s\n", EAFNOSUPPORT, strerror(EAFNOSUPPORT));
    printf("count:%d\n\n", count++);

 //EADDRINUSE                     0x40000030
    printf("err code:%3d | %s\n", EADDRINUSE, strerror(EADDRINUSE));
    printf("count:%d\n\n", count++);

 //EADDRNOTAVAIL                  0x40000031
    printf("err code:%3d | %s\n", EADDRNOTAVAIL, strerror(EADDRNOTAVAIL));
    printf("count:%d\n\n", count++);

 //ENETDOWN                       0x40000032
    printf("err code:%3d | %s\n", ENETDOWN, strerror(ENETDOWN));
    printf("count:%d\n\n", count++);

 //ENETUNREACH                    0x40000033
    printf("err code:%3d | %s\n", ENETUNREACH, strerror(ENETUNREACH));
    printf("count:%d\n\n", count++);

 //ENETRESET                      0x40000034
    printf("err code:%3d | %s\n", ENETRESET, strerror(ENETRESET));
    printf("count:%d\n\n", count++);

 //ECONNABORTED                   0x40000035
    printf("err code:%3d | %s\n", ECONNABORTED, strerror(ECONNABORTED));
    printf("count:%d\n\n", count++);

 //ECONNRESET                     0x40000036
    printf("err code:%3d | %s\n", ECONNRESET, strerror(ECONNRESET));
    printf("count:%d\n\n", count++);

 //ENOBUFS                        0x40000037
    printf("err code:%3d | %s\n", ENOBUFS, strerror(ENOBUFS));
    printf("count:%d\n\n", count++);

 //EISCONN                        0x40000038
    printf("err code:%3d | %s\n", EISCONN, strerror(EISCONN));
    printf("count:%d\n\n", count++);

 //ENOTCONN                       0x40000039
    printf("err code:%3d | %s\n", ENOTCONN, strerror(ENOTCONN));
    printf("count:%d\n\n", count++);

 //EDESTADDRREQ                   0x40000027
    printf("err code:%3d | %s\n", EDESTADDRREQ, strerror(EDESTADDRREQ));
    printf("count:%d\n\n", count++);

////*ESHUTDOWN                      0x4000003a
////*ETOOMANYREFS                   0x4000003b
//eeeeeeeeeeeeeeeeeeeeeeeeeeee

 //ETIMEDOUT                      0x4000003c
    printf("err code:%3d | %s\n", ETIMEDOUT, strerror(ETIMEDOUT));
    printf("count:%d\n\n", count++);

 //ECONNREFUSED                   0x4000003d
    printf("err code:%3d | %s\n", ECONNREFUSED, strerror(ECONNREFUSED));
    printf("count:%d\n\n", count++);

 //ELOOP                          0x4000003e
    printf("err code:%3d | %s\n", ELOOP, strerror(ELOOP));
    printf("count:%d\n\n", count++);

 //ENAMETOOLONG                   0x4000003f
    printf("err code:%3d | %s\n", ENAMETOOLONG, strerror(ENAMETOOLONG));
    printf("count:%d\n\n", count++);


////*EHOSTDOWN                      0x40000040


 //EHOSTUNREACH                   0x40000041
    printf("err code:%3d | %s\n", EHOSTUNREACH, strerror(EHOSTUNREACH));
    printf("count:%d\n\n", count++);

 //ENOTEMPTY                      0x40000042
    printf("err code:%3d | %s\n", ENOTEMPTY, strerror(ENOTEMPTY));
    printf("count:%d\n\n", count++);

////*EPROCLIM                       0x40000043
////*EUSERS                         0x40000044

 //EDQUOT                         0x40000045
    printf("err code:%3d | %s\n", EDQUOT, strerror(EDQUOT));
    printf("count:%d\n\n", count++);

 //ESTALE                         0x40000046
    printf("err code:%3d | %s\n", ESTALE, strerror(ESTALE));
    printf("count:%d\n\n", count++);

////*EREMOTE                        0x40000047
////*EBADRPC                        0x40000048
////*ERPCMISMATCH                   0x40000049
////*EPROGUNAVAIL                   0x4000004a
////*EPROGMISMATCH                  0x4000004b
////*EPROCUNAVAIL                   0x4000004c

 //ENOLCK                         0x4000004d
    printf("err code:%3d | %s\n", ENOLCK, strerror(ENOLCK));
    printf("count:%d\n\n", count++);

////*EFTYPE                         0x4000004f
////*EAUTH                          0x40000050
////*ENEEDAUTH                      0x40000051

 //ENOSYS                         0x4000004e
    printf("err code:%3d | %s\n", ENOSYS, strerror(ENOSYS));
    printf("count:%d\n\n", count++);

////*ELIBEXEC                       0x40000053

 //ENOTSUP                        0x40000076
    printf("err code:%3d | %s\n", ENOTSUP, strerror(ENOTSUP));
    printf("count:%d\n\n", count++);

 //EILSEQ                         0x4000006a
    printf("err code:%3d | %s\n", EILSEQ, strerror(EILSEQ));
    printf("count:%d\n\n", count++);


////*EBACKGROUND                    0x40000064
////*EDIED                          0x40000065
////*ED                             0x40000066
////*EGREGIOUS                      0x40000067
////*EIEIO                          0x40000068
////*EGRATUITOUS                    0x40000069

 //EBADMSG                        0x4000006b
    printf("err code:%3d | %s\n", EBADMSG, strerror(EBADMSG));
    printf("count:%d\n\n", count++);

 //EIDRM                          0x4000006c
    printf("err code:%3d | %s\n", EIDRM, strerror(EIDRM));
    printf("count:%d\n\n", count++);

 //EMULTIHOP                      0x4000006d
    printf("err code:%3d | %s\n", EMULTIHOP, strerror(EMULTIHOP));
    printf("count:%d\n\n", count++);

 //ENODATA                        0x4000006e
    printf("err code:%3d | %s\n", ENODATA, strerror(ENODATA));
    printf("count:%d\n\n", count++);

 //ENOLINK                        0x4000006f
    printf("err code:%3d | %s\n", ENOLINK, strerror(ENOLINK));
    printf("count:%d\n\n", count++);

 //ENOMSG                         0x40000070
    printf("err code:%3d | %s\n", ENOMSG, strerror(ENOMSG));
    printf("count:%d\n\n", count++);

 //ENOSR                          0x40000071
    printf("err code:%3d | %s\n", ENOSR, strerror(ENOSR));
    printf("count:%d\n\n", count++);

 //ENOSTR                         0x40000072
    printf("err code:%3d | %s\n", ENOSTR, strerror(ENOSTR));
    printf("count:%d\n\n", count++);

 //EOVERFLOW                      0x40000073
    printf("err code:%3d | %s\n", EOVERFLOW, strerror(EOVERFLOW));
    printf("count:%d\n\n", count++);

 //EPROTO                         0x40000074
    printf("err code:%3d | %s\n", EPROTO, strerror(EPROTO));
    printf("count:%d\n\n", count++);

 //ETIME                          0x40000075
    printf("err code:%3d | %s\n", EPERM, strerror(EPERM));
    printf("count:%d\n\n", count++);

 //ECANCELED                      0x40000077
    printf("err code:%3d | %s\n", ECANCELED, strerror(ECANCELED));
    printf("count:%d\n\n", count++);

 //EOWNERDEAD                     0x40000078
    printf("err code:%3d | %s\n", EOWNERDEAD, strerror(EOWNERDEAD));
    printf("count:%d\n\n", count++);

 //ENOTRECOVERABLE                0x40000079
    printf("err code:%3d | %s\n", ENOTRECOVERABLE, strerror(ENOTRECOVERABLE));
    printf("count:%d\n\n", count++);

 return 0;
}
