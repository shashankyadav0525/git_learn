    
import java.util.*;

class q03{
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
            if(arr[i]<0){
                arr[i]=0;
            }
            else{
                 arr[i]=1;
            }
        }
        for (int i=0; i<n; i++) {

            System.out.println(arr[i]);
    }
}
}