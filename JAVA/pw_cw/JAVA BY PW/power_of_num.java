import java.util.*;
public class power_of_num {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number reqired for finding the power");
        int a = read.nextInt();
        System.out.println("enter the number of time that is required");

        int n = read.nextInt();
        int ans = 1;
        for (int i=1; i<=n; i++) {
            ans  =ans*a; 
        }
        System.out.println(ans);
    }
}
