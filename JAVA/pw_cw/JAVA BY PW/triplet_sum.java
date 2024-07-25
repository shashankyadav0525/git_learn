import java.util.*;
public class triplet_sum {
    static int triSum(int[] a, int x){
        int count=0;
        for (int i=0; i<a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
              for (int j2 = j+1; j2 < a.length; j2++) {
                
                if (a[i]+a[j]+a[j2]==x) {
                    count++;
                }
              }  
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=t.nextInt();
         int[] a=new int[n];
         System.out.println("enter the element in array:");
         for (int i=0; i<n; i++) {
             a[i]=t.nextInt();
         }
         System.out.println("enter x");
         int x=t.nextInt();
         System.out.println("there are some pairs are:" +triSum(a, x));
    }
}


