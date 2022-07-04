package ArrayPractice;

public class SubArraySumEqualToK {
    public static void subArraySumEqualToK(int [] arr , int k ){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i <n ; i++) {
            int sum = 0;
            for (int j = i; j <n ; j++) {
                sum += arr[j];
                if (sum == k)  count++;

            }

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1};
        int k = 2;
//        System.out.println(subArraySumEqualToK(arr, 2));
        subArraySumEqualToK(arr, 2);
        
    }
}
// time complexity is O(n^2)
// Brute force Solution