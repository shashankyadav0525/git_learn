import java.util.*;
public class reverse_order {
    public static void main(String arge[]){
        Scanner t =new Scanner(System.in);
        int n = t.nextInt();
        int x = t.nextInt();
        for (int i=1; i<=n; i++) {
            ArrayList<Integer> s =new ArrayList<Integer>();
            for(int j=1; j<=x; j++){
               s.add(j);
            }
            System.out.println(s);
            Collections.sort(s,Collections.reverseOrder());
            System.out.println(s);
        }
    }
}
