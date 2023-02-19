package reviewNo8;

public class InsuranceTest {
    public static void main(String[] args) {
        //can i create object insurance class, no, as its abstract


        Insurance  carPolicy=new CarPolicy("123456","fouzia",12.23,25);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());
        PetPolicy petPolicy=new PetPolicy("56++523","Olfccc",5,5);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());
    }
}
