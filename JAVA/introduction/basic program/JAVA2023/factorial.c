#include<stdio.h>

    int main(){
    int n,i,p=1;
    printf("enter the number:\n");
    scanf("%d",&n);
    for ( i = n; i > 0; i--)
    {
        p=p*i;
    }
    printf("factorial is %d",p);
return 0;
}