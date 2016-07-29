package betina.mendoza.Exercise2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        int n;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number: ");

        n = x.nextInt();

        int [] b = new int[n];
        b[0] = 0;
        b[1] = 1;

        int y = 0;
        for(int i = 2; i < n; i++){
            b[i] = b[i-1] + b[i-2];
            y = i;
        }
        System.out.println(b[y]);
    }
}
