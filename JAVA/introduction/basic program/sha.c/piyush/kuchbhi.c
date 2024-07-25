#include<stdio.h>
#define max 5;
int f=-1;
int r=-1;
int q[5];
void insurt()
{
    
    int element;
    if(r==4)
    printf("que is full");
    else
    {
        if(f==-1)
        f=0;
        printf("enter the given element");
        scanf("%d",&element);
        r=r+1;
        q[r]=element;

    }
}  
      void del(){
        
         if(f==-1)
         {
             printf("queue is underflow condition");
         }
         else
         {printf("%d elementdeleted",q[f]);
             f=f+1;
      }
      }
      void display(){
        int i;
        for(i=f; i<=r;i++)
        {
            printf("%d",q[i]);
        }
      }
      int main(){
          
          int choise;
          do{
              printf("1 insurt\n");
              printf("2 delete\n");
              printf("3 display\n");
              printf("enter the choise\n");
              scanf("%d",&choise);
          
          switch(choise)
          {
              case 1: insurt();
              break;
              case 2: del();
              break;
              case 3: display();
              break;
      }    }
          while(choise<=3);
      
}