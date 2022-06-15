package Array3;

public class TrappingRainWater {
    static int trappingRainWater(int a[]){
        int ans = 0;
        int leftMax  = 0;
        int rightMax = 0;
        int l = 0 , r = a.length-1;

        while(l < r)
        {
            if (a[l] <= a[r]){
                if (a[l] > leftMax) leftMax = a[l];
                else ans += (leftMax - a[l]);
                l++;
            }
            else {
                if (a[r] > rightMax) rightMax = a[r];
                else  ans += (rightMax - a[r]);
                r--;
            }
        }
        return ans;

    }
    public static void main(String[] args) {

        int a []  = {3,5,1,4,2,6};
        int ans  = trappingRainWater(a);
        System.out.println(ans);


    }
}
