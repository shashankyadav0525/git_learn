import java.util.*;
public class lec13_pattern {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number of row");
        int r = read.nextInt();
        System.out.println("enter the number of column");
        int c = read.nextInt();
        for(int i=1; i<=r; i++) {
            for(int j=1; j<=c; j++) 
            {
               System.out.print(" *");
            }
            System.out.println();
        }
    }
}
