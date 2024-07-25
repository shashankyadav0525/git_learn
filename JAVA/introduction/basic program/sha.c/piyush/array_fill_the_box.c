#include<stdio.h>

    int main(){
    int n;
    printf("enter the size of  array A:\n");
    scanf("%d",&n);
    int a[n],i;
    printf("enter the element:\n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
     printf("enter the element\n");}
    for(i=0; i<n; i++)
    {
        printf("%d",a[i]);
    }
    int n1;
    printf("enter the size of arrar B:\n");
    scanf("%d",&n1);
    int b[n1],j;
    printf("enter the element:\n");
    for(j=0; j<n1; j++)
    {
        scanf("%d",&b[n1]);
    printf("the element are\n");}
    for(j=0; j<n; j++)
    {
        printf("%d",b[n1]);
    }
    
return 0;
}