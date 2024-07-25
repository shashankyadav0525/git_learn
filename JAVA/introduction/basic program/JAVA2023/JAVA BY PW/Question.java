import java.util.Scanner;
 public class Question{
    static int mymethods(int[] arr ,int x){
        int lind=-1;
        for(int i=0; i<arr.length; i++){
               if (arr[i]==x) {
                lind=i;
               }
        }
        return lind;
}
static int countOccurences(int[] arr, int x){
    int count=0;
     for(int i=0; i<arr.length; i++) {
        if (arr[i]==x) {
            count++;
        }
     }
     return count;
}
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("enter the num of times run:");
         int n=t.nextInt();
         int[] arr=new int[n];
         for(int i=0; i<arr.length; i++){
            arr[i]=t.nextInt();
         }
         System.out.println("enter x");
         int x=t.nextInt();
        System.out.println(countOccurences(arr,x));
        System.out.println("last occerence of arrays:" + mymethods(arr, x));
        }
}