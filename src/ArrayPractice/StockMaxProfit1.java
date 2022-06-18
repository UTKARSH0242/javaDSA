package ArrayPractice;

public class StockMaxProfit1 {
    static int StockMaxProfit(int a[]){
        int maxProfit = 0;
        int minSoFar = a[0];
        for (int i = 0; i < a.length; i++) {
            minSoFar = Math.min(minSoFar, a[i]);
            int profit = a[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);


        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int a [] = {7,1,5,3,6,4};
        int ans = StockMaxProfit(a);
        System.out.println(ans);

    }
}
