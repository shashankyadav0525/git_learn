import java.util.*;
public class swap_17l{
static void swapwithouttemp(int a, int b){
    System.out.println("original before swap:");
    System.out.println("A: "+a);
    System.out.println("B: "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swap:");
    System.out.println("A "+a);
    System.out.println("B "+b );
}
public static void main(String[] args) {
    int a=9;
    int b=3;
    swapwithouttemp(a, b);
}
}