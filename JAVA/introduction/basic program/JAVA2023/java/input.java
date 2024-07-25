import java.util.Scanner;

class input
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		int a = read.nextInt();
		int b = read.nextInt();
		System.out.println("Sum is: " + (a+b));
		System.out.println("Difference is: " + (a-b));
	}
}
