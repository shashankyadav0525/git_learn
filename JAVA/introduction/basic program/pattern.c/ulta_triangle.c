#include<stdio.h>

    int main(){
    int i,j,n;
    printf("enter the no:\n");
    scanf("%d",&n);
    for ( i = 0; i < n; i++)
    {
        for ( j = n-i; j >0 ; j--)
        {
              printf(" ");
        }
              
              printf("*\n");
            }
    
return 0;
}