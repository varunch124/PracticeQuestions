package Recursion;

public class StaticBlock {

    static int a = 4;
    static int b;

    static {
        b = a*5;
    }


    public static void main(String[] args) {
        System.out.println("before Initialization b = " +StaticBlock.b);
        System.out.println("before Initialization a = " +StaticBlock.a);

        StaticBlockTest b = new StaticBlockTest();
    }
}
