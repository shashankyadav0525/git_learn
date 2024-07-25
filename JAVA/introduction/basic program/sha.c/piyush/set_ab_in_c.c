#include<stdio.h>

    int main(){
    int n;
    printf("enter the size of array\n");
    scanf("%d",&n);
    int a[n],i,k=0,c[k];
    printf("enter the element of setA:\n");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    } 
    int m;
    printf("enter the size of array\n");
    scanf("%d",&m);
     int b[m];
     printf("enter the element of setB:\n");
     for ( i = 0; i < m; i++)
     {
        scanf("%d",&b[i]);
     }
     //logic is used for different of a and b//
     for(i=0; i<n; i++)
     { c[k]=a[i];
         k++;}
        for(i=0; i<m; i++)
        {
            c[k]=b[i];
             k++; }         
        
     printf("elements of setA and setB are:\n");
     for(i=0; i<k; i++){
         printf("%d\n",c[i]);}
        
     
return 0;
}