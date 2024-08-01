#include<stdio.h>
//int fun(int,int);
int fun(int a,int b){
    int c=a+b;
return c;
}
fun2(int a,int b){
    int c=a*b;
}
fun3(int a,int b){
    int c=a/b;
}
void main(){
int result1=fun(5,3);
int result2=fun(1,3);
int result3=fun3(81,9);
printf("%d\n",result1);
printf("%d\n",result2);
printf("%d\n",result3);

}
