import java.util.*;
public class table {
    public static void main(String arge[]){
        System.out.println("enter the number");

        Scanner t =new Scanner(System.in);
        int n = t.nextInt();
       
        ArrayList <Integer> a = new ArrayList<Integer>();  ///// HEAR WE ARE UNDERINSTAND THE 1-->SORT,REVERSE,SWAP,AND ARRANGING THE ARRAY;///
        for (int i=1; i<=n; i++) {
           a.add(i);
        }
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        
        System.out.println("reverse of array is " +a);

        Collections.swap(a, 2, 4);
        System.out.println("swapiing of array is " +a);
        Collections.sort(a);
        System.out.println(a);

    }
}
