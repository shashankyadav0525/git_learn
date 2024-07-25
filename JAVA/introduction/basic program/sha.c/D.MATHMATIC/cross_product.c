#include<stdio.h>

    int main(){
    int a[100],b[100],c[100],n,m,k=0,i,j;
    printf("enter the size of set A:\n");
    scanf("%d",&n);
    printf("enter the element of set A:\n");
    for(i=0; i<n; i++){
        scanf("%d",&a[i]);
    }
    printf("enter the size of element of set B:\n");
    scanf("%d",&m);
    printf("enter the element of set B:\n");
    for(i=0; i<m; i++){
        scanf("%d",&b[i]);
    }
    //logic for cross product//
    for ( i = 0; i < n; i++)
    {
      for ( j = 0; j < k; j++)
      {
        if (c[j]==a[i])
        {
            break;
        }
        if (j==k)
        {
            c[k]=a[i];
            k++;
        }
      }
    }
      for ( i = 0; i < m; i++)
      {
        for ( j = 0; j < k; j++)
        {
            if (c[j]==b[i])
            {
                break;
            }
            if (k==j)
            {
              c[k]=b[i];
              k++;
            }
            
        }
        
      
      printf("union of set A and set B:\n");
      for ( i = 0; i < k; i++)
      {
        printf("%d",c[i]);
      }
      }
      
return 0;
}