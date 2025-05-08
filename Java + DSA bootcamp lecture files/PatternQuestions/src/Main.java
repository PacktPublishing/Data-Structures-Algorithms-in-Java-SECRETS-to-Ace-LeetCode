public class Main {
    public static void main(String[] args) {
        pattern5(4);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++){
            // for every row tun the column
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <=n; col++){
                System.out.print("*");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <=n-row+1; col++){
                System.out.print("*");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++){
            // for every row tun the column
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++){
            // for every row tun the column
            int colsInEveryRow = row > n ? 2*n-row : row;
            for (int col = 0; col < colsInEveryRow; col++){
                System.out.print("*");
            }
            // when 1 row is printed we need to add a new line
            System.out.println();
        }
    }
}