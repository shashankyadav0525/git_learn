import java.util.Scanner;

import java.util.Scanner;

public class chor_pulic {
    public static void main(String[] arge){
        System.out.println("enter the nuber of time check:");
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("enter hte speed of chor:");
            int x = t.nextInt();
            System.out.println("enter the speed of polic:");
            int y = t.nextInt();
            if(x<y){
                System.out.println("yes");
            }
            else
            System.out.println("no");
        }
    }
}
