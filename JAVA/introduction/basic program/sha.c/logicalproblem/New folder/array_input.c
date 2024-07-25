#include<stdio.h>

    int main(){
    int a[10], n;
   int sum=0;
     int i;
     printf("enter the number\n");
     scanf("%d",&n);
     for(i=0; i<n; i++)
     {  sum=sum+a[i];
        printf("sum of number is %d\n");
        scanf("%d",&sum);
       
     } 

return 0;
}