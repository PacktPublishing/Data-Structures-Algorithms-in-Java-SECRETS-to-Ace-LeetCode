package Queues;

public class CircularQueue {
    protected int[] data;
    private static  int DEFAULT_SIZE = 10;

    private int size = 0;

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    protected int end = 0;
    protected int front = 0;

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Can't peek from an empty stack :(");
        }
        return data[front];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Circular queue is empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
