import java.sql.ShardingKey;
import java.util.*;
public class cont_greaterNo {
    static int GrtChek(int[] arr, int x){
        int count=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>x) {
                count++;
             }
        }
        return count;
    }
    static int shsa(int[] arr, int x){
        int equ=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==x) {
                equ++;
            }
        }
        return equ;
    } 
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=t.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element in array ");
        for (int i=0; i<arr.length; i++){
            arr[i]=t.nextInt();
        }
        System.out.println("enter the x element:");
        int x=t.nextInt();
        System.out.println("greater then x element are:" +GrtChek(arr, x));
    System.out.println("equal to x is :" +shsa(arr, x));
    }
    
}
