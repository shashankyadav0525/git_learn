#include<stdio.h>

    int calpercent(int science, int math, int sanskrit);
    int main(){
     int sc=22;
     int math=55;
     int sanskrit=88;
      
      printf("percent is %d",calpercent(sc,math,sanskrit));
    
return 0;
}
int calpercent(int science, int maths, int sanskrit);{
return ((science+math+sanskrit)/3);
}