package Array3;

public class SearchInTwoDMatrix {
    static boolean searchInTwoDMatrix(int matrix[][] , int target) {

        int row = 0;
        int cols = matrix[0].length - 1;

        while (row < matrix.length && cols >= 0) {
            if (matrix[row][cols] == target) {
                return true;
            } else if (target > matrix[row][cols]) {
                row++;
            } else {
                cols--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 4, 5, 7},
                {2, 5, 6, 9},
                {6, 10, 11, 13},
                {8, 12, 15, 18}
        };

        int key = 14;

        System.out.println(searchInTwoDMatrix(matrix, key));

    }
}
