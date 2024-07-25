import java.util.*;
public class second_greatest {
    static void sha(int[] arr){
        Arrays.sort(arr);
         int[] ans={arr[arr.length]};   
    }

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=t.nextInt();
        }
           sha(arr);
           System.out.println(arr[arr.length]);
    }
}

