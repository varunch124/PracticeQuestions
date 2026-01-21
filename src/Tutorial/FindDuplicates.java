package Tutorial;

import java.util.HashMap;

public class FinfDuplicates {

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 7, 10, 4, 5, 1, 7};

        int target = 9;


        int[] answer = findSum(array, target);

        System.out.println(answer[0] + " " + answer[1]);
    }

    public static int[] findSum(int[] array, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        int[] result = new int[2];

        for(int i =0; i < array.length; i++) {
            int remainder = target - array[i];
            if(hs.containsKey(remainder)) {
                result[0] = hs.get(remainder);
                result[1] = i;
                return result;
            } else {
                hs.put(array[i], i);
            }
            }

        return result;
        }


    }
