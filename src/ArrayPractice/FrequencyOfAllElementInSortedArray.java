package ArrayPractice;

public class FrequencyOfAllElementInSortedArray {
    static void frequencyOfElement(int [] arr){
        int freq = 1;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] == arr[i-1]){
                freq++;
            }else {
                System.out.println(arr[i-1] + " : " + freq);
                freq = 1;
            }

        }
        System.out.println(arr[arr.length - 1] + " : " + freq);

    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,3,3,5,5,8,8,8,9,9,10};
        frequencyOfElement(arr);

    }
}
