package ysai.bravo;

/**
 * Created by IE on 6/28/2016.
 */
public class Ex1 {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = m;

        if (m <= 0) {
            System.out.println("Invalid number. Only positive nos. allowed.");
        } else {
            int currentProduct = 1;
            while (m > 1) {
                currentProduct = currentProduct * m;
                m--;
            }
            System.out.println(n + "! = " + currentProduct);
        }

        // Exercise 1.2
        int[] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
        // Print all the odd numbers inside the nums array

    }
}
