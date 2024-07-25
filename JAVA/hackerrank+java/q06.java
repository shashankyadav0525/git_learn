import java.util.Scanner;

public class q06 {
   public static void main(String args[]){
      int number;
      Scanner sc = new Scanner(System.in);
      System.out.println("test case::");
      int n=sc.nextInt();
      while(n-->0){
      System.out.println("Enter a number ::");
      number = sc.nextInt();
     
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      }
    }
   }
}