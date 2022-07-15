package BinarySearch;

public class RightOccurrence {
    static int rightOccurrence(int [] arr, int key){
        int left = 0;
        int right = arr.length-1;
        int ans = -1;
        while (left <= right){
            int mid = (left+right)/2;
            if (arr[mid] == key){
                ans = mid;
                left = mid+1;
            }else if (key< arr[mid]) right = mid - 1 ;
            else left = mid +1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,4,4,5,9,9,9,11,11,11,14};
        int key = 9;
        System.out.println(rightOccurrence(arr, key));

    }
}
