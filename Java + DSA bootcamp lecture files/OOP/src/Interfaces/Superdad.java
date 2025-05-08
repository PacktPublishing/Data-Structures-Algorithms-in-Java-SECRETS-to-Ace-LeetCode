package Interfaces;

public class Superdad implements Father{
    @Override
    public void display() {
        System.out.println("Wish you all the best :)");
    }

    @Override
    public void msg() {
        System.out.println("n = 15");
    }
}
