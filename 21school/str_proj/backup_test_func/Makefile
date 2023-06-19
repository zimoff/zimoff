#-lsubunit - lrt
LIBS=-lcheck -lm


ifeq ($(shell uname), Linux)
	LIBS += -lsubunit
endif

test:
	echo $(LIBS)

str:
	gcc -Wall functions/s21_strrchr.c -c -o s21_strrchr.o
mem:
	gcc -Wall functions/s21_memcmp.c -c -o s21_memcmp.o
err:
	gcc -Wall functions/s21_strerror.c -c -o s21_strerror.o

test_str:
	gcc -Wall tests/strrchr_test.c -c $(LIBS) -o strrchr_test.o
test_mem:
	gcc -Wall tests/memcmp_test.c -c $(LIBS) -o memcmp_test.o
test_err:
	gcc -Wall tests/strerror_test.c -c $(LIBS) -o strerror_test.o

build_str: str test_str
	gcc -Wall s21_test_str.c s21_strrchr.o strrchr_test.o $(LIBS) -o s21_str_test.out
build_mem: mem test_mem
	gcc -Wall s21_test_mem.c s21_memcmp.o memcmp_test.o $(LIBS) -o s21_mem_test.out
build_err: err test_err
	gcc -Wall s21_test_strerror.c s21_strerror.o strerror_test.o $(LIBS) -o s21_strerror_test.out

clear:
	rm -rf *.o *.out

build_all: build_str build_mem build_err
