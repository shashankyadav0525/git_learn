 class student {
    int rollno;
    String name;
}
public class Main{
    public static void main(String[] arge){ 
        student obj1 = new student();
        obj1.name="shashank yadav";
        obj1.rollno=33;
        
        System.out.println("name of the student " +obj1.name);
        System.out.println("roll nomber of std1 " +obj1.rollno);

        student obj2 = new student();
        obj2.name= "rishav yadav";
        obj2.rollno=8;
        System.out.println("again " +obj2.rollno);
        System.out.println(obj2.name);


    }
    }

