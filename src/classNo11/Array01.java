package classNo11;

import java.util.Arrays;

public class Array01 {// are array that contain ID arrays.
    //arrays with in arrays. why we should learn 2d arrays
    //because they allow us to store multiple one d arrays which gives us more flexibility to store data
    //for example if we have to store data from Excel files we can use 2d Arrays.
    //  first way--> data type[][]  nameof array=new Datatype[size of rows][];
    //second way data type[][]  nameof array=new {{data,data},{data,data},{data,data,data}}

    public static void main(String[] args) {
        int[][] matrix={{10,20,30},
                        {45,55,66},
                {30,40,20,10,25}};
        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString((matrix[0])));// to view values


        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(matrix[0][i]);

        }
        int[]arr=matrix[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       // System.out.println();

        System.out.println(Arrays.toString(matrix[1]));


        int[]arr1=matrix[2];
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);

        }
    }
}
