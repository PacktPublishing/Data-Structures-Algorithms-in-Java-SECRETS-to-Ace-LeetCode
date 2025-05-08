package Interfaces;

// Whenever a class is inheriting from an interface use "implements" keyword
public class Daughter implements Father, Mother{

    @Override
    public void display() {
        System.out.println("God bless you");
    }

    @Override
    public void msg() {
        System.out.println("n value is 0 by default");
    }
}
