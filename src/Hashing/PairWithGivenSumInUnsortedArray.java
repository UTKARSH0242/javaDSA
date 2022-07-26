package Hashing;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSumInUnsortedArray {
    static class Pair{
        int a , b;
        Pair(int a , int b){
            this.a = a;
            this.b = b;
        }
    }
    static Object pairWithGivenSumInUnsortedArray(int [] a, int sum){
        Set<Integer> set = new HashSet<>();
        for (int e : a) {
            int comp = sum-e;
            if (set.contains(comp)) return e;
            set.add(e);

        }
        return null;
    }
    public static void main(String[] args) {
        int a [] = {1,2,1,3,2};
        int sum = 5;
        System.out.println(pairWithGivenSumInUnsortedArray(a, sum));

    }
}
