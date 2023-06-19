#include <stdio.h>
#include <string.h>

int main(){


	for(int i = -1; i <= 10; i++){
		printf("[%d] = \" %s\", \\\n", i, strerror(i));
	}

	return 0;
}
