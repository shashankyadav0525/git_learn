#include<stdio.h>
#define max 5
int f=-1,r=-1;
int q[5];
void insurt(){
    int element;
    if(f==(r+1)%max)
    {
        printf("queue is full:\n");
    }
    else{
        if(f==-1)
        {
            f=0;
            r=0;
            printf("enter the element:\n");
            scanf("%d",&element);
            q[r]=element;
        }
    }
}
void del(){
    int element;
    if (f==-1)
    printf("queue is empty:\n");
    else
    {
        if(f==r)
        {
            element=q[f];
            printf("%d been removed element:\n",element);
        }
        else{
            element=q[f];
            f=(f+1)%max;
            printf("%d been removed:\n",element);
        }
    }
}
void display(){
    int i;
    if(f==-1){
    printf("queur=e is empty:\n");
}
else{
    i=f;
}
do
{
    printf("%d",q[i]);
    i=(i+1)%max;
} while (i =(r+1)%max);
}
  void main(){
    int choise;
    do
    {
        printf("1 for insert:\n");
        printf("2 for delete:\n");
        printf("3 for display:\n");

        printf("enter the choise:\n");
        scanf("%d",&choise);
        switch (choise)
        {
        case 1:
            insert();
            break;
        case 2:
            del();
            break;
        case 3:
             display();
             break;
        default:
            break;
        }
    
    } while (choise<=4);
    
    return 0;
  }
    
    
  


