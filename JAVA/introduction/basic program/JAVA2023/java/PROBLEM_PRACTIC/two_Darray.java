import java.util.*;
class two_Darray{
    public static void main(String arge[]){
        Scanner t= new Scanner(System.in);
        //int size1 =t.nextInt();
        //int size2=t.nextInt();
        int row=t.nextInt();
        int colum=t.nextInt();
        int[][] num=new int[row][colum];
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=colum; j++) {
                num[i][j]=t.nextInt();
                
            }
        }
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=colum; j++) {

                System.out.println(num[i][j] +" ");
            }
            System.out.println();
        }
    }
}