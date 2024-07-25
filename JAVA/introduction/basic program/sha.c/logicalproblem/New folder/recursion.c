#include<stdio.h>

    int main(){
    int i,n,fact=1;
    printf("enter the element\n");
    scanf("%d",&n);
     
    for(i=1; i<=n; i++)

    {
    fact=fact*i;
    
    }
    printf("final factorial is %d",fact);
    
    
return 0;
}