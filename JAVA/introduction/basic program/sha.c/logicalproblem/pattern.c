#include<stdio.h>

    int main(){
    int i,n,j;
    printf("enter the value of n\n");
    scanf("%d",&n);
    for(i=0; i<=n; i++)
    {
        for(j=i-1; j>0; j--)
        {
        printf("*");
        }
        printf("\n");
    }
    

return 0;
}