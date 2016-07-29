package betina.mendoza.Exercise1;

import java.util.Scanner;

public class Factorial {
    public static void main(String args []){
        int n;
        int ans = 1;

        Scanner x = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = x.nextInt();

        if(n <= 0){
            System.out.println("Invalid number! Positive numbers only!");
        }
        else{
            while(n != 1){
                ans = ans * n;
                //n--;
                System.out.println(ans);
            }

        }




    }


}