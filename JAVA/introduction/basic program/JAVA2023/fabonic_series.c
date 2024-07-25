#include<stdio.h>

    int main(){
    int a=0,b=1;
    int i,n,next,a[199];
    next=a+b;
    printf("enter the number:\n");
    scanf("%d",&n);
    for ( i = 3; i <n; i++)
    {
       a=b;
       b=next;
       next=a+b;

    }
            printf("result=%d",next);
            
    
return 0;
}