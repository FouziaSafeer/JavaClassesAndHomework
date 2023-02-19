package reviewNo8;

import review05.Car1;

public class BMW extends Car1 {
    public BMW(String make, String model) {
        super(make, model);
    }



    public void start(){
        System.out.println(super.make+ "BMW starts with keyless key");

    }
   public String drive(String typeOfDeriving){
        System.out.println(super.make+" derives to "+ super.model);
       return typeOfDeriving;
   }

    void brake(){
        System.out.println(make+"brakes");
    }



}
/*public class Bmw extends Car {

    Bmw(String make, String model){
        super(make, model);
    }

    public void start(){
        System.out.println(make+" starts with push start button");
    }

    public String drive(String typeOfDriving) {
        System.out.println(make+" drives "+typeOfDriving);
        return typeOfDriving;
    }

    void brake(){
        System.out.println(make+" brakes");
    }
}*/
