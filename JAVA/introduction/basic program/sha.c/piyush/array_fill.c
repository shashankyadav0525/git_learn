#include<stdio.h>

    int main(){
    int n,k=0;
    int c[k];
    printf("enter the size of array:\n");
    scanf("%d",&n);
    int a[n],i;
    printf("enter the elemant of array:\n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    } printf("the elemnts of array are :\n");
    for(i=0; i<n; i++)
    {   
        c[k]=a[i];
        k++;
        printf("%d",a[i]);
    }
    int n1;
    printf("enter the size of array B\n");
    scanf("%d",&n1);
    int j,b[n1];
    printf("enter the element of array B:\n");
    for(j=0; j<n1; j++)
    {
        scanf("%d",&b[j]);}
        for(j=0; j<n1; j++)
        {      c[k]=b[j];
                  k++;
     printf("%d",b[j]);}
     printf("elements of c are:");
     for(i=0;i<k;i++){
        printf("%d",c[i]);
     }
return 0;
}