import java.util.*;
public class forloop {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number");

          int n = read.nextInt();
          int sum=0;
          System.out.println("number is");


          for (int i=1; i<=n; i++) {

             System.out.println(i);
             sum=sum+i;

          }
          System.out.println("sum is");
          System.out.println(sum);

    }
}
