#include<stdio.h>

  typedef struct std
{
    int roll;
    char name[20];}pankaj;


    int main(){
        pankaj s;
        s.roll=10;
        strcpy(s.name,"pankaj");
        printf("%d\n",s.roll);
        printf("%s",s.name);
return 0;
}