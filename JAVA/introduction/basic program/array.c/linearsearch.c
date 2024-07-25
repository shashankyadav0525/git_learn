#include<stdio.h>

int linearSearch(int arr[],int size,int element){
for (int i = 0; i <= size; i++)
{
    if(arr[i]==element){
        return i;
    }
    
}
return-1;
}

    int main(){

        int arr[]={1,3,5,56,4,3,23,5,34,55};
        int size=sizeof(arr);//sizeof(int);
        int element;
        scanf("%d",&element);
        int searchIndex=linearSearch(arr,size,element);
        printf("%d %d",element,searchIndex);
    
return 0;
}