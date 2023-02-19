package classNo23;

import java.sql.SQLOutput;

public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism*/
    String studentName;
    int StudentID;
    String StudentClass;
  Student(String studentName,int studentID){
      this.studentName=studentName;
      this.StudentID=studentID;

  }
    void info(){
        System.out.println("Student name "+studentName+"Student ID"+ StudentID);
    }

    void course(){
        System.out.println("This is second method in parent class");
    }


}
class SyntaxStudent extends Student{
    String course;

    public SyntaxStudent(String studentName, int studentID, String course) {
        super(studentName, studentID);
        this.course = course;
    }


    void info(){
        System.out.println("Student name "+studentName+" Student ID "+ StudentID+ "Student course"+ course);
    }

    void course(){
        System.out.println("This is Syntax in child class");
    }
}
class CollegeStudent extends Student{
    public CollegeStudent(String studentName, int studentID, int grade) {
        super(studentName, studentID);
        this.grade = grade;
    }

    int grade;

    @Override
    void info() {
        System.out.println("Student Name "+studentName+" Student ID "+ StudentID+" Student Grade "+grade);
    }
    void course(){
        System.out.println("This is second college class");
    }
}
class SchoolStudent extends Student{
    public SchoolStudent(String studentName, int studentID, String schoolName) {
        super(studentName, studentID);
        this.schoolName = schoolName;
    }

    String schoolName;

    @Override
    void info() {
        System.out.println("Student Name "+studentName+" Student ID "+ StudentID+" School Name "+ schoolName);
    }
}
class tester {
    public static void main(String[] args) {


    Student[] student = {new SyntaxStudent("Fouzia",45,"STLT"),new CollegeStudent("Faiza",55,4),new SchoolStudent("Sadia",458,"MA")};
        for (Student st:student) {
            st.info();
            st.course();
            System.out.println("_________________________________________");

        }
}}