#include<stdio.h>

    int main(){
    int n,i,c=0;
    printf("enter the number:\n");
    scanf("%d",&n);
    for ( i = 2; i <= n/2; i++)
    {
    if ((n%i==0))
    {
       c++;
    }
   
    }
    if(c==0){
      printf("prime. number");
    }
    else{
        printf("not a prime number");
    }
return 0;
}