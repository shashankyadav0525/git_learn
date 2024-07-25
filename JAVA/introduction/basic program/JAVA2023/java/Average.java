import java.util.Scanner;
 class Average{
    public static void main(String[] arge){
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        while(n-->0){
            int x = t.nextInt();
            int y = t.nextInt();
            int z = (x+y);
            
            if(z%2==0){
                System.out.println(z/2);
            }
            else
            System.out.println(-1);
        }
    }
}