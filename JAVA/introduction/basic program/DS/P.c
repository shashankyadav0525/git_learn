#include<stdio.h>

int fun(int x,int y){}
    int main(){
        int a=9,b=4,result;
        int tem;
        tem=a;
        a=b;
        b=tem;
        fun();
        result=swip(a,b);
        printf("%d",result);

    
return 0;
}