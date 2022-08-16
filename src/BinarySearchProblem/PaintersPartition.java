package BinarySearchProblem;

public class PaintersPartition {
    static boolean isSafe(int[] arr, int k, long board) {
        int painter = 1;
        int cur = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (cur > board) return false;
            cur += arr[i];
            if (cur > board) {
                painter++;
                cur = arr[i];
            }
        }
        if (cur > board) return false;
        return painter <= k;
    }

    static long minTime(int[] arr, int n, int k) {
        //code here
        if (arr.length < k) return -1;
        long min = 0;
        long max = 0;
        for (int e : arr) max += e;
        while (min <= max) {
            long mid = (min + max) / 2;
            if (isSafe(arr, k, mid)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {5,10,30,20,15};
        int k = 3;
        System.out.println(minTime(arr,5,3));

    }
}
