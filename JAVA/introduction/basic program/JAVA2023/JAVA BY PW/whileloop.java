//WAP to sum of number from 1 to input number taken by user
import java.util.*;
public class whileloop {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number");

        int n = read.nextInt();
       int sum=0;
        int num=1;
        System.out.println("your number is:");

        while (num<=n) {

           System.out.println(num);
            sum=sum+num;
            num=num+1;

        }
        System.out.println("sum of number is");

        System.out.println(sum);

    }
}
