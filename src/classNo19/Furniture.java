package classNo19;

public class Furniture {
    String type;
    double price;
    String color;// with the help of constructor we can initialise objects with specific values
    Furniture(String type,double price,String color){
        this.type=type;
        this.price=price;
        this.color=color;
    }

    void print(){
        System.out.println(type+" price is "+ price+ " color is "+color);
    }
}
