package classNo16;

public class Task4 {
    //create a method that will hello in diffrent languages bases on country that will be pass when method is executed.
    //return==>string,void
    //nameof method=>> sayHello
    //parameter==>String (countryName)
    public static void main(String[] args) {
        Task4 country =new Task4();
        System.out.println(country.sayHello("USA"));
    }
    //Task4 country =new Task4();


String sayHello(String countryName){

    switch(countryName){
        case"USA":
            return "Hello";
           // break; using return type will ignore everything else
        case" Kazakhstan":
            return"Salam";
        case"Italy":
            return "Ciao";
        case"China":
            return "Ni hao";
        default:
            return "Country not supported";


    }

}


}
