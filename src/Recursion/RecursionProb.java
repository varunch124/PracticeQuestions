package Recursion;

public class RecursionProb {

    public static void main(String[] args) {
        //recursion(5);

        //System.out.println(factorial(5));

        //System.out.println(sum(5));

        //System.out.println(sumOfDigits(1342));

        //System.out.println(prodOfDigits(2222));

        //stringCheck();


        System.out.println(reverseNumberRecursion(1234));


    }

    public static void recursion(int n) {
        if(n < 1) {return;}
        recursion(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if(n == 1) {
            return n;
        }

        return n * (factorial(n-1));
    }

    public static int sum(int n) {
        if(n == 1) {
            return n;
        }

        return n + (sum(n-1));
    }

    public static int sumOfDigits(int n) {
        if(n == 0) {
            return 0;
        }
        return (n % 10) + (sumOfDigits(n / 10));
    }

    public static int prodOfDigits(int n) {
        if(n % 10 == n) {
            return n;
        }
        return (n % 10) * (prodOfDigits(n / 10));
    }

    public static int reverse(int n) {
        if(n % 10 == n) {
            return n;
        }
        return (n % 10) * (reverse(n / 10));
    }


    public static void stringCheck(){
        String str1 = "varun";

        String str2 = new String("varun");

        System.out.println("==" + (str1 == str2));

        System.out.println("==" + str1.equals( str2));

    }

    public static int reverseNumberRecursion(int n){
        if(n == 0){
            return n;
        }
        int sum = 0;



        return (n % 10)  + reverseNumberRecursion(n /10) * 10;

    }

    public static int reverseNumber(int n){
        if(n == 0){
            return n;
        }
        int sum = 0;



        return (n % 10)  + reverseNumberRecursion(n /10) * 10;

    }
}
