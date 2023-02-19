package classNo20;

public class SuperClass {
    SuperClass(){
        System.out.println("I am a constructor from parent class");
    }
}
class SubClass extends SuperClass{
//makes default constructor, call to the parent constructor

SubClass(){
  //  super();//make call to parent call constructor // immediate parent
    //always be first line// constructor dont part in heritance /call by super keyword
    System.out.println("I am constructor in child constructor");
}

}