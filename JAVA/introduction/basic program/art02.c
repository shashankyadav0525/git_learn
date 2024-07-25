#include<stdio.h>
int main(){
    int i,n,sum=0;
    printf("enter the size of array:\n");
    scanf("%d",&n);
    int a[n];
    printf("enter the elements of array:\n");
    for(i=0;i<n;i++){
        scanf("%d",a[i]);
  }
    
     for(i=0;i<n;i++){
        sum=sum+a[i];

     }
     printf("sum of the given elements are : %d",sum);
    
}