#include<stdio.h>

    int main(){
    int i,j,n;
    printf("enter the number:\n");
    scanf("%d",&n);
    for ( i = 1; i <= n; i++)
    {
       for ( j = i; j >=1 ; j--){
        
            printf("* ");
        }
        printf("\n");
    
    }
return 0;
}