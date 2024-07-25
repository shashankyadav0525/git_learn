#include<stdio.h>

    int main(){
    int i,n,a;
    printf("enter the no\n");
    scanf("%d",&n);
    for ( i = 2; i < n/2; i++)
    {
        a=n%i;
    }
        if (a==0)
        {
            printf("n p\n");
            return ;
            
        }
            printf("p\n");
return 0;
}