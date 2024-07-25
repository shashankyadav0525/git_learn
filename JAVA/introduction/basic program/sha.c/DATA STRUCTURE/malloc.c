#include<stdio.h>
#include<stdlib.h>

int main(){
    int*ptr;
    int n,i;
    printf("enter the number of element\n");
    scanf("%d",&n);
    printf("entered the number of elements:%d\n",n);
    ptr=(int*)malloc(n*sizeof(int));
    if (ptr==NULL)
    {
        printf("memory not allocated:\n");
        exit(0);
    }
    else{
        printf("memory successfully:\n");
        for ( i = 0; i < n; i++)
        {
            ptr[i]=i++;
        }
        printf("the element of array are:");
        for( i = 0; i < n; i++);
        {
            printf("%d, ",ptr[i]);
        }
        
        
    }
    

    
return 0;
}