package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int index = 0;

    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
       data[index++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for(int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }


    private boolean isFull() {
        return index == data.length;
    }

    public int remove(){
        int removed = data[--index];
        return removed;
    }

    public int get(int i){
        return data[i];
    }

    public int size(){
        return index;
    }

    public void set(int i, int value){
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
        // <Integer> is called generics and generics can never be primitive i.e <int> is not allowed
//        ArrayList<Integer> list = new ArrayList();
//        list.add(55);
//        list.set(1,60);
//        list.remove(1);
//        list.get(0);

        CustomArraylist list = new CustomArraylist();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println(list);
        list.get(3);
        System.out.println(list);
        list.size();
        System.out.println(list);
        list.set(5,40);
        System.out.println(list);
        list.remove();
        System.out.println(list);
    }
}
