public class FirstandLastOccurance {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // check for 1st occurance
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }
    static int search(int[] nums, int target, boolean firstOccurance){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
//            int mid = (start + end) / 2; // sometimes the mid element value might exceed the range of Int datatype
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                // potential ans found
                ans = mid;
                if(firstOccurance){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
