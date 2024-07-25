import java.util.*;
public class tri_pattern{
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
       // int c = read.nextInt();
        for (int i=1; i<=r; i++) {

            for (int j=1; j<=r-i; j++) {
                System.out.print(" ");

        }
        for (int k=1; k<=2*i-1; k++) {
            System.out.print("*");

        }
        System.out.println();

    }
}
}

