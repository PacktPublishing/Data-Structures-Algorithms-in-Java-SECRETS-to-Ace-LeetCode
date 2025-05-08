public class PalindromeOfANumber {
    public static void main(String[] args) {
        System.out.println(palindrome(123));
    }
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
    static boolean palindrome(int n){
        return n == fun2(n);
    }

}
