#include<stdio.h>

    int main(){
    int a[5],i;
    int *ptr=&a[0];
    printf(" enter the element of set A\n");
    for(i=0; i<3; i++)
    {
    printf(" %d index :", i);
    scanf("%d",ptr++);    
    }
    printf("enter the element of set B\n");
    int b[4],j;
    int *ele=&b[0];
    for(j=0; j<2; j++)
    {
    printf("%d index :",j);
    scanf("%d",ele++);
    }

return 0;
}