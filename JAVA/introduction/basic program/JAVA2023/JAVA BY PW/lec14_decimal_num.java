import java.util.*;
public class lec14_decimal_num {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
       //int m = read.nextInt();
        int sum=0;
         for(int i=1; i<=n; i++) {
            sum=sum+2*i;

         }
       System.out.println(sum);
    }
}
