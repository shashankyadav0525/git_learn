#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};

void linkedList_triversal(struct node *ptr)
{
while (ptr != NULL)
{
    printf("element %d:\n", ptr->data);
    ptr=ptr->next;
}
}

int main(){
struct node *head;
struct node *first;
    struct node *second;
    struct node *third;
    struct node *fourth;
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
    linkedList_triversal(head);
    return 0;
}



