#include<stdio.h>

    int main(){
    float age = 2.2;
    float *ptr = &age;
    printf(" ptr = %u\n",ptr);
    ptr++;
    printf("ptr = %u\n",ptr);
    ptr--;
    printf("ptr =%u\n",ptr);
return 0;
}