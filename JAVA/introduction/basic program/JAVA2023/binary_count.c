#include<stdio.h>
#include<string.h>
    int main(){
    int i,r,s,c=0;
     char st[55];
    printf("enter the binary number:\n");
    scanf("%s",st);
   for(i=0;i<=strlen(st);i++){
    if(st[i]=='1'){
        c++;
    }
   }
    printf("%d",c);
    
    
    
return 0;
}