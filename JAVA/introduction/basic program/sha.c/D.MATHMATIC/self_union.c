#include<stdio.h>

    int main(){
    int a[100],b[100],c[100],i,j,n,m,k=0;
    //for set A
    printf("enter the size of set A:\n");
    scanf("%d",&n);
    printf("enter the element of set A:\n");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
    //for set B
        printf("enter the size of set B:\n");
         scanf("%d",&m);
        printf("enter the element of set B:\n");
        for ( i = 0; i < m; i++)
        {
            scanf("%d",&b[i]);
        }
        // logic of union of set A
        for ( i = 0; i < n; i++)
        {
            for ( j = 0; j < k; j++)
            {
                if (c[j]==a[i])
                {
                    break;
                }
            }
                if (j==k)
                {
                    c[k]=a[i];
                    k++;
                }
                
            }
            // for set B
            for ( i = 0; i < m; i++)
            {
                for ( j = 0; j < k; j++)
                {
                    if (c[j]==b[i])
                    {
                        break;
                    }
                    
                }
                if (j==k)
                {
                    c[k]=b[i];
                    k++;
                }
                
                
            }
            printf("union set of A and B are:\n");
        for ( i = 0; i < k; i++)
        {
            printf("%d",c[i]);
        }
        
        
        

return 0;
}