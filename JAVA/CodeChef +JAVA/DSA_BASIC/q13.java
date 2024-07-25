
import java.util.*;


class q13
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the test case :");
		int t = sc.nextInt();
		
		while( t-- > 0 ){
            System.out.println("enter the input:");
		    String s = sc.next();
		    
		    int ans = 0;
		    
		    for( char c : s.toCharArray() ){
		        
		        if( c >= '1' && c <= '9' ){
		            ans += (int)Character.getNumericValue( c );
		        }
		        
		    }
		    
		    System.out.println( "your sum of number is" +ans );
		    
		}
	}
}
