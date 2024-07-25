#include<stdio.h>

    int main(){
    int i,n,x,j,m;
    float y,p=1,a,b=1;
    printf("enter the value of n \n");
    scanf("%d",&n);
    float sum=0;
    for(i=1; i<=n; i++)
    {
        a=i;
      for(j=1; j<=i; j++)
      {
        b=p*j*b;
      }
    
    y=a/b;
        sum=sum+y;
    }
    
    printf("our answer is %f",sum);
return 0;
}