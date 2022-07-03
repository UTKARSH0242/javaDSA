package Array1;


public class reverseTheGivenArray {
    public static void main(String[] args) {
        int[] arr = {4,7,8,3,5};
        int[] newArray = new int[arr.length];
        int j = arr.length;
//        System.out.println(j);

        for (int k : arr) {
            newArray[j - 1] = k;
            j--;

        }
        for (int e:newArray
             ) {
            System.out.print(e + " ");



        }

    }
}
