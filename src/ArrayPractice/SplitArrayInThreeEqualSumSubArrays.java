package ArrayPractice;

public class SplitArrayInThreeEqualSumSubArrays {
    static int splitArrayInThreeEqualSumSubArray(int [] arr){
        int n = arr.length;
        int preSum = 0;
        int totSum = arr[0];
        for (int i = 1; i<n; i++){
            totSum += arr[i];

            if (totSum % 3 != 0) 
                return 0;

        }
        return totSum;

    }
    public static void main(String[] args) {
        int [] arr = {1,3,4,0,4};
        System.out.println(splitArrayInThreeEqualSumSubArray(arr));

    }
}
