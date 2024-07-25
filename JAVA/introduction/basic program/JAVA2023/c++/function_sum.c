#include<stdio.h>

int sum(){
    int a,b,ans;
    printf("enter the two num:\n");
    scanf("%d %d",&a,&b);
    ans=a+b;
    printf("--->%d\n",ans);
}
    int main(){
        int i,n;
        printf("enter the number of time to sum:\n");
        scanf("%d",&n);
        for ( i = 0; i < n; i++)
        {
            sum();
        }
        printf("___\n");
        printf("------>aab bus bhe kar bachhe ke jaan lega kya<------:\n");
        printf("_____\n");
    
return 0;
}