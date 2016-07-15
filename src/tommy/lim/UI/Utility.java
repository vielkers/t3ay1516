package tommy.lim.UI;

/**
 * Created by IE on 7/14/2016.
 */
public class Utility {
    public static long Factorial(Integer args) {
        int N, f = 1;

        for (N = 1; N <= args; N++) {
            f = f * N;
        }
        return f;
    }

    public static String Prime(Integer args) {
        String s = "";
        int primenumber, z;
        int max = args;
        for (int w = 0; w <= max; w++) {
            primenumber = w;
            for (z = 2; z <= (w - 1); z++) {
                if (w % z == 0) {
                    primenumber = 0;
                }
            }
            if (primenumber != 0) {
                s = s + "\n" + primenumber;
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