import java.util.*;
class check_two_array_equal{
    // public static int array(int[] A, int[] B,int N){
        
    
    // }
public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("enter the size of Array:");
        int N=t.nextInt();
    System.out.println("enter the value of array A:");
        int[] A=new int[N];
        int[] B=new int[N];
        for(int i=0; i<N; i++){
            A[i]=t.nextInt();
            System.out.println("enter the value of array B:");

            B[i]=t.nextInt();
        }
       

        System.out.println();
    }
}
