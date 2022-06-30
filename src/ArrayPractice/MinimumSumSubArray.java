package ArrayPractice;

public class MinimumSumSubArray {
    static int minimumSumSubArray(int [] arr){
        int cSum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int j : arr) {
            cSum = cSum + j;
            if (minSum > cSum) minSum = cSum;
            if (cSum > 0) cSum = 0;

        }
        return minSum;
    }
    public static void main(String[] args) {
        int [] arr = {3,-4,2,-3,-1,7,-5};
        System.out.println(minimumSumSubArray(arr));

    }
}
