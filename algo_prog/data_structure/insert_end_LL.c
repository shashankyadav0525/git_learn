#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *ptr;
struct node *head;
void linkedList_triversal()
{
while (ptr != NULL)
{
    printf("element %d:\n", ptr->data);
    ptr=ptr->next;
}
}
void linkedList_insert_end(){
struct node *temp;
temp=(struct node *)malloc(sizeof(struct node));
while (ptr != NULL)
{
   // if(ptr==NULL)
    printf("element %d:\n", temp->data);
          temp->next=ptr;
}

}
int main(){
    struct node *temp;
struct node *head;
struct node *first;
    struct node *second;
    struct node *third;
    struct node *fourth;
    temp=(struct node *)malloc(sizeof(struct node));
head=(struct node *)malloc(sizeof(struct node));
first=(struct node *)malloc(sizeof(struct node));
second=(struct node *)malloc(sizeof(struct node));
third=(struct node *)malloc(sizeof(struct node));
fourth=(struct node *)malloc(sizeof(struct node));
     
    
    head->data=1;
    head->next=first;
    first->data=2;
    first->next=second;
    second->data=3;
    second->next=third;
    third->data=4;
    third->next=fourth;
    fourth->data=5;
    fourth->next=NULL;
    ptr=head;
    temp->data=10;
     temp->next=ptr;
     free(ptr);
}



