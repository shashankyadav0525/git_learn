#include<stdio.h>

   int main(){
   int a[10],b[10],i,n;
   printf("enter the number:\n");
   scanf("%d",&n);
   for(i=0; i<n; i++)
   {
      printf("%d\n",a[i]);
   }
   for(i=n-1; i>0; i--){
      printf("%d\n",b[i]);
   }
return 0;
}