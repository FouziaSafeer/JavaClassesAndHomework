package classNo21;

public class Task3 {
    /*Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.*/
    private void printname(){
        System.out.println("Name 1  ");
    }
    private void printname(String name){
        System.out.println("Name 2  "+name);
    }
    private void printname(String name, int age){
        System.out.println(" %s "+name +" "+age);
    }

    public static void main(String[] args) {
        Task3 t1=new Task3();
        t1.printname();
        t1.printname("Fouzia");
        t1.printname("Faiza",10);
        int [] arry=new int[5];
        //while(arry.)

        /**/
    }
}

