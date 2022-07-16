package BinarySearch2;

public class SearchInInfiniteSortedArray {

    static int findKey(int [] arr , int key, int l , int r){
//        int l = 0;
//        int r = arr.length-1;
        while (l <= r){
            int mid = (l+r)/2;
            if(arr[mid] == key ) return mid;
            if (key> arr[mid]) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
    static int searchInInfiniteSortedArray(int [] arr , int key){
        if (arr.length == 0) return -1;
        if (arr[0] == key) return 0;
        int indx = 1;
        while (arr[indx] <= key){
            indx = indx*2;
        }
        return findKey(arr, key, indx/2, indx);
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,6,7,8,11,13,16,17,20,24,27,30,};
        int key = 8;
        System.out.println(searchInInfiniteSortedArray(arr, key));


    }
}
