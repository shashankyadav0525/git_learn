#include<stdio.h>
#include<math.h>
    int main(){
    int i,x,y,n;
    float a,b;
    float c,sum=0;
    printf("enter the value of n");
    scanf("%d",&n);
    printf("enter the value of x and y\n");
    scanf("%d%d",&x,&y);
    for(i=1; i<=n; i++)
    {
        a=x+(i-1);
        b=pow(y,2*i-1);
        c=a/b;
        sum=sum+c;

        
        
    }
    printf("our answer is %f \n",sum);
return 0;
}