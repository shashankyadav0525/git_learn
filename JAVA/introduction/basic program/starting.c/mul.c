#include<stdio.h>
int mul(int x,int y)
{
    int result;
    result=x*y;
    return result;
}
void main(){
    int a=10,b=20,ans;
    ans=mul(a,b);
    printf("%d",ans);
}