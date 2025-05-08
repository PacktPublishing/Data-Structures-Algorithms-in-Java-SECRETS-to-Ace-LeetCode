package RemoveDuplicates;

import RecursionLinkedList.RecursionLL;

public class Duplicates {
    private Node head;
    private Node tail;

    private int size;

    public Duplicates() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }



    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void removeDuplicates(){
        Node node = head;
        while (node.next != null){
            if (node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }

        }
        tail = node;
        tail.next = null;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
