package ArrayPractice;

public class LongestLengthOfConsecutive1s {
    static int longestLengthOf1(int [] arr){
        int freqOf1 = 0;
        int maxCountSoFar = 0;
        for (int j : arr) {
            if (j == 1) {
                freqOf1++;
                if (freqOf1 > maxCountSoFar) {
                    maxCountSoFar = freqOf1;
                }
            } else {
                freqOf1 = 0;
            }

        }
        return maxCountSoFar;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,0,0,1,1,1,1,0,1};
        System.out.println(longestLengthOf1(arr));
    }
}
