import java.util.HashMap;

public class BinarySearchPractise {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
        int target = 6;

        System.out.println(binarySearch(array, target));
    }

    public static int binarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while(start <= end){
            int index = start + (end - start)/2;
            if(array[index] == target){
                return index;
            } else if( target > array[index]) {
                start = index + 1;
            } else {
                end = end -1;
            }

        }

        String str = "abcdefg";

        for(char ch : str.toCharArray()){

        }

        return -1;






    }
}
