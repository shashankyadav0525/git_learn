import java.util.*;
class Algebra{
    int sub(int a,int b){
        int ans = a-b;
        return ans;
    }
}
public class arth_sub {
    public static void main(String[] arge){
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans=obj.sub(x,y);
        System.out.println("substraction of two number is " +ans);
    }
    
}
