#include <stdio.h>
#include "s21_strerror.h"

char* s21_strerror(int errnum){

    char* tmp = NULL;

    ERR_ARR_INIT(err_arr);
    if(errnum < 0 || errnum > ARR_SIZE)
        tmp = (char*)unknown_error;
    else
        tmp = (char*)err_arr[errnum];

    return tmp;
}
