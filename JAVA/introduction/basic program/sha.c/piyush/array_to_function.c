#include<stdio.h>

void printArray(int *ptr, int n){
    for(int i=0; i<n; i++)
    {
        printf("the value of element %d is %d\n",i+1,*(ptr+1));
    }
}
    int main(){
        int arr[]={1,3,4,5,7,8};
        printArray(arr,6);
return 0;
}