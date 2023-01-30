package classNo16;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    String Name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1=new Students();
        student1.ID="S123";
        student1.Name="Fouzia";
        student1.numberOfStudents++;


        Students student2=new Students();
        student2.ID="S1456";
        student2.Name="Ester";
       student2.numberOfStudents++;

        Students student3=new Students();
        student3.ID="S123";
        student3.Name="zafar";
       student3.numberOfStudents++;
        System.out.println(numberOfStudents);

    }


}
