package Array3;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayWithEqual0and1 {
    static int largestSubArrayWithEqual0and1(int[] a){
        int n = a.length;
        int[] prefixSum = new int[n];
        for (int i = 1; i <n ; i++) {
            prefixSum [i] = a[i] == 0 ?
                    prefixSum[i-1]-1: prefixSum[i-1]+1;

        }
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i <n ; i++) {
            if (map.containsKey(prefixSum[i])){
                ans = Math.max(ans, i- map.get(prefixSum[i]));
            }else{
                map.put(prefixSum[i], i );
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] a = {0,0,0,0,1,0,1,1,0,1};
        System.out.println(largestSubArrayWithEqual0and1(a));

    }
}
