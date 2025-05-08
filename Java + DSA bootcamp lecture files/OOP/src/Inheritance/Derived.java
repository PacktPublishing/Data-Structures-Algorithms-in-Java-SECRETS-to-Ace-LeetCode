package Inheritance;

public class Derived extends Base {
    String hairColor = "Blonde";

    public static void main(String[] args) {
        Derived obj = new Derived();
        System.out.println(obj.eyeColor);
        System.out.println(obj.hairColor);
    }
}
