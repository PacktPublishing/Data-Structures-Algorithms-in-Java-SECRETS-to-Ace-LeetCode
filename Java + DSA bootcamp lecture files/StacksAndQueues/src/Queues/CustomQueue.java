package Queues;

public class CustomQueue {
    protected int[] data;
    private static  int DEFAULT_SIZE = 10;

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    int end = 0;

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        // shifting elements to the left
        for (int i=1; i < end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public void display(){
        for (int i=0; i<end; i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}
