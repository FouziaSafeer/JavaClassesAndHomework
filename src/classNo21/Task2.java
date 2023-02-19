package classNo21;

public class Task2 {
    /* class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.*/
 static void printname(){
     System.out.println("Name 1  ");
 }
    static void printname(String name){
        System.out.println("Name 2  "+name);
    }
    static void printname(String name, int age){
        System.out.println("Name 1  "+name +" "+age);
    }

    public static void main(String[] args) {
        printname();// will try from other class later
        printname("fouzia");
        printname("fouzia",5);
    }
}

/*class Tester1{
    public static void main(String[] args) {
        Task2 t1= new Task2();

    }
}*/
