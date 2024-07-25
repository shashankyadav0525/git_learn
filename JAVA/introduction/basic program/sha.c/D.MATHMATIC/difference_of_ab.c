#include<stdio.h>

    int main(){
    int n1,a[100],b[100],c[100],i,j,n2,n3=0;
    printf("enter the size of array:\n");
    scanf("%d",&n1);
    printf("enter the element of satA:\n");
    for(i=0; i<n1; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("enter the size of array of setB:\n");
    scanf("%d",&n2);
    printf("enter the element of setB:\n");
    for(j=0; j<n2; j++)
    {
        scanf("%d",&b[j]);
    }
    for(i=0;i<n1;i++)
    {
        for(j=0;j<n2;j++)
        {
            if(a[i]==b[j])
             break;
            
        }
    if(j==n2)
    {
        c[n3]=a[i];
        n3++;
    }
    }
    for(i=0;i<n3;i++)
    printf("%d",c[i]);


return 0;
}