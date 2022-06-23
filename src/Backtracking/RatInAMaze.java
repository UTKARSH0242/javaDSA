package Backtracking;

public class RatInAMaze {
    public static boolean ratInAMaze(int a[][] , boolean vis[][],int i , int j){
//        Base Conditions
        if (i >= a.length || j >= a.length || a[i][j] == 0 || vis[i][j]){
            return false;
        }
//        Base condition successfully reached
        if (i == a.length-1 && j ==a.length-1) return true;
//        Mark this cell as visited

        vis[i][j] = true;
//        ratInAMaze(a,vis, i+1, j);
//        Check if a path is possible from down
        if (ratInAMaze(a,vis,i+1,j)) return true;
//        Check if path is possible from right
        if (ratInAMaze(a,vis,i, j+1)) return true;
//        Mark this cell as unvisited and Backtrack
        vis[i][j] = false;
//        Backtrack
        return false;


    }
    public static void main(String[] args) {
        int a[][] = {
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 0},
                {1, 1, 1, 1},

        };
        boolean vis [][] = new boolean[a.length][a.length];
        boolean isPathPossible = ratInAMaze(a,vis,0,0);
        System.out.println(isPathPossible);
    }
}
