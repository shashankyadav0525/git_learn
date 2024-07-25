import java.util.*;
class q001   
  {
   static int print2largest(int arr[], int n) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[arr.length-2];
    }
        public static void main(String[] arge){
            Scanner t=new Scanner(System.in);
            int n=t.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i]=t.nextInt();
            }
            
            System.out.print("your ans is:" +print2largest(arr,n) +" ");           
        }
  }
