#include<stdio.h>

    int main(){
    int n;
    printf("enter the size of array\n");
    scanf("%d",&n);
    int i,a[n];
    printf("enter the element of array:\n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }  printf("reverse of array is:\n");
    for(i=n-1; i>=0; i--)
    {
        printf("%d",a[i]);
    }
    return 0;
}