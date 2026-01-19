package Recursion;

public class Polymorphism {

    public final int value = 10;

    public final int valuE=10;

//    void sum(int a, int b) {
//        System.out.println("int sum " + a + b);
//    }

    void sum(double a, int b) {
        System.out.println("double sum " + a + b);
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.sum(1,2 );
        long var = 100;

    }
}
