package Array3;

import static Array3.TransposeOfAMatrix.printMatrix;
import static Array3.TransposeOfAMatrix.transposeOfAMatrix;

public class RotateAMatrix90 {
     static void rotateMatrix(int[][] a){
         transposeOfAMatrix(a);
         int n = a.length;
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n/2; j++) {
                 int swap = a[i][j];
                 a[i][j] = a[i][n-j-1];
                 a[i][n-j-1] = swap;

             }
             
         }
     }

    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(a   );

//        transposeOfAMatrix(a);
//        System.out.println(transposeOfAMatrix(a);
        rotateMatrix(a);
//        printMatrix(a);

    }

}
