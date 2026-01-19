import java.util.Arrays;

public class ReferencePrep {

    public static void main(String[] args) {




        int[] a = {1,2,3,4};

        int[] b = a;

        int a1 = 10;

        int b1 = a1;

        b1 = 20;

        System.out.println(a1);
        System.out.println(b1);


        String a4 = "abcd";
        String b4 = a4;

        b4 = "efgh";
        System.out.println(a4);
        System.out.println(b4);





        b[0] = 8;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }


}
