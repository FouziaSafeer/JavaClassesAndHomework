package classNo24;

public  abstract class Phone {
    //create a phone class abstract method display, unlockphone
    //2 classes iphone, samsumg ,google and provide specific impelmentation
    //write coode to achive runtime poly

   abstract void display();

   abstract void  unlockphone();

   abstract void SendText();

}

class iPhone extends Phone{
    void display(){
        System.out.println("iPhone displays pictures nice");
    }
    void unlockphone(){
        System.out.println("With Face-ID");
    }
    void SendText(){
        System.out.println("Lets use the Imessages to send the text");
    }


    //void SendText() {

    }

    class samsung extends Phone{
        @Override
        void display() {
            System.out.println("Gallary app to browse the photos");

        }

        @Override
        void unlockphone() {
            System.out.println(" Using fingerPrint sensor ");

        }

        @Override
        void SendText() {
            System.out.println("Messages app to send the messages");

        }
    }

class google extends Phone{
    @Override
    void display() {

    }

    @Override
    void unlockphone() {

    }

    @Override
    void SendText() {

    }
}