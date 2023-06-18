#include <stdio.h>
#include <string.h>
#include "s21_strerror.h"

int check_digit_len(int num){

    if(num < 0)
        num *= -1;

    int count = 0;
    while(num > 0){
        num /= 10;
        count++;
    }
    return count;
}

char* s21_strerror(int errnum){


    UERR(uerr);
    ERR_ARR_INIT(err_arr);

    char* tmp_str = NULL;
    int num_len = check_digit_len(errnum);
    int ind = 13;
    int tmp_num = errnum;

    if(errnum < 0){
        //errnum *= -1;
        tmp_num *= -1;
        ind++;
        *(uerr + ind) = '-';
    }

    if(errnum < 0 || errnum > ARR_SIZE - 1){

        while(num_len > 0){
            *(uerr + ind + num_len) = (tmp_num % 10) + 48;
            tmp_num /= 10;
            num_len--;
        }
        tmp_str = uerr;
    }else
       tmp_str = (char*)err_arr[errnum];

    return tmp_str;
}

    //int tmp = err_num;

    //int num_len = check_digit_len(err_num);
    //printf("chars:\n");
    //show_char(uerr, 30);



