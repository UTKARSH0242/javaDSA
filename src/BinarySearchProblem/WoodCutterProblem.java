package BinarySearchProblem;

public class WoodCutterProblem {
    static boolean isEnough(int [] tree , int k, int cut){
        int total = 0;
        for(int i = 0; i<tree.length; i++){
            if (tree[i] > cut){
                total += (tree[i]-cut);
            }

        }
        return total>= k;

    }
    static int woodCutterProblem(int [] tree, int k){
        int l= 0;
        int r = -1;
        for (int e: tree) {
            r = Math.max(r, e);
        }
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if (isEnough(tree,k,mid)){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a = {6,5,10,9,2,4,9,5};
        int k = 13;
        System.out.println(woodCutterProblem(a,k));

    }
}
