#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};
int count=0;
void linkedListTraversal(struct node *ptr)
{
    while (ptr != NULL)
    {
        printf("element: %d\n", ptr->data);
        ptr = ptr->next;
        count++;
    }
    printf("total numbers of node are: %d\n",count);
}
int main(){
    struct node *first;
    struct node *second;
    struct node *third;
    struct node *fourth;

first=(struct node *)malloc(sizeof(struct node));
second=(struct node *)malloc(sizeof(struct node));
third=(struct node *)malloc(sizeof(struct node));
fourth=(struct node *)malloc(sizeof(struct node));

//link first and second node
first->data = 7;
first->next = second;

//link second and third node
second->data = 11;
second->next = third;

//link third and fourth node
third->data = 41;
third->next = fourth;

//terminate the link at the fourth node
fourth->data = 66;
fourth->next = NULL;

linkedListTraversal(first);
//return 0;
}