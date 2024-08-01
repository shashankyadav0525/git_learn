#include<stdio.h>
int a=9;
void f(int y){
int a=3;
a=y-a;

printf("a = %d\n",a);
}
void main(){
    f(a);
}