package classNo17;

public class Student {
    String id;
    String name;
    int age;
    double weight;


    Student(String studentId,String studentName, int studentAge,double studentWeight){
        id=studentId;
        name=studentName;
        age=studentAge;
        weight=studentWeight;
    }
   void StudentInfo(){
       System.out.println("Student ID "+ id +" Student Name "+ name+" student age "+ age+"student weight "+ weight);

    }
}
