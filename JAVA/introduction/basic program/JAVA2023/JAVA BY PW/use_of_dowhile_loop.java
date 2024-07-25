import java.util.*;
public class use_of_dowhile_loop {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number");
        int n = read.nextInt();
        System.out.println("your ans is");

        do {

            System.out.println(n);
            n++;
        } while (n<=5);
    }
}
