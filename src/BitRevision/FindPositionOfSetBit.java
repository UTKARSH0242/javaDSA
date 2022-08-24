package BitRevision;



public class FindPositionOfSetBit {
    static int findPositonOfSetBit(int n ){
        if (n == 0) return -1;
        if ((n&n-1)==0) {
            return (int) (Math.log(n)+1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int n ;
        System.out.println(findPositonOfSetBit(2));
    }

}
