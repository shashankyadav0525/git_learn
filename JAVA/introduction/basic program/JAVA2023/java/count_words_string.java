import java.util.Scanner;

public class count_words_string {
    public static void main (String[] arge){
    System.out.println("Enter the String:");
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();// welcome to java
    int count=1;
      for (int i=0; i<s.length()-1; i++) {
          if((s.charAt(i)==' ' && s.charAt(i+1)!=' ')){
            count++;
          }
      }
    
      System.out.println("number of word in string is" + count);
    }


}  
