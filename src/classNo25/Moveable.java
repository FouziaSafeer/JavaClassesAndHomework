package classNo25;

public interface Moveable {
    void move();

}
 interface Ownable{
void own();
}
 class Car implements Moveable,Ownable{


     @Override
     public void move() {
         System.out.println("I can move Car");

     }

     @Override
     public void own() {
         System.out.println("i own this product");
     }
 }
class Dog implements Moveable,Ownable{


    @Override
    public void move() {
        System.out.println("I can move Dog");

    }

    @Override
    public void own() {
        System.out.println("I own it tooo");
    }
}