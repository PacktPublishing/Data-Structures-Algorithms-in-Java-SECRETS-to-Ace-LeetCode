package AccessSpecifier.otherPkg;

import AccessSpecifier.A;

public class Main {
    public static void main(String[] args) {
//        A a = new A(10,"Jack");
//        int n = a.num();
    }
}

class P1 extends A{
    public static void main(String[] args) {
        P1 obj1 = new P1();
        System.out.println(obj1.num);


    }
}
