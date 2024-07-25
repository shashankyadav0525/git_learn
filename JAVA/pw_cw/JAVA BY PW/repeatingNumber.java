import java.util.*;
public class repeatingNumber{
static int firstrepeatNumber(int[] arr){
    int n=arr.length;

    for (int i=0; i<n; i++) {  //first number
        for (int j=i+1; j<n; j++){ //second number
            if(arr[i]==arr[j]){   //found answer
             return arr[i];
            }
        } 
    }
          return -1;  
        }
        public static void main(String[] args) {
            Scanner t=new Scanner(System.in);
            System.out.print("enter array size:");
            int n=t.nextInt();
            int[] arr=new int[n];
            System.out.println("enter" + n + "elements");
            for (int i=0; i<n; i++) {
                arr[i]=t.nextInt();
            }
            System.out.println("first repeating number:" + firstrepeatNumber(arr));
        }
    }
