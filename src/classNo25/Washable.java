package classNo25;
 public interface Washable{
       void wash();//by default as abstract
}


class SmartWatch implements Washable {


    @Override
    public void wash() {
        System.out.println("you can wash this smart watch with out any issue");
    }
}

class Phone implements Washable{


     public void wash(){
        System.out.println("I am IP65 Phone rated you can wash me");
    }

    void turnOn(){
        System.out.println("Please turn the Power button on to On");
    }


}
class inverter implements Washable {
   public void wash() {
        System.out.println("I am IP65 inverter rated you can wash me");
    }
}





