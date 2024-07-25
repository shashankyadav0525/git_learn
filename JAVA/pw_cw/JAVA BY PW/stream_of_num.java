import java.util.*;
public class stream_of_num {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int sum=0;
        do{
            sum=sum+n;
            n= read.nextInt();

        }
        while(n!=-1);
        
        System.out.println(sum);
    }
}
