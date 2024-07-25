#include<stdio.h>

    int main(){
    int i,n,c=0;
    printf("enter the size of array:\n");
    scanf("%d",&n);
    int a[n];
    printf("enter the elements:\n");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }printf("odd numbers from given array are:\n");
    for(i=0;i<n;i++){
        if(a[i]%2!=0){
            c++;
        }
    }
    printf("number of odd:%d\n",c);
return 0;
}