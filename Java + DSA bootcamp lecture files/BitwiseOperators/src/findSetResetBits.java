public class findSetResetBits {
    public static void main(String[] args) {
        System.out.println(reset(12,3));
    }

    static int find(int n, int i){
        return (n & (1 << (i-1)));
    }

    static int set(int n, int i){
        return (n | (1 << (i-1)));
    }

    static int reset(int n, int i){
        return (n & (~(1 << (i-1))));
    }
}
