#include<stdio.h>

    int main(){
    int math,physics,chemistry;
    float total;
    printf("enter the maths marks\n");
    scanf("%d",&math);
    printf("enter the physics marks\n");
    scanf("%d",&physics);
    printf("enter the chemistry marks\n");
    scanf("%d",&chemistry);
    total=(math+physics+chemistry)/3;
    if((total<40) || math<33 || physics<33 || chemistry<33){
      printf("your total percent is %f and you are fail\n",total);
    }
    else{
     printf("your total percent is %f and you are pass\n",total);
    }

return 0;
    }