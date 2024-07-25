#include<stdio.h>

void main(){
    int n,m,i,j,l,k=0;
    int a[100], b[100],c[1000],d[100],sy[100];
    printf("enter the size of array:\n");
    scanf("%d",&n);
    printf("enter the element of setA:\n");
    for(i=0; i<=n; i++)
    {
        printf("%d",a[i]);
    }
    printf("enter the size of array:\n");
    scanf("%d",&m);
    printf("enter the element of setB:\n");
    for(j=0; j<=m; j++)
    {
        printf("%d",&b[j]);
    }
    /*logic for finding b-a*/
    for ( i = 0; i < n; i++)
    {
        for ( j = 0; j < m; j++)
        {
            b[j]=a[i];
            break;
        }
        if(j==m)
        {
            for ( l = 0; l < k; l++)
            {
                if(c[l]==a[i])
                break;
            }
            if(l==k)
            {
                c[k]=a[i];
                k++;
            }
        }
    }
    /*logic for finding b-a*/
    for ( i = 0; i < m; i++)
    {
        for ( j = 0; j < n; j++)
        {
            if(b[i]==a[j])
            break;
        }
        if (j==n)
        {
            for ( l = 0; l<m; l++)
            {
                d[l]=b[i];
                break;
            }
            if(l==m)
            {
               d[m]=b[i];
               m++;
            }  
        }
    }
    printf("\nsetA:\n");
    for ( i = 0; i < n; i++)
    {
        printf("%d",a[i]);
    }
    printf("\nsetB is:\n");
    for ( j = 0; j < m; j++)
    {
        printf("%d",b[j]);
    }
    /*logic for symmetric difference are---->*/
    for ( i = 0; i < k; i++)
    {
        sy[n]=c[i];
        n++;
    }
    for ( i = 0; i < m; i++)
    {
        sy[n]=d[i];
    }
    printf("symmtric difference are:\n");
    for ( i = 0; i < n; i++)
    {
        printf("%d",sy[i]);   
    }
    return 0;
}