package classNo24;

public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.

  int Ram;
  int Storage;
  String OS;



void playVideo(){
    System.out.println("videos is playing");
}

void browserInternet(){
    System.out.println("Browse the internet");
}

}
class Apple extends Computer{
    @Override
    void playVideo() {
        System.out.println("Playing video on quick time player");
    }

    @Override
    void browserInternet() {
        System.out.println("Browsing internet in Safarii");
    }
    void editVideos(){
        System.out.println("Editing on iMovies");
    }
    void installApp(){
        System.out.println("installing the app from App Store");
    }
}
//=================================================
class HP extends Computer{


    @Override
    void browserInternet() {
        System.out.println("Browsing  using chrome");
    }

    @Override
    void playVideo() {
        System.out.println("PLaying videos using VLC Player");
    }

    void installApp(){
        System.out.println("Buy cheap app there in HP");
    }

}
class TesterComputer
{
    public static void main(String[] args) {
        Computer[] computer={new Apple(),new HP()};
        for (Computer c:computer) {
            c.browserInternet();
            c.playVideo();
            if(c instanceof Apple){// here we are checking the condition if apple class
          Apple apple=(Apple)c; //for function of apple class// converting back to apple object
            apple.browserInternet();
            apple.editVideos();}
        }
    }
}