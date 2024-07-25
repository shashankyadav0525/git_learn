#include<stdio.h>
void move(int n, char s, char d, char a){
if(n==1){
printf( "move from,%c, to %c", s, d);
}
else{
    move(n-1,s,a,d);
     move(1,s,d,a);
     move(n-1, a,d,s);
}
}
void main(){
    int n;
    printf("enter the disk\n");
    scanf("%d",&n);
    move(n,'A','C','B');
}
