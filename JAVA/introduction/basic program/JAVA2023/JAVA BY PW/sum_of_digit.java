import java.util.*;
public class sum_of_digit {
    public static void main(String[] arge){
        Scanner read =new Scanner(System.in);
        System.out.println("enter the number");
        int n = read.nextInt();
        int sum =0;
        while (n>0) {
            sum+=n%10;//sum = sum+n%10
            n=n/10;
        }
        System.out.println("sum of the number is = " + sum);

    }
}
