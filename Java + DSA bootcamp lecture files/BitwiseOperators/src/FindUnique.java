public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2,4,6,6,8};
        System.out.println(uniqueNumber(arr));
    }
    static int uniqueNumber(int[] arr){
        int unique = 0;

        for (int i : arr){
            unique ^= i; // unique = unique ^ i
        }
        return unique;
    }
}
