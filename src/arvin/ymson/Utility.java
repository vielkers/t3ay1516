package arvin.ymson;

/**
 * Created by arvin_000 on 7/26/2016.
 */
public class Utility {
    public static long Factorial (Integer args)  {

        int A, m = 1;

        for (A = 1; A <=args; A++){
            m = m * A;
        }
        return m;
    }
    public static String Prime (Integer args) {
        String u = "";
        int p, y;
        int max = args;
        for (int x = 0; x<=max; x++) {
            p = x;
            for (y = 2; y <= (x-1); y++) {
                if (x % y == 0) {
                    p = 0;
                }
            }
            if (p!= 0) {
                u = u + "\n" + p;
            }
        }
        return u;
    }

    public static String Fibonacci(Integer args) {
        int c1 = 0, c2 = 1, c3, h, n = args;
        String c4 = c1 + "\n" +c2;
        for (h = 2; h < n; h++) {
            c3 = c1 + c2;
            c1 = c2;
            c2 = c3;
            c4 = c4 + "\n" + c3;
        }
        return c4;
    }

}
