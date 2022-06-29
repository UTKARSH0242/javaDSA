package Array2;

public class MaximumSumSubArray {
    // Using Kadane's Algo
    static int maximumSumSubArray(int[] a){

        int cSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length ; i++) {
            cSum = cSum + a[i];
            if (maxSum < cSum) maxSum = cSum;
            if (cSum < 0 ) cSum = 0;

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        int answer = maximumSumSubArray(a);
        System.out.println(answer);
    }

}
