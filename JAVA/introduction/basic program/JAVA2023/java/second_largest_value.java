/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class second_largest_value
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner t = new Scanner(System.in);
	    int n = t.nextInt();
	    for (int i=1;i<=n; i++) {
	        int a = t.nextInt();
	        int b = t.nextInt();
	        int c = t.nextInt();
	        if(a>b && a>c)
    {
        if(b>c)
            System.out.println( b);
        else
            System.out.println( c);
    }
    else if(b>c && b>a)
    {
        if(c>a)
             System.out.println( c);
        else
             System.out.println(a);
    }
    else if(a>b)
             System.out.println( a);
        else
             System.out.println( b);
	        
	    }
	}
}
