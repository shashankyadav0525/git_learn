import java.util.*;
public class addIntergrs_up_to_user_size {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        System.out.println("enter the times case run:");
        int n=t.nextInt();
        for (int i=0; i<n; i++) {
            ArrayList<Integer> a=new ArrayList<Integer>();
            System.out.println("enter the element of array:");

            int m=t.nextInt();
            for (int j=0; j<m; j++) {
                int ele = t.nextInt();
                a.add(ele);
            }
            System.out.println(a);
            System.out.println("size of array is:");
            System.out.println(a.size());
            Collections.sort(a);
            System.out.println(a);
            Collections.sort(a,Collections.reverseOrder());
            System.out.println(a);
        }
    }
}
