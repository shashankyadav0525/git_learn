import java.util.*;
public class storeARRAYelement {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = t.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element in array:");
        for(int i=1; i<=arr.length; i++){
            arr[i] = t.nextInt();

        }
        for (int i=1; i<=n; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
