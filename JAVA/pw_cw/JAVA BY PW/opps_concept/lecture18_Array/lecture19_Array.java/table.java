import java.util.*;
public class table {
    static void addition(int n){
         for (int i = 1; i <= n; i++) {
        System.out.println(2+i); 
        }
        return;
    }
    static void subtraction(int n){
     for (int i = 1; i <= n; i++) {
        System.out.println(2-i);
    }
    return;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the table");
        int n=sc.nextInt();
        System.out.println("answer");
        addition(n);
        subtraction(n);
    }
}
