package Recursion;

public class StaticBlockTest {

    static int c = 10;
    static int d;

    static {
        System.out.println("Inside static block Test");
        d = c * 10;
    }
}
