package Arrays;

import java.util.HashMap;

public class LongestSubarraySum {

    public static void main(String[] args) {
        int[] array = {5, 2, 2, 7, 1, 1, 1, 1, -9};
        int target = 4;

        System.out.println(longestSubArraySum(array, target));
    }

    public static int longestSubArraySum(int[] array, int target) {

        int result = -1;
        HashMap<Integer, Integer> hmap = new HashMap<>();


        int prefixSum = 0;
        int prefixSumMinusTarget = -target;

        for (int i = 0; i < array.length; i++){
            prefixSum += array[i];
            prefixSumMinusTarget += array[i];
            if(!hmap.containsKey(prefixSum)){
                hmap.put(prefixSum, i);
            }

            if(hmap.containsKey(prefixSumMinusTarget)){
                int currentResult = i - hmap.get(prefixSumMinusTarget);
                if(currentResult > result){
                    result = currentResult;
                }
            }

        }


        return result;
    }


}
