package classNo10;

import java.util.Arrays;

public class D2Arrays1 {
    public static void main(String[] args) {

    int[][] matrix={{10,20,30},
                    {55,22,45,50,45,685,458},//// multiple 1d array
                    {100,220,450},

    };
       // System.out.println(matrix[2][1]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
