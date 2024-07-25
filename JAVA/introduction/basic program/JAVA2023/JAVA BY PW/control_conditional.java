import java.util.*;
public class control_conditional {
    public static void main(String[] arges){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number:");
         int n = sc.nextInt();
         if (n%2==0) {
            System.out.println(n + " the number is even");
         }
            else{
                System.out.println(n+ " the number is odd");

            }
    }
}
