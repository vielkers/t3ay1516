package joshua.juanson;

public class Exercise1 {
    public static void main(String args[]) {

        // Exercise 1.1
        int n = 1, factorial = 5;
        for (int i = 1; i <= factorial; i++) {
            n = n * i;
        }
        System.out.println("Factorial of " + factorial + " is " + n);
        // Apply factorial to n
        // if n = 5, 5! = 120

        // Exercise 1.2
        int[] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
        // Print all the odd numbers inside the nums array
        int b = 0;
        // Print all the odd numbers inside the nums array
        for (b = 0; b < 9; b++) {
            if (nums[b] % 2 != 0) {
                System.out.println(nums[b]);
            }
        }
    }
}
