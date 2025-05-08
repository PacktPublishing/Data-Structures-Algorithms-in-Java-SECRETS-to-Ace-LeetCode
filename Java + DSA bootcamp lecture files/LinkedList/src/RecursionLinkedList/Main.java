package RecursionLinkedList;

public class Main {
    public static void main(String[] args) {
            RecursionLL list = new RecursionLL();
            list.insertFirst(9);
            list.insertFirst(7);
            list.insertFirst(5);
            list.insertFirst(3);
            list.display();

            list.insertRecursion(8,3);
            list.display();
    }
}
