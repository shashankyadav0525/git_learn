#include<stdio.h>
void main(){
    int i,a=0;
    while (a==0)
    {  a=1;
        for ( i = 0; i < 10; i++)
        {
              if(i/2==0)
              printf("%d\n",i);
               a=1;
        }
        
    }
    
}