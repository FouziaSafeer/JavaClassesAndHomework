package classNo17;

public class Dog {
    String name;
    String breed;
    int age;
    double weight;

    Dog (String dogname,String dogbreed, int dogage,double dogweight){
        name=dogname;
        breed=dogbreed;
        age=dogage;
        weight=dogweight;
    }
    void printInfo(){
        System.out.println("Name "+ name+" breed "+ breed+" age "+age+" weight "+weight);
    }

}
