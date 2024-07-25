//sum of the even-valued terms in fabinoci series:


import java.util.*;

public class catgpt {

public static void main(String[] args) {
    Scanner t= new Scanner(System.in);
    System.out.println("enter the test cases:");
    int n=t.nextInt();
    for(int i=0; i<n; i++){
        System.out.println("enter the number of fabino:");
    int limit = t.nextInt();
    int prev = 1;
    int curr = 2;
    int sum = 0;

    while (curr <= limit) {
        if (curr % 2 == 0) {
            sum += curr;
        }
        int next = prev + curr;
        prev = curr;
        curr = next;
    }

    System.out.println("Sum of even-valued terms: " + sum);
}
}
}