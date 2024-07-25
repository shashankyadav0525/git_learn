// The code below is incorrect. Debug the code to solve the problem
import java.util.Scanner;

class mult_div_given_num
{
	public static void main (String[] args)
	{
        System.out.println("enter the times of check the number:");
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
            System.out.println("enter the number which is greater then 10:");
    		int x = read.nextInt();
            System.out.println("enter the multiple number:");
    		int n = read.nextInt();
    		
    	   int points_per_testcase = x /10;
    		int score = points_per_testcase * n;
    		System.out.println("your answer is---->");
    		System.out.println(score);
		}
        System.out.println("end your test case:---->Thank you<-----");
	}
}