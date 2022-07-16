package BinarySearch;

public class IndexOfFirst1 {
    static int indexOfFirst1(int [] arr){
        int left = 0;
        int right = arr.length-1;

        while (left<= right){
            int mid = left +(right-left)/2;
            if (arr[mid] == 1 && (mid == 0 || arr[mid-1] == 0))
                return mid;

            else if(arr[mid] == 1)
                right = mid-1;
            else
                left = mid +1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {0,0,0,0,0,0,1,1,1,1};
        System.out.println(indexOfFirst1(arr));

    }
}
