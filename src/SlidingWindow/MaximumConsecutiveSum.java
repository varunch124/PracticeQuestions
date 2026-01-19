package SlidingWindow;

public class MaximumConsecutiveSum {

    public static void main(String[] args) {
        int[] array = {-1, -2, -4, -4, -5, -7, 0, -1, -2};
        int k = 4;

        System.out.println(maxConsecutiveSum(array, k));
    }

    public static int maxConsecutiveSum(int[] array, int k) {
        int sum = Integer.MIN_VALUE;
        int localSum = 0;

        int i =0;
        int j =0;
        localSum += array[i];

        while(j < array.length -1){
            if(j - i + 1 == k){
                if(localSum > sum){
                    sum = localSum;
                }
                localSum -= array[i];
                i++;
            }

            j++;
            localSum += array[j];
        }
        return sum;
    }


}
