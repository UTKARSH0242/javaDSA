package BinarySearchProblem;

public class AggressiveCows {
    static boolean canAccomodate(int[] a, int k, int distance){
        int prev = a[0];
        int cows = 1;
        for (int i = 1; i< a.length; i++){
            if (a[i]-prev >=distance){
                cows++;
                prev = a[i];
            }
        }
        return cows>= k;
    }
    static int aggressiveCows(int [] a, int k){
        if (a.length < k ) return -1;
        int low = 1;
        int right = a[a.length-1];
        int ans = -1;
        while (low<= right){
            int mid = (low+right)/2;
            if (canAccomodate(a,k,mid)){
                ans = mid;
                low = mid+1;

            }else{
                right = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a = {1,2,4,8,9};
        int k = 3;
        System.out.println(aggressiveCows(a,k));

    }
}
