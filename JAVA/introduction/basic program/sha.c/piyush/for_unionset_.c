#include<stdio.h>

    int main(){
    int n,k=0,c[k];
    printf("enter the size of element in array:\n");
    scanf("%d",&n);
    int a[n],i;
    printf("enter the element of set A:\n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    } printf("the set of element A is:\n");
    for(i=0; i<n;i++)
    {  if(i==0){
        printf("{");
    }
    printf("%d,",a[i]);
    if(i==n-1){
        printf("}");
    }  
    for(i=0; i<n; i++)
    {
    c[k]=a[i];
    k++;
        printf("%d",c[k]);
    }
} printf("\n");
    
    int m;
    printf("enter the size of element in array for aet B:\n");
    scanf("%d",&m);
    int b[m],j;
    printf("enter the element of set B:\n");
    for(j=0; j<m; j++)
    {
        scanf("%d",&b[j]);
    } printf("the set of element B is:\n");
    for(j=0; j<n;j++)
    {
         if(j==0){
             printf("{");
           }
      printf("%d,",b[j]);  
     if(j==m-1){
        printf(" }");
     }
    }
    for(j=0; j<m; j++)
    {
        c[k]=b[j];
        k++;
        printf("%d",c[k]);
    }
return 0;
}
    