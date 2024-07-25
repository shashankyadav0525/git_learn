#include<stdio.h>
int add(int,int);
void main(){
    int (*p)(int,int);
    int result;
    p=add;
    result=(*p)(2,5);
    printf("%d",result);
}
int add(int a,int b){
    return a+b;
}