//count two sting in a repetative manner:
import java.util.*;
public class q011 {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("number of test perform:");
        int n=t.nextInt();
        while (n-->0) {
            System.out.println("enter nuber of string");
            int m=t.nextInt();
            int k1=0,k2=0;
          while (m-->0) {
            String s=t.next();
            if (s.equals("sha")) {
                k1++;
            }
            else{
                k2++;
            }

          }  
          System.out.println(k1+ " " +k2); 
        } 
    }
}
