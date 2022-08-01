package HashingPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Union {
    static void union(int []a, int [] b){
    Set<Integer> set = new HashSet<>();

        for(int x: a) {
        set.add(x);
    }
        for (int x: b) {
            set.add(x);

        }
        for (Integer integer : set) {
            System.out.print("[ " + integer + " ]");
        }

    }
    public static void main(String[] args) {
        int [] a = {5,10,15,5};
        int [] b = {10,15,4};
        union(a,b);

    }
}
