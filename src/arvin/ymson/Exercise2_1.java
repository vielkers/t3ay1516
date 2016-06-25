package arvin.ymson;

import java.util.Scanner;

/**
 * Created by arvin_000 on 6/17/2016.
 */
public class Exercise2_1 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = x.nextInt();

        int previous = 0;
        System.out.println(previous);
        int current = 1;
        System.out.println(current);
        for(int y = 0; y < n-2; y++){
            int sequence = previous + current;
            System.out.println(sequence);
            previous = current;
            current = sequence;
        }
    }
}
