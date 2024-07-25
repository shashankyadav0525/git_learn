#include <stdio.h>

int main() {
    int a,b;
	printf("enter the number:\n");
	scanf("%d %d",&a,&b);
	if(a<b)
	{
	    printf("FIRST");
	}
	else{
	    if(a==b){
	        printf("ANY");
	    }
	    if(a>b){
	        printf("SECOND");
	    }
	}
	return 0;
}

