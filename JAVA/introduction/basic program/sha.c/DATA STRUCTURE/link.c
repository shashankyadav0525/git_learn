#include<stdio.h>
#include<stdlib.h>

struct node*start=NULL;
struct node{
    int info;
    struct node *next;
};
struct node*create_node(){
    struct node *newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    return(newnode);
}
/*inserting the element for beggning position*/
void insert_beg(){
    struct node *newnode;
    newnode=create_node;
    printf("enter the element:\n");
    scanf("%d",&newnode->info);
    if (start==NULL)
    {
        start=newnode;
    }
    else{
        newnode->next=start;
        start=newnode;
    }
}
/*inserting the element for last position*/
void insert_last(){
    struct node *newnode,*t;
    newnode=create_node();
    printf("enter the element:\n");
    scanf("%d",newnode->info);
    newnode->next=NULL;
    if (start==NULL)
    {
      start=newnode;
    }
    else{
        start=t;
        while (t->next!=NULL)
        {
            t=t->next;
            t->next=NULL;
            t=newnode;
        }
    }
}
/*inserting at specified position*/
void insurt_spf(){
    int pos,i=0,count;
    struct node *newnode,*t;
    newnode=create_node();
    printf("enter the element:\n");
    scanf("%d",&newnode->info);
    if (pos>count)
    {
        printf("list not exist:\n");
    }
    else{
        t=start;
       while(i<=pos)
       {
        t=t->next;
        i++;
       }   
    }
}
void main(){
    int choise;
    printf("enter 1 for insert_beg:\n");
    printf("enter 2 for insert_last:\n");
    printf("enter 3 for insert_spf:\n");
    printf("enter 4 for delete_beg:\n");
    printf("enter 5 for delete_last:\n");
    printf("enter 6 for delete_spf:\n");
    printf("enter 7 for display:\n");
    printf("enter 8 for exit:\n");
    printf("enter your choise:\n");

    scanf("%d",choise);
    switch (choise)
    {
    case 1:insert_beg();
     break;
     case 2:insert_last();
     break;
     case 3:insert_spf();
     break;
     case 4:delete_beg();
     break;
     case 5:delete_last();
     break;
     case 6:delete_spf();
     break;
     case 7:display();
     break;
    }
        while(choise<=8);
}