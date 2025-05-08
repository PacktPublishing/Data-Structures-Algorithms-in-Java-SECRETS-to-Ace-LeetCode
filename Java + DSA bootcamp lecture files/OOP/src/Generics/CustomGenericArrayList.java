package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int index = 0;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[index++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }


    private boolean isFull() {
        return index == data.length;
    }

    public T remove() {
        T removed = (T)(data[--index]);
        return removed;
    }

    public T get(int i) {
        return (T)(data[i]);
    }

    public int size() {
        return index;
    }

    public void set(int i, int value) {
        data[i] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", index=" + index +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
        list2.add("hello");
        list2.add("world");
        System.out.println(list2);
    }
}

