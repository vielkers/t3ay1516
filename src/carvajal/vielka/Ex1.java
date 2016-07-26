package carvajal.vielka;

/**
 * Created by IE on 7/26/2016.
 */
public class Ex1 {
    public static void main(String[]args) {
        System.out.println("Exer. 1.1 Solution");
        int b=Integer.parseInt(args[0]);
        int m=b;

        if (b <= 0) {
            System.out.println("This is an invalid number.");
        } else {
            int v = 1;

            while (b > 1) {
                v = v * b;
                b--;
            }
            System.out.println(m+"! = " + v);
        }


        System.out.println ("");


        System.out.println("Exer. 1.2 Solution");
        int [] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
        int a;
        for (a=0; a<9; a++){
            if (nums[a]%2!= 0){
                System.out.println(nums[a]);
            }
        }
    }
}




