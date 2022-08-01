package BinarySearchProblem;

public class BookAllocationProblem {
    static boolean isSafe(int []arr, int k , int page){
        int student  = 1;
        int cur = arr[0];
        for(int i = 1; i<arr.length; i++){
            if (cur> page) return false;
            cur += arr[i];
            if (cur> page){
                student++;
                cur =arr[i];

            }
        }
        if (cur> page) return false;
        return student <= k;

    }
    static int allocateBook(int [] arr , int k){
        if (arr.length < k) return -1;
        int min =0, max = 0;
        for(int e: arr) max+=e;
        while (min<=max){
            int mid = (min+max)/2;
            if (isSafe(arr,k,mid)){
                max = mid-1;
            }else{
                min = mid +1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        int k = 2;
        System.out.println(allocateBook(arr, k));

    }
}
