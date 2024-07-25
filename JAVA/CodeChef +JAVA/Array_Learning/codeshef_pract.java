
import java.util.*;
class codeshef_pract
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
    		
    		// HashSet is a class that can be used to store unique values of an ArrayList.
    		HashSet<Integer> unique = new HashSet(a);
            // create an ArrayList to store the sorted unique list
    		ArrayList<Integer> uniquesort = new ArrayList<Integer>(unique);
    		Collections.sort(uniquesort);
        }
    }
}