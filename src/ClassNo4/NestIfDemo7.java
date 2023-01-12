package ClassNo4;

public class NestIfDemo7 {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=120000;//90000

        if(studyHard){
            System.out.println("We get jobs");

            if(salary>10000){
                System.out.println("lets buy Tesla");
            }
            else{
                System.out.println("Lets buy  Toyota");
            }



        }
        else {
            System.out.println("it might take alittle longer to get jobs");
        }
    }
}
