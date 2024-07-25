#include<stdio.h>

    int main(){
    int a[50],i,sum=0;
    printf("enter the number\n");
    for(i=0; i<=10; i++)
    {
        scanf("%d",&a[i]);
        sum=sum+a[i];
        
    }
    printf("sum is %d",sum);
return 0;
}