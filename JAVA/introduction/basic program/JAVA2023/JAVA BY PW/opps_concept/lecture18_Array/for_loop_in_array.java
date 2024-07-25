import java.util.Scanner;

//package lecture18_Array;

public class for_loop_in_array {
  void size(){
    int[] arr_1 = {1,2,3,5,3,3,4,5,5,8,9,0,7,6};
   System.out.println("size of array is " +arr_1.length);
/*System.out.println("enter the number of value u want in array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();*/

         /*/ for (int i=0; i<=n; i++) {
              System.out.println(arr_1[i]);
          }  */
          for (int value : arr_1) {
              System.out.println(value);
          }
        }
          public static void main(String[] args) {
            for_loop_in_array obj = new for_loop_in_array();
            obj.size();
          }
}  

