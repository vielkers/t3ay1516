package reyna.deluna;

/**
 * Created by IE on 7/22/2016.
 */
public class Ex1 {
    public static void main(String[] args) {

        // Exercise 1.1
        System.out.println("EXERCISE 1.1");
        int n = Integer.parseInt(args[0]);
        int m = n;
        int a = 1;

        if (n > 1) {
            a = a * n;
            n--;
        }

        // Print the value of currentProduct
        System.out.println(m + "! = " + a);

        // Exercise 1.2
        System.out.println("\n\nEXERCISE 1.2");

        int[] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
        int b;
        // Print all the odd numbers inside the nums array

        for(b = 0; b < 9; b++){
            System.out.println(nums[b]);
        }

    }
}
