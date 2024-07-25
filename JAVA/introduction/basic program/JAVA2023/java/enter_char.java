import java.util.Scanner;

class enter_char {
    public static void main(String[] arge){
    char ch;
    System.out.println("please enter the character:");
    Scanner read = new Scanner(System.in);
    ch=read.next().charAt(0);
    System.out.println(ch);
}
}