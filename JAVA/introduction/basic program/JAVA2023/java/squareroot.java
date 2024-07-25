import java.util.Scanner;

class squareroot
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		System.out.println("enter the number");
		int  x = read.nextInt();
		System.out.println("cuberoot of given number is:" +(x*x*x));
		System.out.println("squareroot of given number is:"  +(x * x));
	}
}