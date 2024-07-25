import java.util.*;
public class use_of_while {
    public void main(String[] arge){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int sum=0;
        while (n!=-1) {
            sum+=n;
            n=read.nextInt();
        } 
        System.out.println(sum);
    }
}
