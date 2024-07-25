#include<stdio.h>

    int main(){
    int n,i,a[10],sum=0,odd[10],j=0;
    printf("enter the size of array\n");
    scanf("%d",&n);
        printf("enter the element\n");

      for(i=0; i<n; i++)
      {
        scanf("%d",&a[i]);
      }
      for(i=0; i<n; i++)
      {
      if (a[i]%2!=0)
      {
        sum=sum+a[i];
        odd[j]=a[i];
        j++;
      }
      else
      {
        printf("even\n");
      }
      printf("sum of odd number\n");
      scanf("%d",odd[j]);
       }
              
      
      
return 0;
}