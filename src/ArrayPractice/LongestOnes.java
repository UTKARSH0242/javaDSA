package ArrayPractice;

public class LongestOnes {
    static int longestOnes(int[] a){
        int curCount = 0;
        int maxCount = 0;
        for (int e : a) {
            if (e == 0) {
                maxCount = Math.max(maxCount, curCount);
                curCount = 0;
            } else {
                curCount++;
            }

        }
        maxCount = Math.max(maxCount, curCount);
        return maxCount;
    }
    public static void main(String[] args) {
        int[] a = { 1,2,3,1,2,2,2,2,3,4};
        System.out.println(longestOnes(a));


    }
}
