
lib: s21_strerror.c
	gcc -Wall s21_strerror.c -c -o s21_strerror.o

build: s21_strerror.o
	gcc -Wall err_test_main.c s21_strerror.o -lcheck -lsubunit -lm -lpthread -lrt

clear:
	rm *.o
	rm a.out

rebuild: clear lib build
all: lib build
