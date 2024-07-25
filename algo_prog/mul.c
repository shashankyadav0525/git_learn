#include<stdio.h>
int result;
int multiply(int x, int y){
    int result1=x*y;
   /* int result=x+y;
    int result=x-y;
    int result=x/y;
    int result=x%y;
*/
    return result1;
    


}
int main(){
    int a,b,ans;
    printf("enter the two value of x and y\n");
    scanf("%d", &a);
    scanf("%d", &b);
ans=multiply(a,b);
    printf("%d",  ans);
}