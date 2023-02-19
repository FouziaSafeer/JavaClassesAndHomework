package classNo25;

public class MoveAbleTester {
    public static void main(String[] args) {
        //Moveable [] moveables={new Car(),new Dog()};
        Moveable [] moveables={new Car(),new Dog()};
        for (Moveable m:moveables) {
            m.move();
            Ownable [] ownables={new Car(),new Dog()};
            for (Ownable o:ownables)
                  {  o.own();

            }

        }
    }
}
