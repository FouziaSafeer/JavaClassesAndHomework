package classNo10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
//2d array which can hold three rows/one d arrays
        //each of size three
        String[][] thomsonTrain = new String[3][3];
        String [] cabin0={"Adam","zafar","Sam"};
        String [] cabin1={"Nabi","Saud","Anees"};
        String [] cabin2={"Safi","abeera","Zahra"};


        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;
        // in the first pair [] we specify the address of 1D array,
        System.out.println(thomsonTrain[1][2]);
        System.out.println(Arrays.toString(thomsonTrain[0]));
    }
}
