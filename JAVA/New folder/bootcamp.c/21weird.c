#include<stdio.h>

    int main(){
    int i,n;
    printf("enter the number:\n");
    scanf("%d",&n);
    if (n%2!=0)
    {
        printf("weird:\n");
    }
    else{
        if ((n>=2) &&(n<=5))
        {
            printf("not weird\n");
        }
        if ((n>=6)&&(n<=20))
        {
            printf("weird\n");
        }
        if (n>=20)
        {
            printf("not weird:\n");
        }
    }
return 0;
}