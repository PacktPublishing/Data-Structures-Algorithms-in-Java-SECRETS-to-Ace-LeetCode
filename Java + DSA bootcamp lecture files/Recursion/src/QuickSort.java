import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,-7,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end){
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if (start <= end){
                // swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        }
        quickSort(arr,low,end-1);
        quickSort(arr,start+1,high);
    }
}
