#include<stdio.h>

    int main(){
    int i,n;
    printf("enter the number\n");
    scanf("%d",&n);
    for(i=10; i>=1; i--)
    { 
        
        printf("the number is %d\n",n*i);
    }
    return 0;
}