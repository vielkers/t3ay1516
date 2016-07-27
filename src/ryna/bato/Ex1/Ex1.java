package ryna.bato.Ex1;

/**
 * Created by rynabato on 5/28/2016.
 */
public class Ex1 {
    public static void main(String[] args) {

        System.out.println("Exercise 1.1: Factorial of value in argument");
        int n = Integer.parseInt(args[0]);
        int total = 1;
        while (n>=1){
            total = total * n;
            n--;
        }
        System.out.println("Argument value: " + args[0]);
        System.out.println("The factorial of " + args[0] + "! is " + total);

        int [] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);
        System.out.println(nums[6]);
        System.out.println(nums[7]);
        System.out.println(nums[8]);
        System.out.println(nums[9]);
        System.out.println("Hello");
    }
}

