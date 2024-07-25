import java.util.*;
public class factorial {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("ente the number:");

    int n = read.nextInt();
    int fact=1;
    System.out.println("factorial number is:");

    for (int i=1; i<=n; i++) {
        fact*=i;
        System.out.println(fact);

    }
    //System.out.println(fact);
    }
}
