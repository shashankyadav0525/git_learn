/*insertion from last*/
#include<stdio.h>
#include<stdlib.h>
int count=0;
struct node *start =NULL;
struct node
{
    /* data */
    int info;
    struct node *next;
    
};


//function for creating node
struct node *new_node()
{
struct node *newnode;
newnode=(struct node*)malloc(sizeof(struct node));
return (newnode);
}

void insurt_last(){
    struct node *t,*newnode;
    printf("enter the element:\n");
    scanf("%d",&newnode->info);
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
            t->next=newnode;

        }
        
    }
    }
    void insurt_beg(){
        struct node *newnode;
        printf("enter the element:\n");
        scanf("%d",&newnode->info);
        newnode->next=start;
        start=newnode;

    }
    void delete_last(){
        struct node *newnode,*t;
        printf("enter the element:\n");
        scanf("%d",newnode->next);
              newnode->next=NULL;
        if (start==NULL)
        {
           printf("list is empty:\n");
        }
        else{
            while (t->next!=NULL)
            {
                t=newnode;
                 t->next=NULL;
            }
        }
        

    }