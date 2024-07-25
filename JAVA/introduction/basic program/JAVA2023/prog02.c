#include<stdio.h>

    int main(){
    int i,n,j,a[10];
    printf("enter the Binary number:\n");
    scanf("%d",&n);
        printf("binary conversion:\n");
        for ( i = 0; n>0; i++)
        {
            a[i]=n%2;
            n=n/2;
        }
        for ( j = i-1; j >0; j--)
            {
            printf("%d",a[j]);
            }
            
        

        
return 0;
}