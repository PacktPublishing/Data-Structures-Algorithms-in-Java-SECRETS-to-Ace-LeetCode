package Polymorphism.CompileTime;

public class MethodOverloading {
    void show(int num1){
        System.out.println("Number 1 is: " + num1);
    }

    void show(int num1, int num2){
        System.out.println("Number 1 is: " + num1 + " number 2 is: " + num2);
    }

    void show(float num1){
        System.out.println("Number 1 is: " + num1);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.show(5,10);
        obj.show(5);
        obj.show(5.5f);
    }
}
