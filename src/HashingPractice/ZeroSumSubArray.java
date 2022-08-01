package HashingPractice;

import java.util.HashMap;

public class ZeroSumSubArray {
    static long zeroSumSubArray(long[] arr, long n ){
        long sum = 0;
        long count = 0;

        HashMap<Long, Long> map = new HashMap<>();
        for (int i =0; i<n; i++){
            sum += arr[i];
            if (sum ==0){
                count++;
            }
            if (map.containsKey(sum)){
                count += map.get(sum);
            }
            if (map.containsKey(sum)){
                long k = map.get(sum);
                k++;
                map.put(sum,k);
            }
            else map.put(sum,1L);
        }
        return count;
    }
    public static void main(String[] args) {
        long [] arr ={15,-2,2,-8,1,7,10,23};

        long n = arr.length;
        System.out.println(zeroSumSubArray(arr,n));
//        zeroSumSubArray(arr,n);
    }

}
