//power of a number
import java.util.*;
class q07{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the power nuber");
        int t=sc.nextInt();
        System.out.println("enter the base");
        int b=sc.nextInt();
        int pow=1;
        for(int i=1; i<=t; i++){
         pow=pow*b;   
        }
        System.out.println("your answer is:" +pow);
    }
}