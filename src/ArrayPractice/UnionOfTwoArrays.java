package ArrayPractice;

public class UnionOfTwoArrays {
    static int countUnion(int [] arr1, int [] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int count = n+m;
        for (int k : arr1) {
            for (int j = 0; j < m; j++) {
                if (k == arr1[j]) {
                    count--;
                }

            }


        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,3,4,5};
        int [] arr2 = {1,1,1,1,2,3,};

        System.out.println(countUnion(arr1,arr2));




    }
}
