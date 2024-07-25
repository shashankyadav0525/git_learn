#include<stdio.h>

    int main(){
    int n;
    printf("enter the number:\n");
    scanf("%d",&n);
    if ((n%3==0)&&(n%5==0)&&(n%7==0)&&(n%9==0))
    {
        printf("best:\n");
    }
      
    else if ((n%3==0)&&(n%5==0)&&(n%7==0))
    {
     printf("batter:\n");
    }
      
   else if (n%3==0)
    {
        printf("good:\n");
    }
    else{
        printf("poor");
    }
return 0;
}