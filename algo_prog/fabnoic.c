#include<stdio.h>
#include<conio.h>
void main() {
    int i,a=0,b=1,c,n;
    printf("enter the value of n");
    scanf("%d",&n);
    for ( i = 1; i <= n; i++)
    {
        
        printf("%d ",a);
        a=a+b;
        a=b;
        b=c;

    }
    
}