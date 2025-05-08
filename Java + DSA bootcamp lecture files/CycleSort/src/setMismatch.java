public class setMismatch {
    // https://leetcode.com/problems/set-mismatch/
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return new int[] {nums[index], index + 1};
            }
        }
        return new int[] {-1,-1}; // If no duplicate or missing number found
    }
    static void swap(int[] arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
