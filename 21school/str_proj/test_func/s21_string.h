#include <stdio.h>

typedef unsigned long long s21_size_t;
#define S21_NULL ((void *)0); //null pointer value


//PART 1
//void *memchr(const void *str, int c, s21_size_t n);
int s21_memcmp(const void *str1, const void *str2, s21_size_t n);
//void *memcpy(void *dest, const void *src, s21_size_t n);
//void *memmove(void *dest, const void *src, s21_size_t n);
//void *memset(void *str, int c, s21_size_t n);
//char *strcat(char *dest, const char *src);
//char *strncat(char *dest, const char *src, s21_size_t n);
//char *strchr(const char *str, int c);
//int strcmp(const char *str1, const char *str2);
//int strncmp(const char *str1, const char *str2, s21_size_t n);
//char *strcpy(char *dest, const char *src);
//char *strncpy(char *dest, const char *src, s21_size_t n);
//size_t strcspn(const char *str1, const char *str2);
char * s21_strerror(int errnum);
//size_t strlen(const char *str);
//char *strpbrk(const char *str1, const char *str2);
char * s21_strrchr(const char *str, int c);
//size_t strspn(const char *str1, const char *str2);
//char *strstr(const char *haystack, const char *needle);
//char *strtok(char *str, const char *delim);

//PART 2
//int sprintf(char *str, const char *format, ...);

//BONUS PART 3 
// int sscanf(const char *str, const char *format, ...);

//BONUS PART 4
// int sprintf(char *str, const char *format, ...);

//BONUS PART 5
// void *to_upper(const char *str);
// void *to_lower(const char *str);
// void *insert(const char *src, const char *str, size_t start_index);
// void *trim(const char *src, const char *trim_chars);
