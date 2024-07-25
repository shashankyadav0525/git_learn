//package lecture18_Array;

public class loop_in_2D_array {
    void siz(){
        int[][] arr_1 = {{1,2,3},{2,3,4},{4,8,5},{1,2,3}};
        for (int i=0; i<=2; i++) {
            for (int j=0; j<=2; j++) {

                System.out.println(arr_1[i][j]);
            }
        }
    }
        public static void main(String[] args) {
            loop_in_2D_array obj = new loop_in_2D_array();
            obj.siz();
        }
    }

