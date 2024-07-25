import java.util.Scanner;

public class while_loop {
    public static void main(String[] arge) 
    {
      Scanner read = new Scanner(System.in);
      int s = read.nextInt();
      int a=1;
      while(a < s)
      {
        System.out.println(a);
        a++;
      }        
    }
}
