public class getPrimes {

    public static void main(String[] args) {
        int n = 40;
        getPrimes(n);
    }

    public static void getPrimes(int num) {

        int[] arr = new int[num + 1];
        arr[2] = 0;

        for(int i = 2; i * i <= num; i++) {
            if(arr[i] == 0) {
                int j = 2 * i;
                while(j < num +1){
                    arr[j] = 1;
                    j += i;
                }
            }
        }
        for(int i =2; i < arr.length; i++) {
            if(arr[i] == 0) {
                System.out.print( i + " ");
            }
        }

    }


}
