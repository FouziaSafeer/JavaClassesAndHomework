package classNo17;

public class Task2 {
    //reverse string
   public static String reverStr(String input){
      return   new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(reverStr("monday"));
     //  reverStr("Monday");///in static methods we dont need to creat object.//insame class we dont need
        //class name before object
       /* Task2 task2=new Task2();
        task2.reverStr("monday");*/
        //static methods can be called by just writing the name of the class
    }
}
