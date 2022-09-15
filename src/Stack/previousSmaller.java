package Stack;

import java.util.ArrayDeque;

public class previousSmaller {
    static int[] previousSmaller(int [] arr){
        int [] ans = new int [arr.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        for (int e: arr){
            while(!stack.isEmpty() && stack.peek() >= e){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] = -1;
            }else {
                ans[i] = stack.peek();
            }
            stack.push(e);
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {5,1,2,3,9,6,1,4,3};
        int[] ans = previousSmaller(arr);
        for (int i= 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
            System.out.print(ans[i] +" ");
            System.out.println();


        }

    }
}
