package classNo22;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get degree u need high school diploma");
    }
}
class Bachelors extends Degree{}
class Masters extends Degree{
    @Override
    void getPrerequisite() {
        System.out.println("For master degree we need a bachelor degree");

    }
}
class DegreeTester{
    public static void main(String[] args) {
        Degree deg=new Degree();
        deg.getPrerequisite();
        Bachelors bac=new Bachelors();
        bac.getPrerequisite();
        Masters mas=new Masters();
        mas.getPrerequisite();
    }

}
