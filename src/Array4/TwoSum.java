package Array4;

public class TwoSum {
    public static boolean twoSum(int a[], int sum){
        int l = 0;
        int r = a.length-1;


        while (l < r){

            int curSum = a[l] + a[r];
            if (curSum > sum){
                r--;
            } else if (curSum<sum) {
                l++;

            }else {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int a [] = {1,2,7,8,10,12};
        int sum = 10;
        System.out.println(twoSum(a,10));
    }
}
