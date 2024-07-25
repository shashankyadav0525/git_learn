import java.util.*;
public class short_array{
    static int[] smallestandlargest(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0], arr[arr.length-2]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=t.nextInt();
        }
        int[] ans=smallestandlargest(arr);

        System.out.println("smallest" +ans[0]);
        System.out.println("largest" +ans[1]);
    }
}