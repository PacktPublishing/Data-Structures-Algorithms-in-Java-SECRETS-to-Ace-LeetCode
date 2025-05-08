public class PrintNos {
    public static void main(String[] args) {
        fun2(5);
    }
    // Prints nos from N to 1 (5 4 3 2 1)
    static void fun(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
//        fun(n-1);
        //fun(n--); // n-- means that value of n is printed then in the next iteration n value is decremented by 1
        fun(--n); // --n means that value of n is first decremented by 1 then the value of n is printed

    }
    // Prints nos from 1 to N (1 2 3 4 5)
    static void fun2(int n) {
        if (n == 0){
            return;
        }

//        fun(n-1);
        //fun(n--); // n-- means that value of n is printed then in the next iteration n value is decremented by 1
        fun2(--n); // --n means that value of n is first decremented by 1 then the value of n is printed
        System.out.println(n);
    }
}
