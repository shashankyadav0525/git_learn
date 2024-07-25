#include<stdio.h>

    int main(){
    int a,b,c;
    printf("enter the number:\n");
    scanf("%d %d %d",&a,&b,&c);
    if (((a+b)%2==0)&&((a+c)%2==0))
    {
        printf("no");
    }
    else{
    printf("yes");
    }
return 0;
}