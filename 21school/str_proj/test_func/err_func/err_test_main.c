#include <stdio.h>
#include <string.h>
#include <check.h>
#include "s21_strerror.h"

START_TEST(str_err_test){

    ck_assert_str_eq(s21_strerror(_i), strerror(_i));
}
END_TEST

Suite* err_test_suite(){
    Suite* s = NULL;
    TCase* tc_err = NULL;

    s = suite_create("err_suite");
    tc_err = tcase_create("err_case");

    tcase_add_loop_test(tc_err, str_err_test, 0 , 133);
    suite_add_tcase(s, tc_err);

    return s;
}

int main(){

    int res = 0;

    Suite* s;
    SRunner* sr;

    s = err_test_suite();
    sr = srunner_create(s);

    srunner_run_all(sr, CK_NOFORK);

    res = srunner_ntests_failed(sr);
    srunner_free(sr);


    printf("res: %d\n",res);


    return 0;
}
