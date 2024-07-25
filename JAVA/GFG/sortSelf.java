import java.util.*;
public class sortSelf {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int a[] =new int[n];
        for (int i=0; i<n; i++) {
            a[i]=t.nextInt();
        }
        for (int i=0; i<n; i++) {
           for (int j=i+1; j<a.length; j++) {
               if(a[i]>a[j]){
               int temp=a[j];
               a[j]=a[i];
               a[i]=temp;
               }
           }
        }
        for (int i=0; i<a.length; i++){
             System.out.print(a[i]+" ");

        }
        for (int i=0; i<a.length; i++){
            // System.out.print(a[a.length-2]+" ");
        }
        System.out.println(a[a.length-2]+" ");

        }
}
