package jason.lau.Ex7;

/**
 * Created by IE on 7/14/2016.
 */
public class Source {
    public static long Factorial(Integer args) {
        int N, f = 1;

        for (N = 1; N <= args; N++) {
            f = f * N;
        }
        return f;
    }

    public static String Prime(Integer args) {
        int primenu, x;
        int max = args;
        String s = "";
        for (int y = 0; y <= max; y++) {
            primenu = y;
            for (x = 2; x <= (y - 1); x++) {
                if (y % x == 0) {
                    primenu = 0;
                }
            }
            if (primenu != 0) {
                s = s + "\n" + primenu;
            }
        }
        return s;
    }

    public static String Fibonacci(Integer args) {
        int a1 = 0, a2 = 1, a3, i, n = args;
        String a4 = a1 + "\n" + a2;
        for (i = 2; i < n; i++) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            a4 = a4 + "\n" + a3;
        }

        return a4;

    }
}