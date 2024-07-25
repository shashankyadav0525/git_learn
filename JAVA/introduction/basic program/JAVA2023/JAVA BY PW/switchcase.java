import java.util.*;
public class switchcase {
    public static void main(String[] arge){
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number");
        int n= read.nextInt();
        switch (n) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
            case 4:
                break;
             case 5:   
                System.out.println("thursday");
                break;
             case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
        
            default:
            System.out.println("invalid number");
                
        }
    }
}
