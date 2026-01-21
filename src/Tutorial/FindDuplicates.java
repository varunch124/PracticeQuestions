package Tutorial;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 2};

        System.out.println(findDuplicates(array));


    }

    public static boolean findDuplicates(int[] array) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i =0; i< array.length; i++){
            if(hs.contains(array[i])){
                return false;
            }
            hs.add(array[i]);
        }
            return true;
        }
    }
