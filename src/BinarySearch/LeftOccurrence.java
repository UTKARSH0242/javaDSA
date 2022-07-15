package BinarySearch;

public class LeftOccurrence {
    static int leftOccurrence(int [] arr, int key) {
        int l = 0;
        int r = arr.length - 1;
        int leftOcc = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                leftOcc = mid;
                r = mid - 1;
            }
            if (key > arr[mid]) l = mid + 1;
            else r = mid - 1;
        }
        return leftOcc;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,4,4,5,9,9,9,11,11,11,14};
        int key = 9;
            System.out.println(leftOccurrence(arr, key));
    }
}
