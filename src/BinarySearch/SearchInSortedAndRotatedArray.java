package BinarySearch;

public class SearchInSortedAndRotatedArray {
    static int searchInSortedAndRotatedArray(int [] arr, int key){
        int l = 0;
        int r = arr.length-1;
        while (l<=r){
            int mid = l + (r-l)/2;
            if (arr[mid] == key ) return mid;
            if (arr[l] <= arr[mid]){ // left part sorted
                if (key>= arr[l] && key< arr[mid]){ // left side present
                    r = mid-1;
                }else { // right side present
                    l = mid +1;
                }
            }else{ // right part sorted
                if (key>arr[mid] && key<= arr[r]){ //right side present
                    l =  mid+1;
                }else{ // left side present
                    r = mid-1;
                }


            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,7,8,9,1,2,3};
        int key = 3;
        System.out.println(searchInSortedAndRotatedArray(arr, key));

    }
}
