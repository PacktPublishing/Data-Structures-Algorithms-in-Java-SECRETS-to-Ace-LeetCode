public class DoublyLinkedList {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node tail = head;

        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = node;
        node.prev = tail;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return  node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val){
        Node p = find(after);

        if (p == null){
            System.out.println("The value doesn't exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if (node.next != null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node node = head;
        Node tail = null;
        while (node != null){
            System.out.print(node.val + " -> ");
            tail = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse order");
        while (tail != null){
            System.out.print(tail.val + " -> ");
            tail = tail.prev;
        }
        System.out.println("START");
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
