package Array3;

import java.util.Scanner;

public class TransposeOfAMatrix {
    static void printMatrix(int a[][]) {
        int n = a.length;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }

    static void transposeOfAMatrix(int a[][]) {
        int n = a.length;

        for(int i = 0; i<n; i++) {
            for(int j = i; j<n; j++) {
                int swap = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = swap;
            }
        }
    }

    public static void main(String[] args) {


        int a[][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

printMatrix(a   );

		transposeOfAMatrix(a);
//        System.out.println(transposeOfAMatrix(a);
        printMatrix(a);
    }
}