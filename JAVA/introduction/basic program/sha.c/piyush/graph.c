#include<stdio.h>

    int main(){
    int n,i,j=0,k=0,sumodd=0,sumeven=0,odd[10],even[10],a[10];
    printf("enter the size of array\n");
    scanf("%d",&n);
    printf("enter the element of array\n");
    for(i=0; i<=n; i++)
    {
        scanf("%d",&a[i]);
    } 
    for(i=0; i<=n; i++)
    {
        if(a[i]%2!=0)
        {
            sumodd=sumodd+a[i];
                  odd[j]=a[i];
                   j++;
        }
        else{
             sumeven=sumeven+a[i];
             even[k]=a[i];
               k++;
        }         
    }
    printf("sum of odd is: %d\n",sumodd);
    printf("sum of even is: %d\n",sumeven);

    printf("odd array\n");
    for ( i=0; i<=j; i++)
     printf("%d:\n",odd[i]);

     printf("even array\n");
     for(i=0; i<=k; i++)
     printf("%d:\n",even[i]);
return 0;
}