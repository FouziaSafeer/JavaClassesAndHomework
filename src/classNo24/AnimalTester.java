package classNo24;

public class AnimalTester {
    public static void main(String[] args) {
        Animal [] arr={new cat(),new Dog()};
        for (Animal animal:arr)
              {animal.speak();
                  animal.eats();

        }
    }
}
