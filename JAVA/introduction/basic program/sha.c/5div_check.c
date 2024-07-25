#include<stdio.h>

    int main(){
    int i,n,c=0;
    printf("enter the any value \n");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
    if(97%i==0){
        printf("97 is divisible by %d\n",i );}
        else{
            c--;
            

        }
    }
    if(c<0){
        printf("not divisble by any number below it");
    }
    
return 0;
}