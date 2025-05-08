import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] arr = {50, 13, -2, 0, 1};
       bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        // runs the steps n-1 times
        for (int i = 0; i < arr.length; i++){
            // for each step, max element will come at the last index in the array
            for (int j = 1; j <= arr.length-i-1; j++){
                // swap if the element at 'j' index is smaller than previous element i.e 'j-1' element
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}