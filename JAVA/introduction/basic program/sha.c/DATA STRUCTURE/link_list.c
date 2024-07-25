#include<stdio.h>
#include<stdlib.h>
int count=0;
struct node *start =NULL;
struct node
{
    /* data */
    int info;
    struct node *link;
    
};


//function for creating node
struct node *create_node()
{
struct node *n;
n=(struct node*)malloc(sizeof(struct node));
return (n);
}

//insert at last
void insert_last()
{
    
    struct node *temp,*t;
    temp=create_node();
    printf("Enter the element");
    scanf("%d",&temp->info);
    temp->link=NULL;
    if(start==NULL)
    start=temp;
    else{
        t=start;
        while(t->link!=NULL)
        t=t->link;
        t->link=temp;
    
    }
}

//void delete at start position
void del_st()
{
    struct node *t;
    if(start==NULL)
  {  printf("list is empty");
  start=t;}
    else 
  {      t=start;
        start=start->link;
        free(t);}
    
}

//void traverse fuction for printing the object

void traverse()
{
    struct node * t;
    t=start;
    if(start==NULL)
    printf("list is empty");
    else{
        do
        {

        printf("%d",t->info);
        t=t->link;
        }while (t!=NULL);
    }

        
    }

//void count
int count1()
{

    struct node *t;
    t=start;
    if(start==NULL)
    return 0;
    else{
        while(t!=NULL)
        {
            t=t->link;
            count++;
        }
        return count;
    }
}
//void function for inserting at specified position
void insert_spec()
{
    int pos,i=1,count2;
    struct node *temp,*t;
    count2=count1();
    
    printf("\nenter the position you want to enter");
    scanf("%d",&pos);
    if(pos>count2)
    printf("position is invalid");
    else{
        t=start;
        while(i<=pos)
        {
            t=t->link;
            i++;
        }
        temp=create_node();
        printf("enter the element");
        scanf("%d",&temp->info);
        temp->link=t->link;
        t->link=temp;  
    }
}
//insert at front of a list
void insertf()
{
    struct node *temp,*t;
    temp=create_node();
    printf("enter the element");
    scanf("%d",&temp->info);
    if(start==NULL)
    {start=temp;
    temp->link=NULL;}
    else{
        
         temp->link=start;
         start=temp;
       
       
    }
    
}
//void delete at last
void dellast()
{struct node *temp,*pn;
if(start==NULL)
printf("list is empty");
else{temp=start;
    while(temp->link!=NULL)
    {
        pn=temp;
        temp=temp->link;

    }
    pn->link=NULL;
    free(temp);
}
 }
//Delete at specified position//
void delspec()
{
    
    int pos,i=1,count2;
    struct node *temp,*t;
    count2=count1();
    if(start==NULL)
    printf("list is empty");
    else{
    printf("\nenter the position you want to delete");
    scanf("%d",&pos);
    if(pos>count2)
    printf("position is invalid");
    else{
        t=start;
        while(i<=pos-1)
        {   temp=t;
            t=t->link;
            i++;
        }
    temp->link=t->link;
    free(t);
}}

}
void main()
{
    int choice;
    do {
        printf("\nenter 1 for insert at front");
        printf("\nenter 2 for insert at specified position");
        printf("\nenter 3 for inserting at last");
        printf("\nenter 4 for delete at front");
        printf("\nenter 5 for traversing");
        printf("\nenter 6 for delete at last");
        printf("\nenter 7 for delete at specified position");
        printf("\nenter 8 for exit");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1 :insertf();
            break;
            case 2 :insert_spec();
            break;
            case 3 :insert_last();
            break;
            case 4 : del_st();
            break;
            case 5 : traverse();
            break;
            case 6 : dellast();
            break;
            case 7 :delspec();
            break;
            case 8: exit(0);
        }
    }while(choice<=8);

}