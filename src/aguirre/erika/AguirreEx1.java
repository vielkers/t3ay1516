package aguirre.erika;

/**
 * Created by IE on 5/31/2016.
 */
public class AguirreEx1 {
    public static void main(String[] args) {

        // Exercise 1.1
        int han = Integer.parseInt(args[0]);
        int ale = han;

        // Check the validity of input
        if (han <= 0) {
            System.out.println("Number is invalid. Only positive numbers are allowed.");
        } else {

            int currentProduct = 1;

            while (han > 1) {

                currentProduct = currentProduct * han;

                han--;
            }

            // Print the value of currentProduct
            System.out.println(ale + "! = " + currentProduct);
        }

        // Exercise 1.2
        int[] jan = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
        // Print all the odd numbers inside the jan array

    }
}
