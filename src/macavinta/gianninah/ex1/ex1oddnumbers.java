package macavinta.gianninah.ex1;

/**
 * Created by IE on 7/26/2016.
 */
public class ex1oddnumbers {  public static void main(String [] args){
    int num [] = {3, 5, 1, 25, 29, 22, 82, 86, 95, 72};

    for(int i: num){
        if(i % 2 != 0){
            System.out.println(i);
        }
    }

}
}
