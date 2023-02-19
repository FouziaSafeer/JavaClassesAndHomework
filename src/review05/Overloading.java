package review05;

public class Overloading {
    private void hello(){
        System.out.println("hello");

    }
    private void hello(String name ){
        System.out.println("Hello"+ name);
    }//private overload yes possible
    static void bye(){
        System.out.println("bye");
    }
    static void bye(String name){
        System.out.println("bye"+name);
        //static can overload too
    }
}
