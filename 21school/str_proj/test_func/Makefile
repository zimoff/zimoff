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

	#gcc -Wall tests/strerror_test.c -c $(LIBS) -o strerror_test.o

test_build:
	gcc -Wall $(LIBS) s21_test.c functions/*.c tests/*.c -o 21_test.out


clear:
	rm -rf *.o *.out

