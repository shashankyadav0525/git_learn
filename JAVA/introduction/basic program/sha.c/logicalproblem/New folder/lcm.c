#include<stdio.h>
int main()
{
    int a,b,s,i,lcm,hcf;
    printf("enter the two number");
    scanf("%d%d",&a,&b);
    if(a<b)
    s=a;
    else
    s=b;
    for (i=1; i<=s; i++)
    {
        if((a%i==0)  && (b%i==0))
        {
            hcf=i;
        }
    }
    printf("\nhcf=%d",hcf);
    lcm=(a*b)/hcf;
    printf("\nlcm=%d",lcm);
    return 0;
}
