package Recursion;

import java.util.ArrayList;

public class RecursionArrayProblms {

    public static void main(String[] args) {
//        int[] arr = {1, 4, 6, 7, 9, 10, 4, 4};
//        int target = 4;
//        findInArray(arr, 4, 0);
//        System.out.println(findInArray(arr, 4, 0));


        int number = 1234;
        reverseNumber(number);
        System.out.println(sum);

        System.out.println(sum2);


    }


    public static ArrayList<Integer> findInArray(int[] arr, int target, int index) {
        if(index == arr.length){
            return new ArrayList<>();
        }

        ArrayList<Integer> ar = new ArrayList<>();


        ar.addAll(findInArray( arr, target, index + 1));

        if(arr[index] == target) {
            ar.add(index);
        }

        return ar;
    }

    static int sum =0;
    static int base =1;

    static int sum2 = 0;


    public static void reverseNumber(int n) {
        if(n == 0){
            return;
        }

        sum2 = (sum2) * 10 + (n % 10);


        reverseNumber(n / 10);

        sum += base * (n%10);
        base *= 10;




    }


}
