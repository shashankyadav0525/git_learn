#include<stdio.h>

    int main(){
    int i,n,product=1;
    printf("enter the value of n\n");
    scanf("%d",&n);
    for(i=n; i>0; i--)
    { 
        product=product*i;
    }
    printf("recursion is %d",product);
return 0;
}