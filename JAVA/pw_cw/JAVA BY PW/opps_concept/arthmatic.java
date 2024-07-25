import java.util.*;

class Algebra{
    int add(int a , int b){
 int ans = a+b;
        return ans;
}
}
    public class arthmatic {
    public static void main(String[] arge){
    
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("sum of input number is");
      int ans = obj.add(x,y);
      System.out.println(ans);

    }
}
