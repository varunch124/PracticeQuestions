import org.junit.Test;

public class BSUsingRecursion {

    public static void main(String[] args) {
        int[] array = {1, 4, 8, 10, 20, 21};
        int target = 22;

        System.out.println(BSUsingRecursion(array, target, 0, array.length -1));
    }

    public static int BSUsingRecursion(int[] array, int target, int s, int e) {

        if(s <= e) {
            int m = s + (e - s)/2;
            if(array[m] == target) {
                return m;
            } else if(array[m] < target){
                return BSUsingRecursion(array, target, m + 1, e);
            } else {
                return BSUsingRecursion(array, target, s, m -1);
            }
        } else {
            return -1;
        }

    }


}
