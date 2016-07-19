package keith.lim;

public class Ex1 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = n;

        if (n <= 0) {
            System.out.println("Invalid number. Only positive nos. allowed.");
        } else {
            int currentProduct = 1;

            while (n > 1) {
                currentProduct = currentProduct * n;
                n--;
            }

            System.out.println(m + "! = " + currentProduct);
        }


        int[] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
    }
}