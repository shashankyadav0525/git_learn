#include<stdio.h>
static int fun(n){
if(n<=0)
{
    return n;
}
else
{
    int a=2, b=9;
    a+=b;
    printf("%d ", a);
    fun(n-1);
}
}
void main(){
    fun(5);
}


