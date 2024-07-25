#include<stdio.h>
void swap(int , int);
void swap(int a,int b){
    int temp,a,b;
    temp=a;
    a=b;
    b=temp;
}
void main(){
    int x =15, y =2;
    printf("x=%dy=%d", x,y);
    swap(x,y);
    printf("x=%dy=%d", x,y);
}

