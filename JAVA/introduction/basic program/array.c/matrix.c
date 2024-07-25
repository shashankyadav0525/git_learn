#include<stdio.h>

    int main(){
        int n,m;
        printf("enter the two matric size:");
        scanf("%d %d",&n,&m);
        int mat[n][m];
        int trp[n][m];
        printf("enter the matrix element:");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                scanf("%d",&mat[i][j]);
            }
            
        }
                printf("  matrix element are \n");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                printf("%d ", mat[i][j]);
            }
            printf(" \n");
            
        }         printf("  transpose of element are \n");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                 trp[j][i]=mat[i][j];
            }
        }
           printf(" trranspose element are \n");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                printf("%d ", trp[i][j]);
            }
            printf(" \n");
        }
return 0;
}