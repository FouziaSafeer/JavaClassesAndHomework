package classNo20;

public class Sport {
    String name;
    String country;



    Sport(String name,String country){
        this.name=name;
        this.country=country;
    }
    public void display(){
        System.out.println(name+ " is palayed in "+ country);
    }
}
class Criket extends Sport{
    String helmet;
    Criket(String name, String country, String helmet){
        super(name,country);//make a call to the immediate super class constructor
        this.helmet=helmet;


    }

    }
    class Soccor extends Sport{

    String team;
    int numberOfPlayer;

    Soccor(String name,String country,String team,int numberOfPlayer){
        super(name,country);
        this.team=team;
        this.numberOfPlayer=numberOfPlayer;
    }
    void displayTeam(){
        System.out.println(team+ " consiste of player "+numberOfPlayer);
    }
    }

