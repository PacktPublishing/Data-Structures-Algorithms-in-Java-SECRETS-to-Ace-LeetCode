import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i=0; i <= arr.length-1; i++){
            // find the max element in remaining array and swap with element at correct index

            int last = arr.length-i-1;
            int maxIndex = fetchMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int fetchMaxIndex(int[] arr, int start, int last) {
        int max = start;

        for (int i = start; i<=last; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}