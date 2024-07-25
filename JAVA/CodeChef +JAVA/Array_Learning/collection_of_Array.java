import java.util.*;

class collection_of_Array {
    public static void main(String[] args) {
        
             Scanner read = new Scanner(System.in);   
    ArrayList<Integer> x=new ArrayList<Integer>();
    x.add(3);
    x.add(2);
    x.add(9);
    x.add(5);
    x.add(5);

    System.out.println(x);
    //sorting the element in the list
    Collections.sort(x);
    System.out.println(x);
    //finding the frequency of array
          System.out.println(Collections.frequency(x,5));
              //finding the size of array
         System.out.println(x.size());
}
}
