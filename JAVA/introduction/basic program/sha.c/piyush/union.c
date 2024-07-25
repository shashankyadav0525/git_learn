#include<stdio.h>

    int main(){
    int n; 
    printf("enter the size of array:");
    scanf("%d",&n);
    int i,a[n];
    printf("enter the element of array:\n");
    for(i=0; i<n; i++)
    {  scanf("%d",&a[i]);
    
    }printf("the element of array are:\n");
    for(i=0; i<n; i++)
    {
        printf("%d",a[i]);
    }      
                int k=0;
                int c[k];
                for(i=0;i<n;i++){
                    c[k]=a[i];
                    k++;
                }

    int n1;
    printf("enter the size of array:\n");
    scanf("%d",&n1);
    int j,b[n1];
    printf("enter the element of array;\n");
    for(j=0; j<n1; j++)
    {
        scanf("%d",&b[j]);
    } printf("the element of array are:\n");
    for(j=0; j<n1; j++)
    {
        printf("%d",b[j]);
    }
    for(j=0; j<n1; j++)
    {
        c[k]=b[j];
        k++;
       
    }printf("elements of c are:");
    for(i=0; i<k; i++)
    {
        printf("%d",c[i]);
    }
return 0;
}