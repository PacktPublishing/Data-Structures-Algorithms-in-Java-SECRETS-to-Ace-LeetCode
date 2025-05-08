import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] firstHalf = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] secondHalf = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(firstHalf, secondHalf);
    }
    static int[] merge(int[] firstHalf, int[] secondHalf){
        int[] combined = new int[firstHalf.length + secondHalf.length];

        int i=0, j=0, k=0;

        while (i < firstHalf.length && j < secondHalf.length){
            if (firstHalf[i] < secondHalf[j]){
                combined[k] = firstHalf[i];
                i++;
            } else{
                combined[k] = secondHalf[j];
                j++;
            }
            k++;
        }
        while (i < firstHalf.length){
            combined[k] = firstHalf[i];
            i++;
            k++;
        }
        while (j < secondHalf.length){
            combined[k] = secondHalf[j];
            j++;
            k++;
        }
        return combined;
    }

}
