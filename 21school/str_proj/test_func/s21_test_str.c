#include <check.h>
#include <stdio.h>
#include "tests/strrchr_test.h"

int main(){
    int res = 0;

    Suite* s;
    SRunner* runner;

    //strrchr
    s = s21_string_suite();

    runner = srunner_create(s);

    srunner_run_all(runner, CK_NORMAL);

    res = srunner_ntests_failed(runner);

    srunner_free(runner);

    printf("res strtchr: %d\n",res);

    return 0;
}
