//WAP first number is divisible by 5 and 7
import java.util.*;
public class useof_break {
    public static void main(String[] arge){
        //Scanner read = new Scanner(System.in);
int n =1;
while (true) {
    if ((n%5==0) &&(n%7==0)) {
        System.out.println(n);
        break;
    }
    n++;
}
    }
}
