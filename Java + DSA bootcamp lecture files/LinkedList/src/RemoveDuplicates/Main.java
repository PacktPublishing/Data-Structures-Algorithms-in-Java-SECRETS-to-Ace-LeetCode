package RemoveDuplicates;

public class Main {
    public static void main(String[] args) {
        Duplicates list = new Duplicates();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);
        list.display();

        list.removeDuplicates();
        list.display();
    }
}
