package BinarySearch;

public class SearchInSortedAndRotatedArray {
    static int searchInSortedAndRotatedArray(int [] arr, int key){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid] == key ) return mid;
            if (arr[left] <= arr[mid]){ // left part sorted
                if (key>= arr[left] && key< arr[mid]){ // left side present
                    right = mid-1;
                }else { // right side present
                    left = mid +1;
                }
            }else{ // right part sorted
                if (key>arr[mid] && key<= arr[right]){ //right side present
                    left =  mid+1;
                }else{ // left side present
                    right = mid-1;
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
