#include<stdio.h>
    int main(){
    int n,i;
    printf(" please enter the number of table n\n");
    scanf("%d",&n);
    printf("table start from\n");
    scanf("%d",&i);
    for(i<0; i<11; i++){
        printf("table of input number is %d\n",n*i);
    }
return 0;
}