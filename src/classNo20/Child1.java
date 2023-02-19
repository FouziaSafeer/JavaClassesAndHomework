package classNo20;

public class Child1 extends Parent {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.hello();
        //0c1.money(); private
        c1.bye();
        Parent.bye();/// acess by parent by class
        Child1.bye();
        c1.name="Gulzhaarrr";
        Child1.lastName="Berik";

    }
}
