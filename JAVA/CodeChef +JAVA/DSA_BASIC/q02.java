//High Accuracy
import java.util.*;
public class q02 {
  public static void main(String[] args) {
    Scanner t=new Scanner(System.in);
    System.out.println("enter the size of array:");

    int n=t.nextInt();
    for (int i=0; i<n; i++) {
        int[] a=new int[n];
        int x=t.nextInt();
        if (x%3==0) {
            System.out.println("minimum incorrect ans is:" +0);
        }
        else{
            x=x%3;
            System.out.println("minimum incorrect ans is:" +(3-x));
        }
    }
  } 
}
