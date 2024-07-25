
//package lecture18_Array;

public class MultiD_Array {
    void MArray(){
        // int[][] arr_1 = new int[5][3];
         //or
         int[][] arr_1={{54,33,3},{34,3,4},{12,23,21}};
    
         System.out.println(arr_1[0][2]);
         System.out.println(arr_1[0][1]);
         System.out.println(arr_1[0][2]);
         int[][][] arr_2 = new int[2][4][3];
        arr_2[0][0][0] = 22;
       /* arr_2[0][0][1] = 21;
        arr_2[0][0][2] = 24;
        arr_2[0][0][3] = 20;*/
        System.out.println(arr_2[0][0][0]);
       // System.out.println(arr_2);
        //System.out.println(arr_2);
        //System.out.println(arr_2);
        }
         public static void main(String[] arge){
        MultiD_Array obj = new MultiD_Array();
        obj.MArray();
         
        }
}
