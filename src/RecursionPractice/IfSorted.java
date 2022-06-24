package RecursionPractice;

public class IfSorted {
    public static boolean ifSorted(int [] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return ifSorted(arr, idx + 1);

        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ifSorted(arr,0);
        System.out.println(ifSorted(arr,0));


    }
}
