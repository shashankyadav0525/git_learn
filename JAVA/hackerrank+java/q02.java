import java.util.*;
public class q02{
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner t= new Scanner(System.in);
        int n=t.nextInt();
        int d=0;
        for (int i=2; i<n; i++) {
            int sum=0;
            c=a+b;
            a=b;
            b=c;

            if(a%2==0){
           sum+=a;
           System.out.println(sum);
           d+=sum;

                }
        
        }
        System.out.println(d);
    }
}