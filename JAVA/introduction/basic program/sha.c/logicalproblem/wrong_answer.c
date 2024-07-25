#include<stdio.h>

    int main(){
    int i,n,product=1,b=1;
    printf("enter the value of n\n");
    scanf("%d",&n);
        
    for(i=n; i>0; i--)
    { 
        b=product*i*b;
    }
    int j,m,a;
    printf("enter the value of m\n");
    scanf("%d",&m);
    for(j=0; j<=m; j++)
    {
        a=j;
    }
    int c;
    float sum=0;
    c=a/b;
    sum=sum+c;
printf("our answer is %f",sum);
return 0;
}