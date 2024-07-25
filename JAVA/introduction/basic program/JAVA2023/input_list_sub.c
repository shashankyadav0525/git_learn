#include<stdio.h>

    int main(){
    int i,j,c,a,b,n;
    printf("enter the num of operation:\n");
    scanf("%d",&n);
    printf("enter the 1st num:\n");
    for ( i = 0; i < n; i++)
    {
        scanf("%d %d",&a,&b);
        c=a-b;
        printf("ans=%d\n",c);  
    }
   
  printf("the end:\n");

    

return 0;
}