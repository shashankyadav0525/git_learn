import java.util.Scanner;

class match_point
{
	public static void main (String[] args)
	{
		System.out.println("enter the number of times player play the match:");
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
			System.out.println("team 'A' player points");
    		int a = read.nextInt();
			System.out.println("team 'B' player points");
    		int b = read.nextInt();
			if (a==7 && b==7) {
				System.out.println("match is draw:");
			}
			else if (a==7 || b==7) {
				System.out.println("those team have 7 points that team is winner:");
			}
    		else if(a<b){
               int c=7-b;
                System.out.println("team 'B' needs "+c +" points to win the match:");
    		}
           else if (b<a) {
               int c=7-a;
                System.out.println("team 'A' needs "+c +" points to win the match:");
            } else if (a==b) {
				int c=7-b;
                System.out.println(" Both team 'A' and 'B' needs "+c +" points to win the match:");
            }
			else
			System.out.println("end the match:");
            

		}
	}
}