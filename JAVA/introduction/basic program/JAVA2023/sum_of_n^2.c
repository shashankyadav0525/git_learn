#include<stdio.h>
#include<math.h>
    int main(){
    int i,sum=0,n,m,r;
    printf("enter the size of natural number:\n");
    scanf("%d",&n);
    printf("enter the power:\n");
    scanf("%d",&m);
for ( i = 1; i <= n; i++)
{
        r=pow(i,m);
        sum=sum+r;
}
printf("the sum of power of natual number is %d:",sum);
return 0;
}