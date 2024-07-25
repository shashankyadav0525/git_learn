import java.util.*;
public class ArthmaticOperators{
    public static void main(String[] arge){
     int p=4,w=3,r=2;
     System.out.println(p+w+r);
     System.out.println(p-w-r);
     System.out.println(p*w*r);
     System.out.println(p*w/r);



     //&& Operatores
     System.out.println((p>w)&&(w>r)); //true
     System.out.println((p>w)&&(w<r));//false
       //||Operatores

     System.out.println((p>w)&&(w>r));//true
     System.out.println((p>w)&&(w<r));//true

    }
}