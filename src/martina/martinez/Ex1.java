

package martina.martinez;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int m = n;

        if (n <= 0)

        {
            System.out.println("Invalid!");
        } else {
            int a = 1;
            while (n > 1) {
                a = a * n;
                n--;
            }
            System.out.println(m + "! = " + a);
        }



            }

    }

