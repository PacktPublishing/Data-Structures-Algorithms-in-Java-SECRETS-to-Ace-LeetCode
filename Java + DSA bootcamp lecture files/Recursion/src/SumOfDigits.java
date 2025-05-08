public class SumOfDigits {
    public static void main(String[] args) {
        int ans = fun(1432);
        System.out.println(ans);
    }
    static int fun(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + fun(n/10);
    }

    // If you have to find product of digits
    static int fun2(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) * fun(n/10);
    }
}
