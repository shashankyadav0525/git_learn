import java.util.*;
 public class find_larg_small_num{
    public static void main(String arge[]){
        Scanner t= new Scanner(System.in);
        System.out.println("enter the number of times u wwant to check:");
        int num =t.nextInt();
        for (int i=0; i<num; i++) {
            System.out.println("enter the size of array:");
            int size=t.nextInt();
            ArrayList<Integer> a =new ArrayList<Integer>();
            int ele;
            System.out.println("enter the element in array:");

            for (int j=0; j<size; j++) {
                ele=t.nextInt();
                a.add(ele);
            }
            int small=a.get(0);
            int large=a.get(0);
            int l=0;
            while (l<a.size()) {
                if (a.get(l)>large) {
                    large=a.get(l);
                }
                else if (a.get(l)<small) {
                    small=a.get(l);
                    
                }
                l=l+1;
            }
            System.out.println("smallest num =" +small);
            System.out.println("largest num =" +large);

        }
    }
 }