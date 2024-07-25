#include<stdio.h>

    int main(){
    char name[10]="shashank";
    printf("%c\n",*name);
    printf("%c\n",*(name+1));
    printf("%c",*(name+3));
return 0;
}