package classNo26;

public interface Trustable {
   public static final int age=10;//final, public, static
    String color="FDGDFGSDFGSfelkrjfrrk";//constants
     int trust();


     //sometime
     static void method1(){
         System.out.println("hello world");
     }
     default void method2(){
         //support functional programming


     }
     private void methods3(){}





}
class Bank implements Trustable{


    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        Trustable.method1();
        System.out.println(Trustable.age);
    }
}