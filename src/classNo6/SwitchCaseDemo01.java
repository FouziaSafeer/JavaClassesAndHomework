package classNo6;

public class SwitchCaseDemo01 {
    public static void main(String[] args) {



        String country="china";

        switch(country.toLowerCase()){// convert the text to lowercase e.h USA-->usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("wrong contry");


        }







    }
}
