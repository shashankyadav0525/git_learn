import java.util.*;
public class num_lower_tri {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
       int c = read.nextInt();
       for (int i=1; i<=r; i++) {
           for (int j=1; j<=i; j++) {
               System.out.print(j);
           }
           System.out.println();

       }
    }
}
