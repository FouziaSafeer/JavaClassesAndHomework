package classNo29;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    void printDogName(){
        System.out.println("Dog name is : "+name);
    }
}
