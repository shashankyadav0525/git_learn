#include<stdio.h>


int stack[5];
int top=-1;
void push(){
    int element;
    if(top==4)
    {
        printf("stack is full");
        }
        else{
            printf("enter the element");
          scanf("%d",&element);
       
    top=top+1;
    stack[top]=element;}
}
void pop(){
    
    if(top==-1)
    {
    printf("stack is empty");
    }
    else{
        top=top-1;
        
     }
} 
void display(){
    int i;
    if (top==-1)
    {
        printf("stack is empty");
    }
    else{
        for(i=top; i>=0; i--)
        {
            printf("%d:\n",stack[i]);
        }
    }
}
void main(){
    int choise,ch;
    do
    {
    
      printf("1 push\n");
      printf("2 pop \n");
      printf("3 display\n");
        
     printf("enter the choise:\n");
    scanf("%d",&choise);
    switch(choise)
    { 

        case 1: push();
                break;
                case 2: pop();
                break;
                case 3 : display();
                break;
                
    }
    
    
    }while(choise<=3);

   return 0;    
}
          
    
    