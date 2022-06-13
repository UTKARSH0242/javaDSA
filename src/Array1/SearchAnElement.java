package Array1;

public class SearchAnElement {
    public static void main(String[] args) {

        int[] a = {2,1,4,6,5};
        int key = 6;
        int result = -1;

        // search for key

        for (int i = 0; i <a.length ; i++) {
            if(a[i] == key){
                result = i;
                break;
            }

        }
        if (result == -1){
            System.out.println("Not Found");

        }else {
            System.out.println("Key is present at " + result);
        }
    }
}

//time complexity = O(n)
