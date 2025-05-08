package AbstractClasses;

public abstract class Parent {
    // You can create a static method inside an abstract class
//    BUT you cannot create abstract static methods
    static void msg(){
        System.out.println("Hello world");
    }
    int pocketMoney;
    // syntax for abstract methods: abstract void msg(){}
    abstract void career(String name);

    // You can always create constructor of an abstract class BUT you cannot call this constructor
//    public Parent(int pocketMoney) {
//        this.pocketMoney = pocketMoney;
//    }
}
