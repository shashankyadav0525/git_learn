#include<stdio.h>

    int main(){
    int i,j;
    for (i=1; i<=5;i++){
        for(j=1;j<=10-i;j++){

if((j<=i)||(j>=10-i+1)){
    printf("*");
}else
{
    printf(" ");
}

        }
        printf("\n");
    }
return 0;
}