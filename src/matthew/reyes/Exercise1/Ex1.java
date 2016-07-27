package src.matthew.reyes.Exercise1;

/**
 * Created by victorreyes on 26/07/2016.
 */
public class Ex1 {
    public static void main(String args[]) {

        // Exercise 1.1
        int n = 1;
        int factorial = 6;
        for (int i = 1; i <= factorial; i++) {
            n = n * i;
        }
        System.out.println("Factorial of " + factorial + " is " + n);


        // Exercise 1.2
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b;

        for (b = 0; b < 9; b++) {

            if (nums[b] % 2 != 0) {
                System.out.println(nums[b]);
            }
        }
    }
}
