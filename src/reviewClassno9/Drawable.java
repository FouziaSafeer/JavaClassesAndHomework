package reviewClassno9;
// collection of public static final variables
//
public interface Drawable {
    String tool = "Pencil";// be default public static final


    void draw(); //by default this method is public abstract
default void print() {
    System.out.println("We are drawing object using " + tool);
}

    static void erase() {
        System.out.println("I am able can able to  am erasing shape");
    }
}

//after java 8 static and default methods were added to interface..

  class Rectangle extends Shape implements Drawable{

      public Rectangle(String color, double width, double length) {
          super(color, width, length);
      }

      @Override

      public void draw() {
          System.out.println("I am drawing rectangle");
      }

      @Override
      public double calculateArea() {
          return length*width;
      }
  }
  abstract class Shape{
   public String color;
   protected double width,length;
    Shape(String color,double width,double length){
        this.color=color;
        this.width=width;
        this.length=length;}

       public abstract double calculateArea();
    }


  class Square implements Drawable{

      @Override
      public void draw() {
          System.out.println("I am drawing Square");
      }
  }