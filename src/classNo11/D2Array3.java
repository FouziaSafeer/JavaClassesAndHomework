package classNo11;

public class D2Array3 {
    public static void main(String[] args) {

        int num1=10;
        int num2=20;



        int[][] matrix={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}};


        //Write a loop to print elements for 2d array
        //matriz.lenth tells us how 1D arrays are present in this 2d array
        //enhance loop
        for (int[] arr:matrix){
            for(int number:arr){

                System.out.print(number+" ");
            }
            System.out.println();
        }
       /* for (int i = 0; i < matrix.length; i++) {
            //matrix[i].lenth the size of each 1d arrays

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }*/

            
        }
        
    }

