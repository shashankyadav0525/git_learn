#include<stdio.h>

    int main(){
    int n;
    printf("enter the size of array\n");
    scanf("%d",&n);
    int a[n],i;
    printf("enter the elements:\n");
    for(i=0; i<n; i++)
    {scanf("%d",&a[i]);
    printf("the odd number from given array are :\n");
    }
    for(i=0; i<n; i++)
    {
    if(a[i]%2!=0)
    {
        printf(" %d",a[i]);
    }
    }
    
return 0;
}