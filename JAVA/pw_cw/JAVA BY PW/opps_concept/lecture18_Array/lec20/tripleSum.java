//tripple sum of array
import java.util.*;
public class tripleSum{
    static int TripleSum(int[] a,int target){
        int ans=0;
        int n=a.length;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if (a[i]+a[j]+a[k]==target) {
                        ans++;
                    }
                }
            }
        }
        return ans;

    } 
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=t.nextInt();
        int[] a=new int[n];
        System.out.println("enter the element of array:");
        for (int i=0; i<n; i++) {
            a[i]=t.nextInt();
        }
        System.out.println("enter the target sum:");
        int target=t.nextInt();
System.out.println(TripleSum(a,target));
}
}