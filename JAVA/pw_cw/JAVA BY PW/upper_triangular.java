import java.util.*;
public class  upper_triangular {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
        int c = read.nextInt();
        for (int i=1; i<=r; i++) {
            for (int j=r; j>=i-1+1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    }

