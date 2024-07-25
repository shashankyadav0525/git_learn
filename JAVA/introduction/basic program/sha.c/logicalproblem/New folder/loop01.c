#include<stdio.h>

    int main(){
    int a,b,c;
    //let a is ram, b is dhru, c is anuj//
    printf("enter the age of worker \n");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b){
      printf("a is greater then b \n");}
      else{
        printf("a is less then b \n");
      }
      if(a>c){
        printf("a is greater then b \n");
      }
      else{
        printf("a is greater then b \n");

      }
      if(a<b){
        printf("b is greater then a \n");
      }
      else{
       printf("b is greater then a \n"); 
      }
      if(c>a){
        printf("c is greater then a \n");
      }
      else{
        printf("c is less then a \n");
      }
      if(c>b){
        printf("c is greater then b \n");
      }
      else{
        printf("c is less then b \n");
      }
return 0;
}