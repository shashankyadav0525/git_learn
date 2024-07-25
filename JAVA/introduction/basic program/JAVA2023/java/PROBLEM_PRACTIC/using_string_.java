// Click on 'Submit' to view the results
// Click on 'Next' to proceed
import java.util.*;

class using_string_
{
	public static void main (String[] args)
	{
	    // Create an ArrayList
		ArrayList<String> codechef = new ArrayList<>();
		
		// Add elements
		codechef.add("chef");
        codechef.add("chefina");
        System.out.println("ArrayList with 2 Strings: " + codechef);
        
        // Access element
        System.out.println("First element of the ArrayList: " + codechef.get(0));
        
        // Remove element
        codechef.remove(0);
        System.out.println("First element removed: " + codechef);
        
        // Change element
        codechef.set(0, "code");
        System.out.println("First element changed to: " + codechef.get(0));
        
        // size of the ArrayList
        System.out.print("Size of/number of elements in the ArrayList: " + codechef.size());
	}
}