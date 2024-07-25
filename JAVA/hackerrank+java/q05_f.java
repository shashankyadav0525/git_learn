
import java.util.*;
public class q05_f {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);

        System.out.println("enter the number of test cases:");
        int n=t.nextInt();
       for (int i=0; i<n; i++) {
        System.out.println("enter the number that u want to fabonic series:");
         int m=t.nextInt();
         int f=0,s=1;
            int sum;


         for(int j=0; j<m; j++){

         int next=f+s;
         f=s;
         s=next;
        sum=f+s;
        }
           sum=next;
         System.out.println(sum);
        }
    }
}