package angelica.olan;

public class Ex1{
    public static void main(String args[]) {

        // Exercise 1.1
        int n = 1, factorial = 5;
        for (int i = 1; i <= factorial; i++) {
            n = n * i;
        }
        System.out.println("Factorial of " + factorial + " is " + n);

        // Exercise 1.2
        int[] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
        int x = 0;
        for (x = 0; x < 9; x++) {
            if (nums[x] % 2 != 0) {
                System.out.println(nums[x]);
            }
        }
    }
}