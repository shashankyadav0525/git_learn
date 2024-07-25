import java.util.*;
public class use_while {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int l=1;
        while (l<n) {
            ArrayList<Integer>a=new ArrayList<Integer>(null);
            int ele=t.nextInt();
            a.add(ele);
           a.get(l);
l++;        
        }
    }
}
