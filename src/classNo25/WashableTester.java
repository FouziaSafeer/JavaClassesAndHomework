package classNo25;

public class WashableTester {
    public static void main(String[] args) {
        Washable [] washables={new SmartWatch(),new Phone(),new inverter()};
        for (Washable w:washables) {
            w.wash();



        }

        }
    }


