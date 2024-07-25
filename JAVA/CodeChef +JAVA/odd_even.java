import java.util.*;


public class odd_even {





    public static void main(String[] args) {
        Scanner t =new Scanner(System.in);
        for(int i=2; i<=5; i++){
            int N = t.nextInt();
        if (N%2==0) {
        System.out.println("Not weird");    
        }
        else{
            System.out.println("Weird");
        }
        }
        for(int i=6; i<=20; i++){
                    int N = t.nextInt();

            if(N%2==0){
                System.out.println("Weired");
            }
            else{
                System.out.println("Not Weird");
            }
        }
        for(int i=20; i<100; i++){
        int N = t.nextInt();
           if (N%2==0) {
               System.out.println("Not Weird");
           }
        }
       
       
    }
}
