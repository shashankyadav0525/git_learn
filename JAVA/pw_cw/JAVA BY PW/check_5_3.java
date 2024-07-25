import java.util.*;
public class check_5_3 {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if ((n%5==0||n%3==0)&&(n%15!=0)) {
            System.out.println("yes");

        }
        else{
            System.out.println("no");

        }
    }
}
