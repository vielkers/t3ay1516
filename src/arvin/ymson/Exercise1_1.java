package arvin.ymson;

import java.util.Scanner;

/**
 * Created by arvin_000 on 6/17/2016.
 */
public class Exercise1_1 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = x.nextInt();
        int factorial = 0;

        for(int ctr = n;ctr > 0;ctr--){
            if(ctr == n){
                factorial = ctr * (ctr - 1);
            }else{
                if(ctr == 1){
                    factorial = factorial * ctr;
                }else{
                    factorial = factorial * (ctr - 1);
                }
            }
        }

        System.out.println(factorial);

    }

}
