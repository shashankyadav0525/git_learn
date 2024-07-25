#include<stdio.h>
#include<stdlib.h>
count=0;
struct node*start=0;
struct node{
    int info;
    struct node*next;
};
struct node_*create_node(){
    struct node*newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    return(newnode);
}
/*insert at beggning position*/
void insert_beg(){
    struct node*newnode;
    newnode=create_node();
    printf("enter the element:\n");
    scanf("%d",&newnode->info);
    newnode->next=start;
    start=newnode;
}
/*delete at beggning position*/
void del_beg(){
    struct node*t;
    t=start;
    if (start==NULL)
    {
        printf("list is empty");
    }
    else{
        t=start;
        start=start->next;
        free(t);
    }   
}
/*counting the node of list*/
    int count1(){
 struct node*p;
 p=start;
 if (start==NULL)
 {
    printf("list is empty:\n");
 }
 else{
    p=start;
    while (p!=NULL)
    {
        p=p->next;
    count++;
    }
    return(count);
 }
    }
    /*insert at specafic position*/
    void insert_specf(){
        int pos,i=0,count2;
        struct node*t,*newnode;
        count2=count1;
        printf("enter the position:\n");
        scanf("%d",&pos);
        if (pos>count2)
        {
           printf("list is empty:\n");
        }
        else{
              t=start;
              while (i<=pos)
              {
                t=t->next;
                i++;
              }
              newnode=create_node();
              printf("enter the element:\n");
              scanf("%d",&newnode->next);
              newnode->next=t->next;
              t->next=newnode;
               }
            }
            