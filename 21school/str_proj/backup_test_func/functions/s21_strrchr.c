#include <stdio.h>
char* s21_strrchr(const char* str, int c){

    int count = 0;
    char* tmp = NULL;

    //printf("!ch: %c ", *(str + count));

    while(*(str + count) != '\0'){
        //printf("ch: %c ", *(str + count));

        if(*(str + count) == c)
            tmp = (char*)(str + count);

        count++;
    }

    return tmp;
     
}
