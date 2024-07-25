import java.util.*;
public class else_if {
    public static void main(String[] arge){
        System.out.println("ente the n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	    for(int i=1; i<=n; i++){
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        if(x>y){
	            System.out.println("LOSS");}
	            else if(x<y){
	                System.out.println("PROFIT");
	            }
	            else{
                 System.out.println("NEUTRAL");
	            }
	        }
	    }
	
}

