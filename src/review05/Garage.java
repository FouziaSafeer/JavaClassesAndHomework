package review05;

public class Garage {
    public static void main(String[] args) {
        Tesla tesla=new Tesla("Tesla","Y",2023,180,"Electric car",true);
    tesla.start();// from super class
        tesla.drive(100);// from super class

        tesla.haveAutoPilot();
        tesla.drive(123);
    }
}
