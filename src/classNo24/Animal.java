package classNo24;

import java.sql.SQLOutput;

public  abstract class Animal {// abstraction makes life easyyyy
    /*define speak eat methods creat 3 sub classes and override the speak eat method*/

    String animalType;//birds, mammals,reptiles, etc
  void  run(){
      System.out.println("Animal runs");

    }
   abstract void speak();//{
   //     System.out.println("Mostly animal Speak");
  //  }
    void eats(){
        System.out.println("Eats food");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("wolf wolf");
    }

    @Override
    void eats() {
        System.out.println("eats bones");
    }
}
class cat extends Animal{
    @Override
    void eats() {
        System.out.println("Drink milk");
    }

    @Override
    void speak() {
        System.out.println("Miaowwwwwwww");
    }
}
class birds extends Animal{
    @Override
   void speak() {
        System.out.println("Sings song");
    }
}
