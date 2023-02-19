package classNo21;

    public class Animal {
        String name;
       String color="Black";

    }

    class Cat extends Animal{
        String color="white";
        int age=10;
        double weight;

        void printColor(){
           String color="blue";
            System.out.println(color);//local variable
            System.out.println(this.color);//child class
            System.out.println(super.color);//parent class color
        }

    }


