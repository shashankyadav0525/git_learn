import java.util.*;
public class check_greater_of_three_no {
public static void main(String[] arge){
    Scanner read = new Scanner(System.in);
    System.out.println("Enter the valve of x");

    int x= read.nextInt();
    System.out.println("Enter the valve of y");

    int y= read.nextInt();
    System.out.println("Enter the valve of z");

    int z=read.nextInt();
    if(x>y && x>y){
System.out.println("x is greater then y and z");
    }
    else if (y>x && y>z) {
        System.out.println("y is greater then x and z");
    }
    else if (z>x && z>y) {
        System.out.println("z is greater then y and x");
    }
    else{
        System.out.println(" Nothing is happen");

    }
}    
}
