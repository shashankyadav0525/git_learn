#include<stdio.h>

    int main(){
    int i,j,k,n,l;
    printf("enter the number:\n");
    scanf("%d",&n);
    for ( i = 0; i <=n; i++)
    {
        for(j=n-1; j>=i; j--){
            printf(" *");
        }
            printf("5");
        
        printf("\n");
    }
return 0;
    }