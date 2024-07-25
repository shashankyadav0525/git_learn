import java.util.Scanner;

public class facterial {
public static void main(String[] arge){
    Scanner r =new Scanner(System.in);
    System.out.println("enter the number:");
    int num = r.nextInt();
    int fact=1;
    for (int i=1; i<=num; i++) {
        fact=fact*i;
    }
System.out.println("the factorial is: "+ num + " is " +fact);
}    
}
