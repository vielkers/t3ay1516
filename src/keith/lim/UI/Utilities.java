package keith.lim.UI;

public class Utilities {

    //Gets the n-th fibonacci number.
    //DONE
    public static int fibonacci(int n){
        //if n = 3
        int x1 = 0;
        int x2 = 1;
        int x3;
        int fib = 0;

        int i;

        if (n==0)
        {
            System.out.println("x1=" + x1);
            fib = 0;
        }
        if (n==1)
        {
            System.out.println("x1=" + x1);
            fib = 0;
        }
        if (n==2)
        {
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
            fib =1;
        }
        if(n>2) {
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
            for (i = 0; i < n - 2; ++i) {
                x3 = x2 + x1;
                fib = x3;
                System.out.println("x" + (i + 3) + "=" + x3);
                x1 = x2;
                x2 = x3;
            }
        }
        System.out.println();
        return fib;

    }

    //Looks for the factorial of input n
    //DONE.
    public static int factorial(int x){
        int holder = 0;
        if (x == 0) {
            holder = 0;
        }

        if (x>1){
            holder = x;
            for (int n=x-1; n>0; n--){
                holder = holder*n;
            }
        }

        if (x == 1){
            holder = 1;
        }
        return holder;
    }

    //Displays all prime numbers until the inputted number.
    //DONE
    public static String prime(int n){

        String primeList = "";
        int prime = 0;

        //Looks through all numbers until the given.
        for (int i = 1; i <= n; i++) {
            prime = i;

            //Inspects divisibility of all numbers leading to one currently being inspected.
            for (int j = 2; j < i; j++) {

                //Sets prime to 0 if the inspected number is divisible by any of its precedents.
                if (i % j == 0) {
                    prime = 0;
                }

            }

            //If prime is not set to 0 it passes the primality test and is inserted in the primeList string.
            if (prime != 0) {
                primeList = primeList + "" + prime + "\n";
            }
        }
        return primeList;
    }

}