package Stacks;

public class CustomStack {
    protected int[] data;
    private static  int DEFAULT_SIZE = 10;

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    int ptr = -1;

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full! Cannot add more items :(");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop any more items since stack is Empty :(");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
        // return data[ptr--]
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Can't peek from an empty stack :(");
        }
        return data[ptr];
    }
}
