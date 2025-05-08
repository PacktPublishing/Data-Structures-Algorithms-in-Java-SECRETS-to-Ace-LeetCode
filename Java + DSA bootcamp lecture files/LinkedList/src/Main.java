import RecursionLinkedList.RecursionLL;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insertFirst(9);
//        list.insertFirst(7);
//        list.insertFirst(5);
//        list.insertFirst(3);
//        list.insertLast(11);
//        list.insert(8,3);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.delete(1);
//        list.display();
//
//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(9);
//        list.insertFirst(7);
//        list.insertFirst(5);
//        list.insertFirst(3);
////        list.display();
//        list.insertLast(11);
//        list.insert(7,8);
//        list.display();

//        CircularLinkedList list = new CircularLinkedList();
//        list.insert(3);
//        list.insert(5);
//        list.insert(7);
//        list.insert(9);
//        list.display();
//
//        list.delete(3);
//        list.display();
//        list.delete(7);
//        list.display();

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