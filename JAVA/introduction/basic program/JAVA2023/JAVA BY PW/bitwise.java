import java.util.*;
public class bitwise {
    public static void main(String[] arge){
       int p=9,q=10;

       System.out.println(p|q);
       System.out.println(p&q);
       System.out.println(p^q);

       System.out.println(p<<1);//zero is added at right side
       System.out.println(p<<2);

       System.out.println(q>>1);//zero is added at left side and eliminate from right side
       System.out.println(q>>2);

    }
}
