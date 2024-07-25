import java.util.*;
public class sum_of_arraylength{
    void domain(){
        int sum=0;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i=1; i<=arr.length; i++) {
            sum = sum+i;
        }
        System.out.println(sum);

    }
    public static void main(String[] arge){
        sum_of_arraylength obj = new sum_of_arraylength();
        obj.domain();
    }
}
