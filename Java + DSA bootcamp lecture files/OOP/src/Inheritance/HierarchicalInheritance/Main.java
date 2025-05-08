package Inheritance.HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        C1 obj1 = new C1();
        C2 obj2 = new C2();
        C3 obj3 = new C3();

        System.out.println("Parent Variable + child variable of child 1 = " + (obj1.parentVariable + obj1.childVariable));
        System.out.println("Parent Variable + child variable of child 2 = " + (obj2.parentVariable + obj2.childVariable));
        System.out.println("Parent Variable + child variable of child 3 = " + (obj3.parentVariable + obj3.childVariable));
    }
}
