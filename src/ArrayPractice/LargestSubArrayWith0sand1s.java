package ArrayPractice;

public class LargestSubArrayWith0sand1s {
    public static int  largestSubArrayWithEqual0sAnd1s(int [] arr){
        int maxlength = 0;
        for (int i = 0; i < arr.length; i++){
            int zeros = 0, ones = 0;
            for (int j = i; j < arr.length; j ++){
                if (arr[j] == 0){
                    zeros++;
                }else {
                    ones++;
                }
                if (zeros==ones){
                    maxlength = Math.max(maxlength,j - i+1);
                }
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        int []arr = {0,1};
        System.out.println(largestSubArrayWithEqual0sAnd1s(arr));

    }
}
// Brute Force Technique

