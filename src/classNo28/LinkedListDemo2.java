package classNo28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {


    LinkedList<String>subjects=new LinkedList<>();
    subjects.add("SDLC");
    subjects.add("Manual Testing");
    subjects.add("Jira");
    subjects.add("Git");
    subjects.add("Java");

    LinkedList<String>futureSubject=new LinkedList<>();
    futureSubject.add("Selenium");
    futureSubject.add("Testing");
    futureSubject.add("Cucumber");
    futureSubject.add("SQL");
    futureSubject.add("APIs");
    futureSubject.add("Jenkins");



    LinkedList<String>allSubject=new LinkedList<>();
     /*   for (String s1:subjects) {
            allSubject.add(s1);
        }
        for (String s2:futureSubject)
              {allSubject.add(s2);

        }
        System.out.println(allSubject);*/

        allSubject.addAll(subjects);//combine all elements of a list to another list, comine elements
        allSubject.addAll(futureSubject);//removeall
        System.out.println(allSubject);


        LinkedList<String >subjectILike=new LinkedList<>();
        subjectILike.add("Java");
        subjectILike.add("SDLC");
        subjectILike.add("SQL");
        System.out.println(subjectILike);

        allSubject.removeAll(subjectILike);
        System.out.println(allSubject);

}}
