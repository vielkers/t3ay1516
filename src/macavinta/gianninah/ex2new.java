package macavinta.gianninah;

import java.util.Scanner;

/**
 * Created by IE on 7/26/2016.
 */
public class ex2new { public static void main(String args[]){
    int n;
    Scanner x = new Scanner(System.in);
    System.out.println("Enter number: ");

    n = x.nextInt();

    int [] b = new int[n];
    b[0] = 0;
    b[1] = 1;

    int a = 0;
    for(int i = 2; i < n; i++){
        b[i] = b[i-1] + b[i-2];
        a = i;
    }
    System.out.println(b[a]);
}
}
