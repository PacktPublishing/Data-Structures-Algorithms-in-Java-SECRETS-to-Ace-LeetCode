import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        // Add the elements in my ArrayList
        list.add(15);
        list.add(5);
        list.add(51);
        list.add(1);
        list.add(150);
        list.add(105);

        // To update or modify the elements already present in ArrayList
        list.set(3, 100);

        // To remove the elements in ArrayList
        list.remove(3);

        // To check whether a particular value is present in the Array List or not
        System.out.println(list.contains(150));

        // To display the elements present in my ArrayList
        System.out.println(list);
    }
}
