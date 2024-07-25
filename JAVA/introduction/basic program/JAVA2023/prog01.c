#include<stdio.h>

    int main(){
    int i,n,r,a[10];
    printf("enter the size of number:\n");
    scanf("%d",&n);
    printf("enter the number:\n");
    for(i=0; i<n; i++){
   scanf("%d",&a[i]);
    }
    for ( i = 0; i <= n; i++)
    {
        if(a[i]%2!=0){
    printf("%d",a[i]);}   
    }
    printf("None");

return 0;
}