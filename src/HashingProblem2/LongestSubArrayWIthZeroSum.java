package HashingProblem2;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWIthZeroSum {
    static int longestSubArrayWIthZeroSum(int [] arr){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int ans = 0;
        int cumSum= 0;
        for (int i = 0; i < arr.length; i++) {
            int e = arr[i];
            cumSum += e;
            if (map.containsKey(cumSum)) {
                int prev = map.get(cumSum);
                ans = Math.max(ans, i-prev);

            } else {
                map.put(cumSum, i);

            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,5,-3,-4,3,4,1};
        System.out.println(longestSubArrayWIthZeroSum(arr));

    }
}
