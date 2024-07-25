#include<stdio.h>

/*int sum(){
    int x,y;
    int result;
    printf("enter the two number:\n");
    scanf("%d %d",&x,&y);
    result=x+y;
    printf("%d",result);}*/
int sum(int x,int y){
    int res;
    res=x+y;
    printf("answer is --->%d\n",res);
}
    int main(){
    int a,b,ans;
    printf("entr the two num:\n");
    scanf("%d %d",&a,&b);
    sum(a,b);
return 0;
}