package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//
//        queue.peek();

//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(5);
//        deque.add(4);
//        deque.add(3);
//        deque.add(2);
//        deque.add(1);
//        deque.addLast(55);
//

//        CustomQueue queue = new CustomQueue();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//
//        queue.display();
//
//        queue.remove();
//        queue.display();

        CircularQueue queue = new CircularQueue();
        queue.insert(3);
        queue.insert(5);
        queue.insert(7);
        queue.insert(9);
        queue.insert(11);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(13);
        queue.display();
    }
}
