package ClassNo12;

public class Cartester {
    public static void main(String[] args) {
        //bmw object
        Car bmw= new Car();
        bmw.make="bmw";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="grey";
        bmw.moveForward();

        bmw.applyBrakes();


       //audi object
        Car Audi=new Car();
        Audi.make="Audi";
        Audi.model="A3";
        Audi.year=2018;
        Audi.color="Black";
        Audi.moveForward();



        //bike object
        Bike honda=new Bike();
        honda.color="Red";
        honda.speedMax();

        //lorry object
        Lorry truck=new Lorry();
        truck.maxSpeedLimit();




    }
}
