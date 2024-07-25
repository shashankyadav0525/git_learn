#include<stdio.h>

int top=-1;
int stack[5];
void push(){
    int element;
    if (top==4)
    {
        printf("stack is full or stack is overflow condition:\n");
    }
    else{
        printf("enter the element iin stack:\n");
        scanf("%d",&element);
    }
    top=top+1;
    stack[top]=element;
}
void pop(){
    if (top==-1)
    {
    printf("stack is empty or stack is over flow condition:\n");
    }
    else{
        top=top-1;
    }
}
void display(){
    int i;
    if (top==-1)
    {
    printf("stack is empty:\n");
    }else{
    for ( i = top; i >=0; i--)
    {
        printf("%d",stack[i]);
    }
    }
}
void main(){
    int choise;
    do
    {
    printf("prass 1 for push:\n");
    printf("press 2 for pop:\n");
    printf("prass 3 for display:\n");

    printf("enter the choise\n");
    scanf("%d",&choise);
    switch (choise)
    {
    case 1:push();
        break;
    case 2:pop();
    break;
    case 3:display();
    break;
    }
    } while (choise<=3);
    return 0;
}
