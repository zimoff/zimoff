#-lsubunit - lrt
LIBS=-lcheck -lm


ifeq ($(shell uname), Linux)
	LIBS += -lsubunit 
endif

str:
	gcc -Wall functions/s21_strrchr.c -c -o s21_strrchr.o
mem:
	gcc -Wall functions/s21_memcmp.c -c -o s21_memcmp.o
err:
	gcc -Wall functions/s21_strerror.c -c -o s21_strerror.o

test_build:
	gcc -Wall s21_test.c functions/*.c tests/*.c -o 21_test.out $(LIBS)
# gcc $(FLAGS) $(COVERAGE) -o s21_test s21_test.c tests/*.c functions/*.c -lcheck -lm



clear:
	rm -rf *.o *.out

