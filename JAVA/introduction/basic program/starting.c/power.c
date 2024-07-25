#include<stdio.h>

    int main(){
    int i,p=1,b,a;
    printf("enter the base:\n");
    scanf("%d",&a);
    printf("enter the exponent:\n");
    scanf("%d",&b);
    for ( i = 1; i <=b; i++)
    {
        p=p*a;
    }
    printf("your answer is %d",p);
    
return 0;
}