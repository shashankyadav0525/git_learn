#include<stdio.h>

int top=-1;
#define size;
int stack[10];
void push(int x){
    if (top==-1)
    {
        printf("stack is empty:\n");
    }
    top=top+1;
    stack[top]=x;
    scanf("%d",&x);
}
void pop(){
    if (top==size-1)
    {
        printf("over flow condition:\n");
    }
    
}
    int main(){
    
return 0;
}