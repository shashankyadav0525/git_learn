//red traffic and green traffic
import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("enter the number of test cases:");
        int m=t.nextInt();
        while (m-->0) {
            int count=0;
            System.out.println("enter the size of array:");
            int n=t.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the max height that should be compare");
            int p=t.nextInt();
            System.out.println("enter the element in array:");
            for(int i=0; i<n; i++){
                arr[i]=t.nextInt();
               
                if(arr[i]>p){
                    count++;
                }
                
            }
            System.out.println("your answer is:" + count);
        }
    }
}
/*
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int N=sc.nextInt();
	        int K=sc.nextInt();
	        int cnt=0;
	        for(int i=0;i<N;i++){
	        int H=sc.nextInt();
	        if(H>K){
	             cnt++;}
	        }
	        System.out.println(cnt);
	    }
		// your code goes here
	}
}
 */
