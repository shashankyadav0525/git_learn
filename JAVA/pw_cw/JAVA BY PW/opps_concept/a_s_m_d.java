import java.net.SocketTimeoutException;
import java.util.*;
class operation{
     int a;
    int b;
    operation(int x,int y ){
        a= x;
        b= y;
    }
        int add(){
    int ans = a+b;
    return ans;
}
int sub(){
    return a-b;
}
int mul(){
    return a*b;
}
int div(){
    return a/b;
}
    }

public class a_s_m_d {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a = ");

        int a = sc.nextInt();
        System.out.println("enter the number b = ");

        int b = sc.nextInt();
        operation obj = new operation(a,b);

        int ans = obj.add();
        System.out.println("sum of two num is = " + ans);
        System.out.println("sub of two num is = " + obj.sub());
        System.out.println("multiple of two number is = " + obj.mul());
        System.out.println("division of two number a = " + obj.div());
        


    }
    
}
