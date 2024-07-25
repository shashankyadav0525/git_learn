#include<stdio.h>

    int main(){
    int a[10],sum=0;
    int i,n;
    printf("enter the number\n");
    scanf("%d",&n);
    for(i=0; i<=9; i++)
    {
        scanf("%d",&a[i]);
        sum=sum+a[i];
        printf("sum is %d\n",sum);
    }
return 0;
}
void display(){
    char addition,exit;
    char choise;
    switch (choise)
    {
    case 1:(addition);
    printf("press 1 to addition");
        break;
    
    default: (exit);
    printf("press 2 exit");
        break;
    }
}