// Click on 'Submit' to view the results
// Click on 'Next' to proceed
import java.util.*;

class using_array
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		ArrayList<Integer> codechef = new ArrayList<Integer>();
        codechef.add(45);
        codechef.add(56);
        codechef.add(23);
        
        System.out.println("Created ArrayList: " + codechef);
        
        Collections.sort(codechef);
        System.out.println("Sorted ArrayList: " + codechef);
        
        System.out.println("occurrence of 23 in the ArrayList: "+ Collections.frequency(codechef, 23));
        
        Collections.swap(codechef, 1, 2);
        System.out.println("ArrayList after swapping first and last elements: " + codechef);
	}
}