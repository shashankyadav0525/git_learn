import java.util.*;
public class basic_of_array {
    
    static void  change_array(int[] arr){
        for (int i=0; i<arr.length; i++) {
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[3];
        arr[0]=4;
        arr[1]=5;
        arr[2]=6;
        change_array(arr);
    }
}
