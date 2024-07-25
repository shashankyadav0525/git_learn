import java.util.*;
public class reverseBYswapMETD {
    static void revinarray(int[] arr,int i, int j){
           int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
        }
         static void conofarray(int[] arr){
                int i=0,j=arr.length;
                while (i<j) {
                    swapInArray(arr,i,j);
                    i++;
                    j--;
                }
            }
         public static void main(String[] args) {
            int a=9;
            int[] arr={1,2,3,4};
            revinarray(arr);
            printArray(arr);
         }
 }
