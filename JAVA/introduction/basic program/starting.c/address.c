#include<stdio.h>

void main(){
int a[2][3][2]={1,2,3,4,5,6,7,8,9,10,11,12};
printf("%u\n",a);
printf("%u\n",&a);
printf("%u\n",a[0][0]);
printf("%u\n",a[0][1][0]);
}