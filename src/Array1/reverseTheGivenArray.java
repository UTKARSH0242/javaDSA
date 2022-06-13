package Array1;


public class reverseTheGivenArray {
    public static void main(String[] args) {
        int arr [] = {4,7,8,3,5};
        int newArray[] = new int[arr.length];
        int j = arr.length;
//        System.out.println(j);

        for (int i = 0; i <arr.length ; i++) {
            newArray[j-1] = arr[i];
            j--;

        }
        for (int e:newArray
             ) {
            System.out.print(e + " ");



        }

    }
}
