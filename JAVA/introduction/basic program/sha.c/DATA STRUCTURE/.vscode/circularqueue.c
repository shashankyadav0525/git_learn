#include<stdio.h>
int list[5];
int f=-1,r=-1;
void insert(){
    int data;
    
    printf("enter the data:");
    scanf("%d",&data);
    if( f==0 && r==4 || f==r+1){
        printf("list is full:");
    }
    else if(r==-1 && f==-1){
        f=0;
        r=0;
        list[r]=data;
    }
    else{
        r=(r+1)%5;
        list[r]=data;
    }
}
void delete(){
    if(f==-1 && r==-1 ){
        printf("list is empty:");
    }
    else{
        f=(f+1)%5;
    }
}
void display(){
    if(f==-1 && r==-1 ){
        printf("list is empty:");
    }
    else{
        int i;
        for(i=f;i!=r;i=(i+1)%5){
            printf("%d",list[i]);
        }
        printf("%d",list[i]);
    }
}
 int main(){
    int choice;
    
    
    do{
        printf("press 1 for insert:\n");
         printf("press 2 for delete:\n");
          printf("press 3 for display:\n");
           printf("enter yur choice:\n");
           scanf("%d",&choice);
          switch(choice){
            case 1:insert();
            break;
            case 2:delete();
            break;
            case 3:display();
          }
    }while(choice<=3);
    
    return 0;
}