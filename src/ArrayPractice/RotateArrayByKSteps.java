package ArrayPractice;

public class RotateArrayByKSteps {
    public static void main(String[] args) {
            int [] arr = {1, 2, 3, 4, 5};
            int n = 3;
        for (int i = 0; i <n ; i++) {

            int last = arr[arr.length-1];
            for (int j = arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;

        }
        System.out.println();
        System.out.println("After rotation");
        for (int j : arr) {
            System.out.print(j + " ");

        }

    }
}
