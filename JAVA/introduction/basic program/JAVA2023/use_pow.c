#include<stdio.h>
#include<math.h>
    int main(){
    int n,m,r;
    printf("base:\n");
    scanf("%d",&n);
    printf("power:\n");
    scanf("%d",&m);
    r=pow(n,m);
     if (n%5==0)
    {
        printf("result is %d",r+1);
    }
    else{
        printf("result is %d",r);
    }
   

return 0;
}