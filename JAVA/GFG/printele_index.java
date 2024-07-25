import java.util.*;
public class printele_index {
    static void check(int[] arr, int n, int k){
        for(int i=0; i<arr.length; i++){
         if (arr[i]==k) {
            System.out.println("ans: "+i);
         }
              }
              System.out.println("not exist : " +(-1));
            }
            
    
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("size of array:");
        int n=t.nextInt();
        int[] arr=new int[n];
        System.out.println("enter ele: ");
        for (int i=0; i<n; i++) {
            arr[i]=t.nextInt();
        }
        System.out.println("check ele: ");
        int k=t.nextInt();
        check(arr, n, k);
    }
}
