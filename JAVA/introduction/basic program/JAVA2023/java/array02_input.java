
import java.util.*;

class array02_input 
{
    public static void main (String[] args)
    {
        System.out.println("enter the times u want to run:");
        Scanner read = new Scanner(System.in);
        
        int t = read.nextInt();
        int ele;
        System.out.println("enter the size of array where element where the element are store: " );
        for(int i=0; i<t; i++)
        {
            int n = read.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            System.out.println("enter the element in array:");
            for(int j=0; j<n; j++){
                ele = read.nextInt();
                a.add(ele);
            }
            
            int small = a.get(0);
            int large = a.get(0);
            
            int l = 0;
            while(l < a.size()){
                if (a.get(l) > large){
                    large = a.get(l);
                }
                if (a.get(l) < small){
                    small = a.get(l);
                }
                l = l+1;
            }
            System.out.println("smallest number is:" +small );
            System.out.println("largest number is:" +large );
        }
    }
}