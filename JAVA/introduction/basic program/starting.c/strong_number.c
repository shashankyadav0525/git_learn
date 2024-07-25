#include<stdio.h>

    int main(){
    int i,n,last,a,add,prod;
    printf("enter the number:\n");
    scanf("%d",&n);
    a=n;
    add=0;
    while(n>0)
    {
        last=n%10;
        n=n/10;
        prod=1;
        for(i=1; i<=last; i++)
        prod=prod*i;
        add=add+prod;
    }
    if (add==a)
    {
        printf("%d is strong number:\n",a);
    }
     else{
        printf("%d is not strong number:\n",a);
     }
    
    
return 0;
}