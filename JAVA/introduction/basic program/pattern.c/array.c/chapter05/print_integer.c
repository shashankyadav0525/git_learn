#include<stdio.h>

    int main(){
    int i,n,j;
    printf("enter the number of pattern that you want:\n");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        for(j=1; j<=n-i; j++)
        {
            printf("%d",i);
        }
        printf("\n");
    }

return 0;
}