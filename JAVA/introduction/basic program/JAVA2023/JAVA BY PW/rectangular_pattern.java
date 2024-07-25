import java.util.*;
public class rectangular_pattern {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
       int c = read.nextInt();
        for (int i=1; i<=r; i++) {
            for (int j=i; j<=r; j++) {
                System.out.print(j);
            }
        
            for (int k=1; k<=i-1; k++) {
                System.out.print(k);

            }
            System.out.println();

        }
    }
}
    
