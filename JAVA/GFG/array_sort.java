import java.util.*;
public class array_sort {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=t.nextInt();
        }
Arrays.sort(arr,Collection.reverseOrder());
System.out.println(arr);
    }
}
