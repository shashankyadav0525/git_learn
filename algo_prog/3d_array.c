#include<stdio.h>
void main() {
    int a[3][2][3]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
    printf("%d",(*a+1));
    printf("\n");
        printf("%d",**a);

}