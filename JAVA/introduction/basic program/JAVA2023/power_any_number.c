#include<stdio.h>
    int main(){
    int n,m,r=1;
    printf("enter the base of a number:\n");
    scanf("%d",&n);
    printf("enter the power of a number:\n");
    scanf("%d",&m);
    while (m!=0)
    {
        r=r*n;
        m--;
    }
        printf("%d",r);
return 0;
}