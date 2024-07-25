#include<stdio.h>
#include<conio.h>
void main(){
    int n,i,a[i],sum=0;
    printf("enter the size of array\n");
    scanf("%d",&n);
    printf("enter the number of elements");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
    if (a[i]%2 == 0)
    {
        sum+=a[i];
        a[i]++;
    }
    else{
        sum+=a[i];
        a[i]++;
    }
    printf("sum of even no = %d\n",sum);
    printf("sum of odd no = %d\n",sum);
    
    
}