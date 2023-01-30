package classNo16;

public class Task1 {
    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    public static void main(String[] args) {


    SyntaxEmployee emp1=new SyntaxEmployee();
  emp1.empID="Asghar";
  emp1.salary=1000;

    SyntaxEmployee emp2=new SyntaxEmployee();
    emp2.empID="Asel";
    emp2.salary=500;

        System.out.println("Emplyee ID: "+emp1.empID+" Employee sal: "+ emp1.salary+ "  CEO: "+emp1.CEO);
        System.out.println("Emplyee ID: "+emp2.empID+" Employee sal:  "+ emp2.salary+ "  CEO:  "+SyntaxEmployee.CEO);
}}
