//WAP to count the number of digits for a given number n
import java.util.*;
public class count_n_num {
 public static void main(String[] arge){
    Scanner read = new Scanner(System.in);
    System.out.println("enter the number");
    int n = read.nextInt();
    int count=0;
    while (n>0) {
        n=n/10;
        count++;
    }
    System.out.println("number of digits is  = " + count);

 }
}
