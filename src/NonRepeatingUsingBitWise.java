public class NonRepeatingUsingBitWise {

    // Given every value occurs 3 times and only one number appears 1 time, find the num appearing only once
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 3, 3, 3, 4, 2, 2};

        System.out.println(nonRepeating(array));
    }

    public static int nonRepeating(int[] array) {
        int returnValue = 0;

        for(int i =0; i <32 ; i++ ) {
            int mask = 1 << i;
            int sum = 0;
            for (int num : array) {
                if((num & mask) != 0) {
                    sum++;
                }
            }
            if(sum % 3 != 0) {
                returnValue |= mask;
            }
        }

        return returnValue;
    }

}
