public class ReverseNumber {
    public static void main(String[] args) {
//        fun(12345);
//        System.out.println(sum);
        System.out.println(fun2(12345));
    }

    // Method 1
    static int sum = 0;
    static void fun(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        fun(n/10);
    }

    // Method 2
    static int fun2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return lifeline(n, digits);
    }
    static int lifeline(int n, int digits){
        if (n % 10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1)) + lifeline(n/10, digits-1);
    }
}
