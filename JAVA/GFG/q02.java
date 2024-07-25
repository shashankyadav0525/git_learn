    
import java.util.*;

class q02{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("entr size of array:");
        int n=sc.nextInt();
        int cnt=0;
        int sum=0;
        int[] arr=new int[n];
        System.out.println("enter the element:");
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            if(arr[i]==1){
               cnt++;
            }
            else{
                sum++;
            }
        }
        System.out.println("no of 1 is " + cnt);
        System.out.println( "no of 0 is " + sum);

    }
}