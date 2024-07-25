


//  THIS IS CLASS AND OBJECT CONCEPT WE ARE USE DIFFERENT PERSON  

 public class oops01{
public static void main(String [] arge){

    person p1 = new person();
    p1.age = 24;
    p1.name = "Shashank";
    // person p2 = new person();
    //p2.age =22;
    //p2.name = "rishav";
    person p2 = new person(25,"Sarthak");
    //System.out.println(p1.age + " " + p1.name );
    //System.out.println(p2.age + " " + p2.name );
    p1.eat();
    p2.walk(6);
    p2.walk();
    System.out.println("total number of person is "+person.count);
    pen x = new pen();
    x.cost = 5;
    x.colour = "blue";
    pen y = new pen();
    y.cost = 10;
    y.colour = "black";
    System.out.println(x.cost +" "+ x.colour);
    System.out.println(y.cost +" "+ y.colour);
}
}
//IT IS FUNCTION OR MATHOD

class person{
    String name;
    int age;
    static int count; //STATIC SHOW IT IS CLASS NOT OBJECT
    public person(){ // IT IS CONSTRUCTER TO MAKING MANY OBJECT
        System.out.println("creating an object:");
        count++;
    }
    public person(int newAge, String newName){
        this();
        name = newName;
        age = newAge;
    }
    //PROPERTY OF PERSON WHAT IT WILL DO
    void walk(){         //POLYMORPHISM --> same word work multiple work
        System.out.println(name + " is waking from one place to another:");

    }
    void eat(){
        System.out.println(name + " is eating after walking:");
    }
    void walk(int steps){    //POLYMORPHISM --> same word work multiple work
        System.out.println(name +" is walking:"+ steps +"steps");
    }
}
class pen{
    int cost;
    String colour;

}