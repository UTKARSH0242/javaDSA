package Array2;

public class LeaderInAnArray {
    static void leaderInAnArray(int a[]){
        int largest = Integer.MIN_VALUE;
        int b [] = new int[a.length];
        int j = 0;
        for (int i = a.length-1; i>=0; i--) {
            if (a[i] > largest){
                largest = a[i];
                System.out.print(a[i]+ " ");
                b[j++] = a[i];
            }

        }
        for (j=j-1; j>=0; j--){
            System.out.print(b[j]+ " ");

        }
    }
    public static void main(String[] args) {
        int[] a  = {2 ,7,6,4,1,3};
        leaderInAnArray(a);

    }
}
