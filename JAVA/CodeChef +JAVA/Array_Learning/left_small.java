//Move the smallest element of the array to the left
import java.util.*;;
public class left_small {
public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("enter the no of times running");
    int t = read.nextInt();
    int ele;

    for(int i=0; i<t; i++)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println("enter the size of element:");

        int n = read.nextInt();
        System.out.println("your element is:");

        for(int j=0; j<n; j++){
            // Read elements from the user and add it to the ArrayList
            ele = read.nextInt();
            a.add(ele);
        }        
        int m=a.size();
        int minElement = a.get(0);
    	int minElementIndex = 0;
        int l=1;
        while(l<n){
               if () {
                
               }
        }
    }
    
}
}