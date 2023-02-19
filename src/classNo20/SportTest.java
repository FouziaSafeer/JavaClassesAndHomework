package classNo20;

public class SportTest {
    public static void main(String[] args) {
      Criket pak = new Criket("Cricket","Pakistan","green helmet");
      pak.display();

      Soccor america=new Soccor("Soccor","USA","messi",12);
      america.display();
      america.displayTeam();
    }
}
