package Arrays;

import java.util.HashMap;

public class TotalSubarraysSum {

    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        int target = 2;

        System.out.println(TotalSubArraysSum(array, target));
    }

    public static int TotalSubArraysSum(int[] array, int target) {

        int result = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();


        int prefixSum = 0;
        int prefixSumMinusTarget = -target;
        hmap.put(0, 1);

        for (int i = 0; i < array.length; i++){
            prefixSum += array[i];
            prefixSumMinusTarget += array[i];
            if(!hmap.containsKey(prefixSum)){
                hmap.put(prefixSum, i);
            } else {
                int value = hmap.get(prefixSum);
                value++;
                hmap.put(prefixSum, value);
            }

            if(hmap.containsKey(prefixSumMinusTarget)){
                result += hmap.get(prefixSumMinusTarget);
            }



        }


        return result;
    }


}
