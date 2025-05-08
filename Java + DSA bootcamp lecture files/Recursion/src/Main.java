public class Main {
    public static void main(String[] args) {
        // Question says that print hello world text 5 times

        // Question 2: print numbers 1 2 3 4 5 using recursive functions
        fun(1);
    }
//    static void fun1(int n){
//        System.out.println(n);
//        fun2(2);
//    }
//
//    static void fun2(int n){
//        System.out.println(n);
//        fun3(3);
//    }
//
//    static void fun3(int n){
//        System.out.println(n);
//        fun4(4);
//    }
//    static void fun4(int n){
//        System.out.println(n);
//        fun5(5);
//    }
//    static void fun5(int n){
//        System.out.println(n);
//    }

    static void fun(int n){
        if (n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun(n+1);
    }
}