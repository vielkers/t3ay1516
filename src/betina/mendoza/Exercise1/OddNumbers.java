package betina.mendoza.Exercise1;

public class OddNumbers {
    public static void main(String [] args){
        int num [] = {3, 5, 1, 25, 29, 22, 82, 86, 95, 72};

        for(int i: num){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

    }

}
