package review05;

public class Car {
   protected String make,model;
    int year,horsePower;

     public Car(String make, String model){
         this.make=make;
         this.model=model;
     }
     public Car(String make, String model,int year,int horsePower){
         this( make, model);// this making call to the current class constructoer
         this.year=year;// accessing current class instance variavle
         this.horsePower=horsePower;
     }
     public void start(){
         System.out.println(make+ " start");
     }
     public void drive(int speed){
         System.out.println(make+" derive with speed "+ speed);
     }
    // void start(){}
     //void drive(){}
    // same class same 2 methods  .....method overloading
//how to implements? 1)by diffent no of arguments
// 2)by changing arguments3)sequence of arguments
    void drive(String destination){
        System.out.println(make+" derives to "+ destination);
    }
    void drive(int speed,String destination){
        System.out.println(make+" derives to "+ destination+ " with speed"+ speed);
    }
   void drive (String destination,int speed){
       System.out.println(make+" derives to "+ destination+ " with speed"+ speed);
   }
   //am i overloading
    //No,  by changing access modifier we are not overloading
 //private void drive(int wheel){}
   // String drive(String destination){ overloading No
    //we cannot overload by changing retune type
     //    return destination;
    //method signature nameofmethod()
    //inoverloading method signature should be diffrent
    //in overloading we don't care about return type  OR access modifiers
    }


