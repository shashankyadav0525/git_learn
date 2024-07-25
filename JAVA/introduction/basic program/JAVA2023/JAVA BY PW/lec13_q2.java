import java.util.*;
public class lec13_q2 {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
        int c = read.nextInt();
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=c; j++) {
                if (i==1 || i==r || j==1 || j==c) 
                    System.out.print("*");

                
                else
                    System.out.print(" ");
            }
                System.out.println();

            
        }
    }
}
