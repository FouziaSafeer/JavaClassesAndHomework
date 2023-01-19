package classNo10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        int[] arr = {10, 13, 20, 25, 45, 50};//Limitation of for each loop

        //prints on odd number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {//arr[1]=0; used to update single element in an array
                System.out.println(arr[i]);
            }}


            System.out.println("_________________________");

        ///replace all odd number with zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1)
                arr[i] = 0;
            System.out.println(arr[i]);
        }


    }
}
