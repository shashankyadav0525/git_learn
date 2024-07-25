#include<stdio.h>
#include<stdlib.h>

int top=-1;
int stack[5];
void push(){
    int element;
    if (top==4)
    {
        printf("stack is full:\n");
    }
    else{
          printf("enter the element:\n");
          scanf("%d",&element);
          top=top+1;
          stack[top]=element;
    }
    
}
void pop(){
    if(top==-1)
{
    printf("stack is empty:\n");
}
else{
    top=top-1;
}
}
void display(){
    int i;
    if(top==-1)
    {
        printf("stack is empty\n");
    }
    else{
        for ( i = top; i>=0; i--)
        {
            printf("%d",stack[i]);
        }
    }
}
int main(){
    int choise;
    do
    {
        printf("1 for push:\n");
        printf("2 for pop:\n");
        printf("3 for display:\n");
        printf("4 for exit:\n");

        printf("enter your choise:\n");
        scanf("%d",&choise);
        switch (choise)
        {
        case 1: push();
            break;
            case 2: pop();
            break;
            case 3: display();
            break;
            case 4: exit(0);
        }
    } while (choise<=4);
    
    return 0;
}