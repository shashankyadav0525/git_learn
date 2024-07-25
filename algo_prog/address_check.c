#include<stdio.h>
void main(){
    int a=9,b=10;
    printf("%d %d",*(&a),&b);
}