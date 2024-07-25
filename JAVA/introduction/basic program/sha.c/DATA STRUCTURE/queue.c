#include<stdio.h>


    int r=-1,f=-1;
    int q[5];
  void insurt(){
   int element,i;
    printf("enter element:\n");
        scanf("%d",&element);
       
   if(r==4)
   {
       printf("overflow condition occur\n");   
    }
    
    if(f==-1 && r==-1)
    {
       f=0;
       r=0;
    
        q[r]=element;
    }
        else
        {  r++;
        
        q[r]=element;
       
    }
}
void delete(){
    if(f==-1 || f>r){
        printf("queue is empty");
    }
    else{
        f=f+1;
    }
}
void display(){
    if(f==-1 && r==-1){
        printf("no element");

    }
    else{
        for(int i=f;i<=r;i++){
            printf("%d",q[i]);
        }
    }
}
    int main(){
        int choice;
        do
        {  
           printf("1 insurt\n");
           printf("2 delete\n");
           printf("3 display\n");
           printf("enter your choice:\n");
           scanf("%d",&choice);
           switch(choice)
           {
            case 1: insurt();
            break;
            case 2: delete();
            break;
            case 3: display();
            break;
            
           }
        } while (choice<=3);
       
     }