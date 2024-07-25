#include<stdio.h>

    int main(){
    int i,sum=0, a[10];
    printf("enter the elements=");
    
for(i=0; i<5; i++){
  scanf("%d",&a[i]);
  sum=sum+a[i];

}
printf("sum is %d",sum);

return 0;
}