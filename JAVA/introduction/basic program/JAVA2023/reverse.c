#include<stdio.h>
    int main(){
    int n,remender ,rev=0;
    printf("enter the number:\n");
    scanf("%d",&n);
printf("count the integer of n:\n");
    
    while (n!=0)
    {
        remender=n%10;
        rev=rev*10+remender;
        n=n/10;
    }
    printf("%d",rev);
return 0;
}