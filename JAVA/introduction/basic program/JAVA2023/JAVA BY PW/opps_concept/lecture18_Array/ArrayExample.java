//package lecture18_Array;

public class ArrayExample {
    void demoArrays(){
       int [] age = new int[3];
       String[] name={"shashank","rishav","piyush"};
       double[] marks = new double[3];
       age[0] = 34;
       age[1]=23;
       age[2]=33;
       marks[0]=2.2;
       marks[1]=11.3;
       
       System.out.println(age.length);
       System.out.println(age[1]);
       System.out.println(age[2]);
       System.out.println(marks[0]);
       System.out.println(marks[1]);
       System.out.println(name[0]);
       System.out.println(name[1]);
       System.out.println(name[2]);

    }

public static void main(String[] arge){
    ArrayExample obj = new ArrayExample();
    obj.demoArrays();
}
}
