public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("",3,3);
//        diagonalPath("",3,3);
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        pathWithObstacles("", maze,0,0);
    }

    static int count(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }
        int down = count(row-1, col);
        int right = count(row, col-1);
        return down + right;
    }

    static void path(String ans, int row, int col){
        if (row == 1 || col == 1){
            System.out.println(ans);
            return;
        }
        if (row > 1){
            path(ans + "D", row-1, col);
        }
        if (col > 1){
            path(ans + "R", row, col-1);
        }
    }

    static void diagonalPath(String ans, int row, int col){
        if (row == 1 || col == 1){
            System.out.println(ans);
            return;
        }
        if (row > 1){
            diagonalPath(ans + "V", row-1, col);
        }
        if (col > 1){
            diagonalPath(ans + "H", row, col-1);
        }
        if (row > 1 && col > 1){
            diagonalPath(ans + "D", row-1, col-1);
        }
    }

    static void pathWithObstacles(String ans, boolean[][] arr, int r, int c){
        if (r == arr.length-1 && c == arr[0].length-1){
            System.out.println(ans);
            return;
        }
        if (!arr[r][c]){
            return;
        }
        if (r < arr.length-1){
            pathWithObstacles(ans + "D", arr, r+1, c);
        }
        if (c < arr[0].length-1){
            pathWithObstacles(ans + "R", arr, r, c+1);
        }
    }
}
