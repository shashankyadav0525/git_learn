#include<stdio.h>

    int main(){
    int a,b;
    printf("enter the value a \n");
    scanf("%d",&a);
    /*
    printf("enter the value of b\n");
    scanf("%d",&b);*/
    switch(a){
        case 1:
        printf(" pizza\n");
    break;
         case 2:
         printf(" burger\n");
         break;
         case 3:
         printf(" cake\n");
         break;
         default:
         printf("not exist");
            
         }
return 0;
}