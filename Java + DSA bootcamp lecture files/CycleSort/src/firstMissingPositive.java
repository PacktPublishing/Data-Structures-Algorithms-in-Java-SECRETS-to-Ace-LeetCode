public class firstMissingPositive {
    // https://leetcode.com/problems/first-missing-positive/
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // search for missing number
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return index + 1;
            }
        }
        // Case 2: when missing element is N
        return nums.length + 1;
    }
    static void swap(int[] arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
