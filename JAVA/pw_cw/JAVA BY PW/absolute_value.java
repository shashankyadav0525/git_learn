import java.util.*;
public class absolute_value {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int n= read.nextInt();
        int m=n+n;
        if (m==0) {
            System.out.println(n);
        }
        else{
            System.out.println(n*-1);

        }
    }
}
