import java.util.Scanner;

public class use_if_ {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the two number:");
        int a = read.nextInt();
        int b = read.nextInt();
        if(a>b){
            System.out.print("wright");
        }
        else{
            System.out.print("wrong");
        }
    }
}
