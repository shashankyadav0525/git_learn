#include<stdio.h>

    int main(){
    int i,n,a=5,b=6,sum=0;
    printf("enter the number:\n");
    scanf("%d",&n);
    for ( i = 0; i < n; i++)
    {
        sum=sum+(a++)+(b++);
    }
    printf("%d",sum);
return 0;
}