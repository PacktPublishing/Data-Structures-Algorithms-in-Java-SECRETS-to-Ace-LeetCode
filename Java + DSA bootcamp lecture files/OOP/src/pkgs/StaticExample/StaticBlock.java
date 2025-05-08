package pkgs.StaticExample;

public class StaticBlock {
    static int a = 10;
    static int b;

    static{
        System.out.println("This is a static block");
        b = a*2;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 5;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        StaticBlock.b += 10;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
