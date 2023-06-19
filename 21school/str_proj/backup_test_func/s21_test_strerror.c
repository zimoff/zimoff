#include <stdio.h>
#include <check.h>
#include <string.h>
#include "tests/strerror_test.h"

int main() {

    int res = 0;

    Suite* s;
    SRunner* sr;

    s = s21_strerror_suite();
    sr = srunner_create(s);


    srunner_run_all(sr, CK_NOFORK);

    res = srunner_ntests_failed(sr);
    srunner_free(sr);


    printf("res: %d\n",res);


    return 0;
}
