package BinarySearch;

public class NextGreaterElement {
    static void nextGreaterElement(int [] arr) {
        int n = arr.length;

        int i;
        for (i = 0; i < n; i++) {
            int NGE = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    NGE = arr[j];
                    break;

                }

            }
            System.out.println(arr[i]+ "--->"+ NGE);

        }

    }
    public static void main(String[] args) {
        int [] arr = {11,13,21,3};
        nextGreaterElement(arr);
//        System.out.println(nextGreaterElement(arr));
    }

}
