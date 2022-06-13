package Array1;

public class largestElement {
    public static int maxOf(int a[]){
        if (a.length == 0) return -1;
        int maxIndex = 0;
        for (int i = 1; i <a.length ; i++) {
            if (a[i]> a[maxIndex]){
                maxIndex = i;

            }

        }
        return maxIndex;
    }
    public static void main(String[] args) {
        int[] a = {2,1,4,6,5};
//        int key = 6;
        int index = maxOf(a);
        System.out.println(a[index]);

    }
}

// Time complexity = Θ(n)

