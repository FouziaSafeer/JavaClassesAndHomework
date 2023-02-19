package reviewNo8;

public abstract class Insurance {// we cannot object creat it object , i can have constrctor as i have variable
    // can i have variables inside abstract class====yes
    public String policyNumber;//i can have any access modifier
    String policyHolder;
    public static String company = "Geio";

    //can we have constructor yess
    public Insurance(String policyNumber, String policyHolder) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
    }


    public void getInsurance() {
        System.out.println("We need to get insurance");
    }

    public abstract double calculateCoverage();//dont know imprementation must be used by all classes when inheriatnce


}

class CarPolicy extends Insurance {

    double premium;
    int age;

    CarPolicy(String policyNumber, String policyHolder, double premium, int age) {
        super(policyNumber, policyHolder);
        this.premium = premium;
        this.age = age;

    }

    //to provide implementation we need to follow  rules of over ridiing
    public double calculateCoverage() {
        if (age < 20) {
            return premium * 2;
        } else if (age < 40) {
            return premium * 0.5;

        } else {
            return premium*.02;
        }
    }
}

class PetPolicy extends Insurance {


    int numberOfPets;
    double premium;

    public PetPolicy(String policyNumber, String policyHolder, int numberOfPets, double premium) {
        super(policyNumber, policyHolder);
        this.numberOfPets = numberOfPets;
        this.premium = premium;
    }

    public double calculateCoverage() {
        if (numberOfPets > 2) {
            return premium * 2;
        } else if (numberOfPets > 5) {
            return premium * 3;

        } else {
            return premium*5;
        }
    }
}

