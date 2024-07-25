#include<stdio.h>

    int main(){
    int i,n,sum=0;
    printf("enter the number:\n");
    scanf("%d",&n);
    printf("even number from 1 to %d are:\n");
for ( i = 1; i <=n; i++)
{
    if (i%2==0)  
    {
    printf("%d\n",n); 
    sum=sum+i;
 }
}
printf("even number is %d",n);
return 0;
}