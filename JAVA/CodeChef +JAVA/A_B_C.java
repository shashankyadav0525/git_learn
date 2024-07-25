import java.util.*;
public class A_B_C {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        for (int i=1; i<=n; i++) {
            int x= t.nextInt();
            int y= t.nextInt();
            if ((x==5)&&(y==2)) {
                System.out.println("either");}
               else if ((x<=5)&&(y>=2)) {
                    System.out.println("candy");
                }
                else{
                    System.out.println("chocolate");
                }
            }
        
    }
}
