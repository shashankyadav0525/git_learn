import java.util.*;
public class find_remainder {
    public static void main(String[] args) {
        Scanner t =new Scanner(System.in);
        int q = t.nextInt();
        while (q-->0) {
            int x=t.nextInt();
            
            x=x%10;
            System.out.println(x);
        }
    }
}
