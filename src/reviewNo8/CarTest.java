package reviewNo8;

import review05.Car1;
import review05.Tesla;

public class CarTest {
    public static void main(String[] args) {
        BMW bmw=new BMW("Bmw","z4");
        bmw.start();
        bmw.drive("auto");
        bmw.brake();// comes from sub class
        Car1 car1=new Car1("somecar","some model");
        car1.start();
        car1.drive(25);
        Tesla tesla=new Tesla("Tesla","y",2022,150,"auto",true);
        tesla.start();// overrides method from tesla class in exe
        tesla.drive(120);//comes from parent classs
        tesla.haveAutoPilot();//comes from tesla class or subclass
        // run type polymorphism  achieved through method overriding
        //Casting; widening and narrowing use with primitive
       Car1 bmw1= new BMW("bmw","x77");// upcasting
        bmw1.start();
        bmw1.drive(120);
        bmw1.drive("auto");

    }
}
