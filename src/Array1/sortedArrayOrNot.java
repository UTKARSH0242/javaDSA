package Array1;

public class sortedArrayOrNot {
    public static boolean sortedOrNot( int a[]) {

        if (a.length == 0 || a.length == 1)
            return true;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;

            }
        }
        return false;
    }

            public static void main (String[] args){
                int a[] = {3, 8, 4, 5, 0, 1, 7};
                if (sortedOrNot(a) != false) {
                    System.out.println("Yes Array is Sorted");
                } else System.out.println("Array is not Sorted");

            }

        }
