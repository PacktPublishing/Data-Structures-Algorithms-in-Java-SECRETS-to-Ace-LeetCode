public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 14, 16, 18};
        int target =  150;

        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // what if the target element is greater than greatest number in the array? In that case we return -1
        if (target > arr[arr.length - 1]){
            return -1;
        }

        while (start <= end){
//            int mid = (start + end) / 2; // sometimes the mid element value might exceed the range of Int datatype
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
