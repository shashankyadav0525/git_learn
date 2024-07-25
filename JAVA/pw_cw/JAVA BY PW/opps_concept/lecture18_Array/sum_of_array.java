 class sum_of_array {
    
    void maxOfArray(){
        //int sum=0;
        int[] arr_1 = {1,3,4,2,8,5};
        int ans = 0;

        for (int i=0; i<arr_1.length; i++) {
             
          //  sum=sum+arr_1[i];
          if (arr_1[i]>ans) {
            ans = ans+arr_1[i];
          
        }
        System.out.println("max" + ans);

    }
  }
public class Main{
    public static void main(String[] args) {
        sum_of_array obj = new sum_of_array();
        obj.maxOfArray();
    }

}
