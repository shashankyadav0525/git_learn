import java.util.*;
public class reverse_array{
    public static void reverse(int[] num, int start, int end){
        while (start<end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int[] a=new int[5];
        for(int j=0; j<5; j++){
            a[j]=t.nextInt(); 
        }
       
    }
}