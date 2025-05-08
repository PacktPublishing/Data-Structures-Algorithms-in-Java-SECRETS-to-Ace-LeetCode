import java.util.ArrayList;

public class FindMultipleOccurances {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        int target = 5;
        findIndexes(arr, target, 0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndexes(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (target == arr[index]) {
            list.add(index);
        }
            findIndexes(arr, target, index+1);

    }
}
