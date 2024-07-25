#include<stdio.h>
    int main(){
    int a[10],i,n,rem,cnt,count=0;
    printf("enter the binary number:\n");
    scanf("%d",&n);
    i=0;
    while (n!=0)
    {
        rem=n%2;
        a[i]=rem;
        if(rem==1)
        count++;
        i++;
        n=n/2;
    }
    printf("binary number:");
    cnt=i-1;
    for ( i = cnt; i>=0; i--)
    {
        printf("%d",a[i]);
    }
    printf("\n the count of one is: %d",count);
return 0;
}