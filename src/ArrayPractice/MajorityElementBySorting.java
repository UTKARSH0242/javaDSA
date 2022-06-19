package ArrayPractice;

import java.util.Arrays;

public class MajorityElementBySorting {
    static int majorityElement (int a []) {
        Arrays.sort(a);
        return a[a.length / 2];
    }

    public static void main(String[] args) {
        int a[] = {2,2,1,1,1,2,2} ;
        System.out.println(majorityElement(a));


    }
}
// by sorting technique
// time complexity O(n log n)