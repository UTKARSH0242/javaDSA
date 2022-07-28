package Hashing;

import java.util.HashSet;
import java.util.Set;

public class DistinctElement {
    static int CountDistinctElement(int[] a){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int e = a[i];
            set.add(e);

        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        int[] a ={1,1,2,3,3,4,4};
        System.out.println(CountDistinctElement(a ));

    }
}
