package betina.mendoza.Exercise2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String args []){
        int num;
        int maxNum = 1000;
        int d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = in.nextInt();

        for(d = 3; d <= (int) Math.sqrt(num); d++){
            if(num % d == 0){
                System.out.println("False");
            }
            else{
                System.out.println(d);
            }
        }

    }
}
