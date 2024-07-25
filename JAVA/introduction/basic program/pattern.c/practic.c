#include<stdio.h>

    int main(){
    int n,i,j,k,l;
    printf("enter no:\n");
    scanf("%d",&n);
    for ( i = 0; i <=n; i++)
    {
        for ( j = i; j <=n ; j++)
        {
        printf("*");
        }
        for ( k = 0; k < 5; k++)
        {
        for ( l = k; l > 0; l--)
        {
            printf(" ");
        }
        printf(" ");
        }
        printf("\n");
    }
    
return 0;
}