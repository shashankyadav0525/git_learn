import java.util.*;
public class reverse_digit_num {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number");
        int n = read.nextInt();
        System.out.println("reverse of number is =");
        while (n>0) {
            int y = n%10;
            n=n/10;
            System.out.print(y);

        }
    }
}
