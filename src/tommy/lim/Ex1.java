package tommy.lim;

/**
 * Created by IE on 7/26/2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b;
        int c = 1;

        for(b = 1; b <= c; b++)
            c = c *b;
        System.out.println(a + "=" + c);


      int[] d = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
        int e;

        for (e = 0; e < 9; e++)
        {
            System.out.println(d[e]);
        }

    }
}
