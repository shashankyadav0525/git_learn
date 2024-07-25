#include<stdio.h>

    int main(){
    int n;
  printf("enter the size of array:\n");
  scanf("%d",&n);
  int i,a[n];
  printf("enter the element of array\n");
  for(i=0; i<n; i++)
  {
    scanf("%d",&a[i]);
  }
  int j,b[n];
  for(i=0; i<n; i++)
  {
    for(j=i+1; j<n; j++)
    {
         if(a[i]>a[j])
{
    b=a[i];
    a[i]=a[j];
    a[j]=b;
}
    }
  }
  printf("the number assending are:\n");
  for(i=0; i<n; i++)
  {
         scanf("%d\n",a[i]);
  }
return 0;
}