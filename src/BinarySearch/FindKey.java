package BinarySearch;

public class FindKey {
    static int findKey(int [] arr , int key){
        int l = 0;
        int r = arr.length-1;
        while (l <= r){
            int mid = (l+r)/2;
            if(arr[mid] == key ) return mid;
            if (key> arr[mid]) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,9,11,14};
        int key = 10;
        System.out.println(findKey(arr, key));
    }
}
