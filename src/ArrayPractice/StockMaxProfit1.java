package ArrayPractice;

public class StockMaxProfit1 {
    static int StockMaxProfit(int[] a){
        int maxProfit = 0;
        int minSoFar = a[0];
        for (int j : a) {
            minSoFar = Math.min(minSoFar, j);
            int profit = j - minSoFar;
            maxProfit = Math.max(maxProfit, profit);


        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int ans = StockMaxProfit(a);
        System.out.println(ans);

    }
}
