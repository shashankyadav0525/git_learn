
import java.util.*;
class rightmost_index_of_highest_ele 
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		int ele;
		for(int i=0; i<t; i++)
		{
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		int n = read.nextInt();
    		for(int j=0; j<n; j++){
    		    ele = read.nextInt();
    		    a.add(ele);
            }
            System.out.println(ele);
        }
    }
}