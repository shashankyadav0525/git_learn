import java.util.*;
public class second_greatest_among_three {
    public static void main(String[] arge){
        Scanner t = new Scanner(System.in);
        int n= t.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("enter the value of a:");
            int a= t.nextInt();
            System.out.println("enter the value of b:");
            int b=t.nextInt();
            System.out.println("enter the value of c:");
            int c=t.nextInt();
            if ((a>b)&&(a>c)) {
                  if (b>c){
                    System.out.println(b);}
                    else{
                        System.out.println(c);
                    }
                
            }
            if ((b>a)&&(b>c)) {
                  if (a>c){
                    System.out.println(a);
                }
                else{
                    System.out.println(c);
                }
            }
            if ((c>a)&&(c>b)) {
                if (a>b) {
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }
            }
        }
    }
}
