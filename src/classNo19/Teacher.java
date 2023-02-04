package classNo19;

public class Teacher {
    String name;
    int teacheid;
    String subject;


    Teacher(String name,int teacherid){
        this.name=name;
        this.teacheid=teacherid;
    }
    Teacher(String name, int teacheid,String subject){
     this(name,teacheid);
      // this.name=name;
       //this.teacheid=teacheid;
       this.subject=subject;
    }
}
