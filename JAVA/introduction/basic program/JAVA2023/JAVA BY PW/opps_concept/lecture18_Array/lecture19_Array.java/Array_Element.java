import java.util.*;
public class Array_Element {
    static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner t =new Scanner(System.in);
        int n=t.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element of array:");
        for (int i=0; i<arr.length; i++) {
            arr[i]=t.nextInt();
        }
        System.out.println("output af array is:");
        for (int i=0; i<n; i++) {
         
              System.out.print(arr[i] + " ");
        
        }
        //tring to coppy arr to arr_2
        int[] arr_2=arr.clone();
       printArray(arr_2);
      arr_2[0]=0;
      arr_2[1]=0;
      System.out.println("original array after changing arr_2");
      printArray(arr);
      System.out.println("coppy arr_2 after changing arr_2");
      printArray(arr_2);
    }
}
