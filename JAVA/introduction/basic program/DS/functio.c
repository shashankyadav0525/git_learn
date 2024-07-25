#include<stdio.h>

int fun(){
    int a=3,b=9,res,mul;
    printf("%d\n",res=a+b);
    printf("%d\n",mul=a*b);

}
    void main(){
    int choise;
    do{
    printf("press 1 for add:\n");
    printf("press 2 for multiplication:\n");
    switch (choise)
    {
    case 1:fun();
        
        break;
    
    default:
        break;
    }
    }
    
return 0;
}