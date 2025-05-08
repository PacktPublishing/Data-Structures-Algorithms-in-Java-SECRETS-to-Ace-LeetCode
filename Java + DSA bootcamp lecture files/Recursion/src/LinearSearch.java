public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        System.out.println(findIndex(arr,target,0));
    }

    // This particular function will only return true if target element exists in arr and return false if target element doesn't exist in the arr
    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target  || find(arr, target, index+1);
    }

    // This function will return the index value where my target element is inside the array
    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (target == arr[index]) {
            return index;
        } else{
            return findIndex(arr, target, index+1);
        }
    }
}
