import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,10,15,20},
                {22,24,26,28},
                {30,40,50,60}
        };
        System.out.println(Arrays.toString(searchIn2DArray(matrix, 36)));
    }
    static int[] searchIn2DArray(int[][] matrix, int target){
        int r = 0; // Lower bound
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target)
            {
                return new int[] {r,c};
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] {-1, -1};
    }
}