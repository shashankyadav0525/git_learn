import java.util.*;
public class q01 {
   public static void main(String[] args) {
    Scanner t=new Scanner(System.in);
    int n=t.nextInt();
    for(int i=0; i<n; i++){
        int m=t.nextInt();
        int sum=0;
        for (int j=0; j<m; j++) {
            if (j%3==0 || j%5==0) {
                sum=sum+j;
            }
        }
        System.out.println(sum);
    }
   } 
}
