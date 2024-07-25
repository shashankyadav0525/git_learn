import java.util.*;

class q01{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element in array");
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
            System.out.println("enter the num that check by user:");
            int m=sc.nextInt();
            for(int i=0; i<n; i++){
            if(arr[i]==m){
                 System.out.println("index of element is :" + i);
                        }
    }
    }
}