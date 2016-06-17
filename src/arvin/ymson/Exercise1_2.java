package arvin.ymson;

/**
 * Created by arvin_000 on 6/17/2016.
 */
public class Exercise1_2 {

    public static void main(String[] args){
        int[] numbers = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};

        for(int x = 0;x < numbers.length;x++){
            if(numbers[x] % 2 != 0){
                System.out.println(numbers[x]);
            }
        }
    }
}
