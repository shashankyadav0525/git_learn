//The Lead Game
import java.util.*;
public class q09 {
  public static void main(String[] args) {
    Scanner t=new Scanner(System.in);
    int ans;
    System.out.println("enter the number of rounds:");
    int m=t.nextInt();
            for (int j=0; j<m;j++) {
            int[] a=new int[m];
            int[] b=new int[m];
            System.out.println("enter the score of ply1:");
            a[j]=t.nextInt();
            System.out.println("enter the score of ply2");
            b[j]=t.nextInt();
           if(a[j]>b[j]){
               ans=a[j]-b[j];
               System.out.println("Leader ply1 by :" +ans);
               }
               else{
                ans=b[j]-a[j];
                System.out.println("Leader ply2 by :" +ans);
               }

    }

  }
}