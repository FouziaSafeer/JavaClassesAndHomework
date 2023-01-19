package classNo11;

public class CatTester {
    public static void main(String[] args) {
        Cat katty =new Cat();// creating object
        katty.name="lego";
        katty.breed="Van cat";
        katty.age=2;
        katty.color="Grey";
        katty.attitude=false;

        katty.eat();

        Cat cat2=new Cat();
        cat2.name="Loki";
        cat2.breed="Domestic";
        cat2.color="White";
       // cat2.eat();
        cat2.speak();
        System.out.println(cat2.color);



    }
}
