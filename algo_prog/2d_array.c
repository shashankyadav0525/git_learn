#include<stdio.h>
void main(){
    int a[2][3]={1,2,3,4,5,6};
    printf("%d",a);
        printf("\n");

    printf("%d",&a);
            printf("\n");
    printf("%d",a[0]);
            printf("\n");
    printf("%d",&a[0][0]);  
          printf("\n");\
    printf("%d",*a);
            printf("\n");
    printf("%d",**a);
        printf("\n");
            printf("%d",*(a[0]));
        printf("\n");
    printf("%d",a+1);
        printf("\n");
    printf("%d",*a+1);
        printf("\n");
    printf("%d",a[0]+1);       
        printf("\n");
        printf("%d",*(a+1));


}