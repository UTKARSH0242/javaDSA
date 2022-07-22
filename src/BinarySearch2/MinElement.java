package BinarySearch2;

public class MinElement {
    static int minElement(int [] arr){
        int low = 0;
       int  high = arr.length-1;

        while(low < high){
            int mid = (low+high)/2;
            if (arr[mid] == arr[high]) high--;
            if(arr[mid] > arr[high]){
//                ans = arr[low];
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return arr[high];
    }
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9,1};
        System.out.println(minElement(arr));

    }
}
