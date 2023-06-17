#include <check.h>
#include <stdio.h>
#include "tests/memcmp_test.h"

int main(){
    int res = 0;

    Suite* s;
    SRunner* runner;

    //memcmp
    s = s21_memcmp_suite();

    runner = srunner_create(s);

    srunner_run_all(runner, CK_NORMAL);

    res = srunner_ntests_failed(runner);

    srunner_free(runner);

    printf("res memcmp: %d\n",res);

    return 0;
}
