//WAP to print the sequence 1-2+3-4....n
import java.util.*;
public class series_0f_num {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number n");
        int n = read.nextInt();
        int ans = 0;
        for (int i =1; i<=n; i++){
            if (i%2==0) {
             ans+=i;
            }
            else{
                ans-=i;
            }
        }
        System.out.println(ans);
    }
}
