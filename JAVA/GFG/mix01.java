import java.util.*;
public class mix01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the element of in array:");
        for (int i=0; i<a.length; i++) {
            a[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
