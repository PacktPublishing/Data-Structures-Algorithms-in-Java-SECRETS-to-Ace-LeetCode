import java.util.Arrays;
// https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,2,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i];
            // We added another check which is nums[i] < nums.length so that we can ignore or skip the N element
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // Find the missing number in array
        for (int index = 0; index < nums.length; index++){
            // Case 1: when the missing number lies in the range of [0,N]
            if (nums[index] != index){
                return index;
            }
        }
        // Case 2: When N is not present in the Array
        return nums.length;
    }
    static void swap(int[] arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
