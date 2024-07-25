//WAP through class lavel scope ,method lavel scope and block lavel scope
class Maths{
    int a = 5;//number variable
    int b = 4;//class leval scope
    int add(){
        return a+b;
    }
    int sub(){           //method level scope
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
    }
    void demo(){
      for (int i=1; i<=5; i++) {
        System.out.println(i);
      }
      {
        int x=3;   //block level scope
        int y = 9;
        System.out.println(x*y);
      }
        
    }  
}
public class lect_16 {
    public static void main(String[] arge){
        Maths obj = new Maths();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());
         obj.demo();
    }
    
}
