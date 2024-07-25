#include<stdio.h>

int linearSearch(int arr[],int size,int element){
    for (int i = 1; i <=size; i++)
    {
        if (arr[i]==element)
        {
            return i;
        }
        
    }
    return-1;
}

int binarySearch(int arr[],int size,int element){
    int low,mid,high;
    low=0;
    high = size-1;
    while (low<=high)
    {
    mid=(low+high)/2;
     if (arr[mid]==element)
     {
        return mid;
     }
     if (arr[mid]<element)
     {
        low=mid+1;
     }
     else{
        high=mid-1;
     }
    }
     return-1;
    }

    int main(){
        int arr[]={12,23,45,56,78,89};
        int size=sizeof(arr);
        int element;
        scanf("%d",&element);
        int searchIndex=binarySearch(arr,size,element);
        printf("%d %d",element,searchIndex);
        return 0;
    }
