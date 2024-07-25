
import java.util.*;
public class q002 {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("enter the number of test cases:");
        int n=t.nextInt();
       for (int i=0; i<n; i++) {
        System.out.println("enter the number that u want to fabonic series:");
         int m=t.nextInt();
         int f=0,s=1;
         int next;
         int sum=0;

         for(int j=0; j<m; j++){
         next=f+s;
         f=s;
         s=next;
         if (next%2==0 && next<=m) {
           next=f+s;
           f=s;
           s=next;
           System.out.println(next);
         }
         }

       }

    }
}
