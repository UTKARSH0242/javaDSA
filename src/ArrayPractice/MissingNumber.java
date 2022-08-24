package ArrayPractice;

import static javax.swing.text.html.HTML.Attribute.N;

public class MissingNumber {
    static int missingNumber(int [] array,int N) {
        int i, total;
        total = (N * (N + 1)) / 2;
        for (int j = 0; j < N - 1; j++) {
            total -= array[j];

        }
        return total;
    }

    public static void main(String[] args) {
        int [] array ={1,2,3,5};

        System.out.println(missingNumber(array,4));


    }
}
