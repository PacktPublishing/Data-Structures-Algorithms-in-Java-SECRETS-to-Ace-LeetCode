public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {16, 14, 12, 10, 8, 6, 4, 2};
        int target =  8;

        int ans = orderAgnostic(arr,target);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean checkAscending = arr[start] < arr[end];

//        if (arr[start] < arr[end]){
//            checkAscending = true;
//        }else{
//            checkAscending = false;
//        }

        while (start <= end){
//            int mid = (start + end) / 2; // sometimes the mid element value might exceed the range of Int datatype
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (checkAscending){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
