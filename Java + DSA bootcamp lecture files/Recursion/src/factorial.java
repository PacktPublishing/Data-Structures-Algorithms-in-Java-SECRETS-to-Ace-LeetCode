public class factorial {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
    // *Important* whenever the recursive function has some return type make sure that recursive call preceed with 'return'
    static int fact(int n){
        if (n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }

    // Find the sum of first 5 numbers
    static int sum(int n){
        if (n <= 1){
            return 1;
        }
        return n + sum(n-1);
    }

}
