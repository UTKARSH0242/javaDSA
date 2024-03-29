package HashingPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Intersection {
    static int[] intersection(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int e : a) set.add(e);
        Set<Integer> set2 = new HashSet<>();
        for (int e : b) set2.add(e);

        set.retainAll(set2);
        int[] ans = new int[set.size()];
        int indx = 0;
        for (int x : set) ans[indx++] = x;
        return ans;
}
    public static void main(String[] args) {


        int [] num1 = {1,2,2,1};
        int [] num2 = {2,2};
        System.out.println(Arrays.toString(intersection(num1, num2)));

     }
}

