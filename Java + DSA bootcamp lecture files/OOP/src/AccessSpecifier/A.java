package AccessSpecifier;

public class A {
   protected int num;
    String name;
    int[] arr;

//    public A(int num, String name) {
//        this.num = num;
//        this.name = name;
//    }

   protected void num(){
        System.out.println("Num");
    }

    public int getNum() {
        return num;
    }
}
