#include<stdio.h>

    int main(){
    int i,j,k,n,l=1;
    printf("enter the number:\n");
    scanf("%d",&n);
    for ( i = 0; i <=n; i++)
    {
        for ( j = n-i; j >0; j--)
        {
            printf(" ");
        }
        for ( k = 1; k <= l; k++)
        {
            printf("*");
        }
        l=l+2;
        printf("\n");
    }
return 0;
}