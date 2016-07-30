package joshua.juanson.FinalVersionsExercises.Exercise9;
public class Operations {
    public static long Factorial(Integer args) {
        int i = 1, fact;
        for (int z = 1; z <= args; z++) {
            i = i * z;
        }
        return i;
    }

    public static String Prime(Integer args) {
        String p = "";
        int primenumber, r;
        int maxNumber = args;
        for (int o = 0; o <= args; o++) {
            primenumber = o;
            for (r = 2; r <= (o - 1); o++) ;
            {
                if (o % r == 0) {
                    primenumber = 0;
                }
            }
            if (primenumber != 0) {
                p = p + "\n" + primenumber;
            }
        }
        return p;
    }

    public static String Fibo(Integer args) {
        int a1 = 0, a2 = 1, a3, i, max = args;
        String a4 = a1 +"\n" + a2;
        for (i = 2; i < max; i++)
        {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            a4 = a4 + "\n" + a3;
        }
        return a4;
    }
}
