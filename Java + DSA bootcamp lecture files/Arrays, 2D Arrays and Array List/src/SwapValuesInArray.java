import java.util.Arrays;

public class SwapValuesInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
//        int i1 = 0;
//        int i2 = 7;
        swap(arr,0,7);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
