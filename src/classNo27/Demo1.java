package classNo27;

public class Demo1 {
    public static void main(String[] args) {
        String name="Fouzia";// normal saving name if we use this took ages
       String name2="Faiza";
       String name3="sadia";

        // for multiple name will use string array
        String []names={"hiral","nima","haider","hassan"};
       //
        // displayName(names);//it was easier
        displayNames2(name,name2,name3);//its harder way



    }

    public static void displayName(String[] names){//parameters
        for (String name: names) {
            System.out.println(name);
        }

    }
    public static void displayNames2(String name,String name2,String name3){
       /*name=name;
       name2=name2;
       name3=name3;*/
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        }
    }






