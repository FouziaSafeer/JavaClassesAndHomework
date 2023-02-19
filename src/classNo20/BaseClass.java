package classNo20;

public class BaseClass {


    String name ="Fizzy";




    void hello(){
        System.out.println("hello method from BaseClass");
    }
}
class Child extends BaseClass{
    String name="Cool";
    void callMe(){
        System.out.println(name); //cool
        System.out.println(super.name);}//fizzy


    void hello(){
        System.out.println("hello method from child class");
    }

           void callingParentMethods(){
        hello();
        super.hello();//super refer to parent refred parent methos
        }
    }

