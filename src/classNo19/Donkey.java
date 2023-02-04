package classNo19;

public class Donkey {
    String name;
    int age;
    boolean choice;
    double weight;
   // Donkey(){
        //constructor
    //    System.out.println("This is non argument constructor");
  //  }

    Donkey(String name, int age){
       this.name=name;//name =name will give local
        this.age=age;// now with this using instance varable


    }





    void print(){
        System.out.println("Doneky name is "+name+" age is "+age+ choice+ "Weight "+weight);
    }
}
