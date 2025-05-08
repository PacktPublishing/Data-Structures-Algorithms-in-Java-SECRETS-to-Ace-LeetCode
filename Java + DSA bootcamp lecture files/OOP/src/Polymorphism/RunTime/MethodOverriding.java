package Polymorphism.RunTime;

import java.util.ArrayList;

public class MethodOverriding {


    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area();
    }
}

class Shapes{
    // to prevent your function from being overriden you can make use of "final" keyword and this process is also called as early binding
//   final void area(){
//        System.out.println("I am a shape. I don't have any specific formula for area :)");
//    }

    // * Static methods can be inherited but cannot be overridden because overrding depends on objects and static does not depend on any objects.
     void area(){
        System.out.println("I am a shape. I don't have any specific formula for area :)");
    }
}

class Triangle extends Shapes{
    @Override
    void area(){
        System.out.println("Area of a triangle is 1/2 * base * height");
    }
}
