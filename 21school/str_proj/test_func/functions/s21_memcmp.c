#include <stdio.h>
int s21_memcmp(const void* dest, const void* src, size_t n){

    unsigned char* tmp_dest = (unsigned char*)dest;
    unsigned char* tmp_src = (unsigned char*)src;
    size_t count = 0;
    int res = 0;

    while((res == 0) && (count < n)){

        res = tmp_dest[count] - tmp_src[count];
        //printf("dest: %d src: %d res: %d\n", tmp_dest[count], tmp_src[count], res);
        count++;
    }

    return res;
}
