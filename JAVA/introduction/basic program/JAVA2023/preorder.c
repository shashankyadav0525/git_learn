#include<stdio.h>
#include<malloc.h>

struct node{
    int data;
    struct node *right;
    struct node *left;
};
struct node* createNode(int data){
    struct node *n;//createing a node pointer
    n=(struct node*)malloc(sizeof(struct node));//Allocation memory in the heap
    n->data=data;//detting the data
    n->left=NULL;//setting left children in null
    n->right=NULL;//setting right children in null
    return n;
}
void preorder(struct node *root){
    if (root!=NULL)
    {
        printf(" %d",root->data);
         printf(",");
        preorder(root->left);
        preorder(root->right);
    }    
}

int main(){
    /*struct node *p;
    p=(struct node *)malloc(sizeof(struct node));
    p->data=2;
    p->left=NULL;
    p->right=NULL;
    
    struct node *p1;
    p=(struct node *)malloc(sizeof(struct node));
    p->data=4;
    p->left=NULL;
    p->right=NULL;
    
    struct node *p2;
    p=(struct node *)malloc(sizeof(struct node));
    p->data=5;
    p->left=NULL;
    p->right=NULL;
    
   
    p->left=p1;
    p->right=p2;
    return 0;
}*/
//condtructing the root node
struct node *p=createNode(2);
struct node *p1=createNode(1);
struct node *p2=createNode(4);

//linking the root node with left and right children
p->left=p1;
p->right=p2;
preorder(p);
return 0;
}