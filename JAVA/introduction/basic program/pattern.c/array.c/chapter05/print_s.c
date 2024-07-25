#include<stdio.h>

    int main(){
    int i,j,k,n;
    printf("enter the element:\n");
    scanf("%d",&n);
    for(i=1; i<=n/2; i++)
    {
        for(j=1; j<=(n/2)-i; j++)
        {
            printf(" ");
        }
        for(k=(2*i)-1; k>=1; k--)
        {
            printf("*");
        }
        printf("\n");
    }
    for(i=1; i<=n/2; i++)
    {
        for(j=(n/2)-i; j>=1; j--)
        {
            printf(" ");
        }
        for(k=1; k<=(2*i)-1; k++)
        {
            printf("*");
        }
        printf("\n");
    }
return 0;
}