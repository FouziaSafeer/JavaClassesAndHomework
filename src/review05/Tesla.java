package review05;
//car class is super class of tesla
public class Tesla extends Car1{

    String type;
    boolean autoPilot;


 public Tesla(String make, String model,int year,int horsePower,String type,boolean autoPilot){
    super(make,model,year,horsePower);
   // super("Tesla","y",2003,102);
    this.type=type;
    this.autoPilot= autoPilot;
}


public void haveAutoPilot(){
    System.out.println(make+ " have auto pilot "+autoPilot);
}
public void start(){
    System.out.println(make+"Start automatically");
}//overriding is when have same method in 2 diffrent classes(_Parent-child)
    //in Overriding inheritance is must
    //in overridding method signature should be same

}
