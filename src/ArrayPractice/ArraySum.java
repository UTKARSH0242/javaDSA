package ArrayPractice;

public class ArraySum {
    static int simpleArraysSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            //            sum = 0;
            sum += j;
//            return sum;

        }


        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ans = simpleArraysSum(arr);
        System.out.println(simpleArraysSum(arr));



    }
}
