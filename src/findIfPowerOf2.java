public class findIfPowerOf2 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(powerOf2(n));
    }

    public static boolean powerOf2(int num) {

        int sumOfBits = 0;
        int n = num;

        while(n > 0){
            sumOfBits += n & 1;
            n = n >> 1;
        }

        if(sumOfBits == 1) {
            return true;
        }

        return false;
    }


    public static void binary(int n, int i) {
        System.out.println(Integer.toBinaryString(n));

        System.out.println(n & (1010 ));

    }


}
