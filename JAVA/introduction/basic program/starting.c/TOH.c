#include<stdio.h>
void TOH(int n, char source, char dest, char auxl){
    if(n==1)
    printf("%c-->%c\n",source,dest);
    else{
        TOH(n-1,source,auxl,dest);
        printf("%c-->%c\n",source,dest);
        TOH(n-1,auxl,dest,source);
    }
}

    int main(){
 int n;
 printf("enter the number of disk\n");
 scanf("%d",&n);   
 TOH(n,'A','C','B');
return 0;
}
