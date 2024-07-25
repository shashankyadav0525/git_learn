import java.util.*;
public class rev_k_array {
 static int[] rotate(int[] arr, int k){
    int n=arr.length;
     k = k % n;
    int[] ans=new int[n];
    int j=0;

       for(int i=n-k;i<n;i++){
        ans[j++]=arr[i];
 }    
 for(int i=0; i<n-k; i++){
    ans[j++]=arr[i];
 }

return ans;
}
public static void main(String[] args) {
    Scanner t=new Scanner(System.in);
    System.out.println("enter the size of array :");
    int n=t.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the element in array");
    for(int i=0; i<n; i++){
       arr[i]=t.nextInt();
    }
    System.out.println("enter the nub of rotation :");
    int k=t.nextInt();
    System.out.println("original array :");
    printArray(arr);
    
    int[] ans=rotate(arr,k);
    System.out.println("Array after rotation :");
    printArray(ans);
}
}