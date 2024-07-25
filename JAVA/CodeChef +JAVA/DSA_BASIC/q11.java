
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class q11
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			in.nextInt();
		    in.nextLine();
		    String snakes = in.nextLine();
		    snakes = snakes.replace(".", "");
		    snakes = snakes.replace("HT", "");
		    if (snakes == "") System.out.println("Valid");
		    else System.out.println("Invalid");
		}
	}
}
