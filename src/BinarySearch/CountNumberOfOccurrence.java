package BinarySearch;

import static BinarySearch.LeftOccurrence.leftOccurrence;
import static BinarySearch.RightOccurrence.rightOccurrence;

public class CountNumberOfOccurrence {
    static int countNumberOfOccurrence(int [] arr, int key ){
        return rightOccurrence(arr,key) - leftOccurrence(arr,key)+1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,4,4,5,9,9,9,11,11,14};
        int key = 11;
        System.out.println(countNumberOfOccurrence(arr, key));
    }
}
