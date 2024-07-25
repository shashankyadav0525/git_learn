import java.util.*;
public class L_17_q2A {
    static void printarray(int[] array){
        for(int i=0;i<array.length;i++){

            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static int[] revArray(int[] array){
        int n=array.length;
        int[] ans=new int[n];
        int j=0;
        // traverse orignal array in reverse order
        // for(int i=n-1;i>=0;i--){
        //             ans[j++]=array[i];
        // }
        int i=n-1;
        while(i>=0){
            ans[j++]=array[i--];
        }
        return ans;
    }
        public static void main(String[] args) {
            int a=9;
            int b=3;
            int[] array={1,2,3,4,6,7,8};
int[] ans=revArray(array);
printarray(ans);     
        
}
}
 