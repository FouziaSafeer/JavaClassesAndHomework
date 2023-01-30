package classNo16;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Zafar";
        student.id="123";
        student.schoolName="Syntax";
        student.age=22;
        student.weigth=78;


        Student student1=new Student();
        student1.name="Hamid";
        student1.id="456";
       // student1.schoolName="Syntax";
        student1.age=5;
        student1.weigth=86;

        Student student2=new Student();
        //student2.name="Nelson";
        student2.id="789";
       // student2.schoolName="Syntax";
        student2.age=25;
        student2.weigth=96;

        System.out.println(student2.schoolName);
        System.out.println(student2.name);
        System.out.println(student.schoolName);//access with class

    }
}
