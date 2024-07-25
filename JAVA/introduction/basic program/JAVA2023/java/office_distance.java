// Solution as follows
import java.util.Scanner;

class office_distance
{
    public static void main (String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("enter number of times a man was travel");
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            int x = read.nextInt();
            
            // Create a new variable Y for total distance.
            // 5 days a week - Chef will travel 2*X daily - i.e. return trip walk to office
            int y = 2 * x * 5;
            
            // Print the distance travelled for each test case.
            System.out.println("total distance travel by the man in a " + x +" days is: " +y);
        }
    }
}
