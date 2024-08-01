#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node * insert_between_LL(struct node *head)
{ struct node *ptr=(struct node *) malloc(sizeof(struct node));
   struct node *p;
   int index;
  p=head;
  int i=0;
  printf("enter the node position where you enter :\n");
  scanf("%d",&index);
  while (i!=index-1)
  {
    p=p->next;
    i++;
  }
  printf("enter the element:\n");
  scanf("%d",&ptr->data);
  //ptr->data=data;
ptr->next= p->next;
p->next=ptr;
return head;
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
  // linkedList_triversal(head);
    insert_between_LL(head);
    
     linkedList_triversal(head);
   return 0;
}




