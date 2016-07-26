package anton.santos;

/**
 * Created by Anton on 7/26/2016.
 */
public class Ex1 {
    public static void main(String[] args) {

        // Exercise 1.1
        System.out.println("Exercise 1.1");
        int r = Integer.parseInt(args[0]);
        int p = r;
        int a = 1;
        while(r > 1) { a= a * r; r--;
        }
        // Print the value of currentProduct
        System.out.println(p + "! = " + a);
        // Exercise 1.2
        System.out.println("\nExercise 1.2"+"\nOdd numbers: ");
        int[] numbers = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
        int v;
        // Print all the odd numbers inside the nums array
        for(v = 0; v < 9; v++){
            if (numbers[v]%2 != 0) {
                System.out.print(numbers[v]+", ");
            }
        }

    }






}
