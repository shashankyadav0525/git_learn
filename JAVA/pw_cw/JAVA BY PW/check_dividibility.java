import java.util.*;
public class check_dividibility {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int n= read.nextInt();
        //WAP n number is divisible by 5 but not divisible by 3
        if ((n%5==0)&&(n%3!=0)) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");

        }
    }
}
