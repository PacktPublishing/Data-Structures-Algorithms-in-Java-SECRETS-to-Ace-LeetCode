package Introduction;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10; // primitive variable created
        int b = 20;
        Integer num1 = 10; // primitive object created
        Integer num2 = 20;

        swap(num1,num2);
        System.out.println(num1 + " " + num2);

        GarbageCollection obj;

        for (int i = 1; i < 100000000; i++){
            obj = new GarbageCollection("Sample text");
        }
    }

    private static void swap(Integer num1, Integer num2) {
        Integer temp = num1;
        num1 = num2;
        num2 = temp;

    }
}

class GarbageCollection{
    String name;
    GarbageCollection(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Your object was deleted");
    }
}
