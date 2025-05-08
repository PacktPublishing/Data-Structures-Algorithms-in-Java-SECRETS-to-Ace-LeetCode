package RecursionLinkedList;

public class RecursionLL {

    private Node head;
    private Node tail;

    private int size;

    public RecursionLL() {
        this.size = 0;
    }

    public void display(){
        RecursionLL.Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertRecursion(int val, int index){
        head = insertRecursion(val, index, head);
    }

    private Node insertRecursion(int val, int index, Node node){
        if (index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRecursion(val, index-1, node.next);
        return node;
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
