#include<stdio.h>

    int main(){
    int n;
    printf("enter the size of array:\n");
    scanf("%d",&n);
    int a[n],i;
    printf("enter the element of setA:\n");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
        int k=0,c[k];
        for ( i = 0; i < n; i++)
        {
            c[k]=a[i];
            k++;
        }
        int m;
        printf("enter the size of array of setB:\n");
        scanf("%d",&m);
        int b[m],j;
        printf("enter the element of setB:\n");
        for(j=0; j<m; j++)
        {
            scanf("%d",&b[j]);
        }
        for(j=0; j<m; j++)
        {
            c[k]=b[j];
            k++;
        printf("%d",c[k]);
        }
        
    
return 0;
}