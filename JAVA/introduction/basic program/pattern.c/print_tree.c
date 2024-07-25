#include<stdio.h>

    int main(){
    int i,j,k,n;
    printf("enter the number:\n");
     scanf("%d",&n);
     for ( i = 0; i <=n; i++)
     {
        for ( j = 1-i; j >= i; j--)
        {
            printf("*");
        }
        printf("\n");
     }
return 0;
}