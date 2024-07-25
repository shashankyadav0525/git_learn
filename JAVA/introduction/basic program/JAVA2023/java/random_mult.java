import java.util.Scanner;

public class random_mult{
         public static void main(String[] args) {
            System.out.println("enter the number the u want to check:");
      Scanner a = new Scanner(System.in);
int t=a.nextInt();
      for (int i=0; i<=t; i++) {
             System.out.println("enter the number that u want to get answer:");
             int x=a.nextInt();
             int y= 15*x;
             System.out.println("your answer is = "+y);
      }
       System.out.println("the end:");     
    }    
    
}