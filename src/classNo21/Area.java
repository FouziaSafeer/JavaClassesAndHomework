package classNo21;

public class Area {
   // int length;
   // int width;

    void calArea(double length,double width){
        System.out.println("Area of Recangle "+length*width);
    }
    void calArea(double length){// up casting int to double
        System.out.println("Area of square  "+length*length);
    }
}
