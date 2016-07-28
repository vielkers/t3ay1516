package reyna.deluna;

/**
 * Created by IE on 7/26/2016.
 */
public class Ex1 {
    public static void main(String[] args) {

        // Exercise 1.1
        System.out.println("EXERCISE 1.1");
        int n = Integer.parseInt(args[0]);
        int m;
        int a = 1;

        if (n < 0)
            System.out.println("Number should be non-negative!");
        else {
            for (m = 1; m <= n; m++)
                a = a * m;

            System.out.println(n + "! = " + a);


            // Exercise 1.2
            System.out.println("\nEXERCISE 1.2");

            int[] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
            int b;

            for (b = 0; b < 9; b++) {
                System.out.println(nums[b]);
            }

        }
    }
}
