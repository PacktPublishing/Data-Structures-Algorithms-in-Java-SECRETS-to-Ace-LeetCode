import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // Declaring 2D Array
        Scanner in = new Scanner(System.in);
        int[][] arr2D = new int[2][2];

        // Dynamic Array
        int[][] dynamicArray = {
                {1,2,3},
                {5,6},
                {4}
        };

        // Input from the user
//        for (int row = 0; row < arr2D.length; row++) {
//            for (int col = 0; col < arr2D[row].length; col++) {
//                    arr2D[row][col] = in.nextInt();
//            }
//        }

        // Output of values in my 2D Array
//        for (int row = 0; row < arr2D.length; row++) {
//            for (int col = 0; col < arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col] + " ");
//            }
//            System.out.println();
//        }

       for (int row = 0; row < dynamicArray.length; row++) {
            for (int col = 0; col < dynamicArray[row].length; col++) {
                System.out.print(dynamicArray[row][col] + " ");
            }
            System.out.println();
        }


    }
}
