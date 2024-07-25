/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class use_of_else_if
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int r = read.nextInt();
		int k = read.nextInt();
		if(r > k){
		    System.out.println("Ram is heavier than Karan");
		}
		else if(r < k)
		{
		    System.out.println("Karan is heavier than Ram");
		}
		else{
		    System.out.println("Ram & Karan have the same weight!");
		}
	}
}