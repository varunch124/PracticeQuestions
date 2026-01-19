import java.math.BigDecimal;

public class SqrtootWithDecimals {

    public static void main(String[] args) {
        int n = 40;
        int p = 2;

        System.out.printf("%.3f", sqrt(n, p));
    }

    public static double sqrt(int n, int p) {

        int s = 0;
        int e = n;
        int m = 0;

        double root = 0.0;

        while(s <= e){
            m = s + (e - s)/2;
            double square = m * m;
            if( square == n ) {
                return m;
            } else if (square > n) {
                e = m -1;
            } else {
                s = m + 1;
            }
        }
        root = m - 1;
        double incr = 0.1;
        for(int i =0; i < p; i++) {
            while(root * root <= n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;

        }
        return root;
    }


}
