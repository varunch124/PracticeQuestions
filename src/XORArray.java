public class XORArray {

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 7, 10, 4, 5, 1, 7};

        binary(10, 3);
    }

    public static int XorArray(int[] array) {

        int unique = 0;

        for (int n : array) {
            unique = unique ^ n;
        }
        return unique;
    }


    public static void binary(int n, int i) {
        System.out.println(Integer.toBinaryString(n));

        System.out.println(n & (1010 ));

    }


}
