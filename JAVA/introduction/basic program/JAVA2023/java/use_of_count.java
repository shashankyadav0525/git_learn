import java.util.Scanner;
public class use_of_count {
    public static void main(String[] arge){
        System.out.println("enter the number of time to check: ");

        Scanner t= new Scanner(System.in);
        int x = t.nextInt();
        while(x-->0){
       // for(int i=1; i<=x; i++){
        System.out.println("enter the num of Y:");

            int y =t.nextInt();
            System.out.println("enter the number of Z:");

            int z =t.nextInt();
            if(y<z){
                int B= z-y;
                while(y!=z)
                    y++;
                System.out.println("Answer is "+B);
                
            }
            else if(z<y){
                int A = y-z;
                while(z!=y)
                    z++;
                    System.out.println("Answer is "+A);

                    System.out.println(A);
                
            }
             else{
                System.out.println(0);
            }

        }
    }
    
}
