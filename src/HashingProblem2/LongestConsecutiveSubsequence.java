package HashingProblem2;

//import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    static int longestConsecutiveSubsequence(int [] arr){
        Set<Integer> set = new HashSet<>();
        for (int e: arr) set.add(e);
        int ans = 0;
            for (int e: set) {
                if (!set.contains(e-1)){
                    int len = 1;
                    while(set.contains(++e)){
                        len++;
                    }
                    ans = Math.max(ans, len);
                }

            }
            return ans;

        }

    public static void main(String[] args) {
        int [] arr = {2,1,9,3,5,4,8,7,2,1,3};
        System.out.println(longestConsecutiveSubsequence(arr));

    }
}
