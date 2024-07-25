#include<stdio.h>

    int main(){
    int n,a,b,i;
    printf("enter the num of operation:\n");
    scanf("%d",&n);
    for ( i = 0; i < n; i++)
    {
        scanf("%d %d",&a,&b);

         if (a>b)
        {
             printf("second\n"); 
        }
        else if (a<b)
        {
         printf("first\n");
        }
        else
        {
            printf("any:\n");
        }
        
       
    }
    
return 0;
}