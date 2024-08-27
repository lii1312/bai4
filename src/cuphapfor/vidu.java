package cuphapfor;

import java.util.Random;

public class vidu {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(3);
        if(r==0){
            System.out.println("rock");
        }else if(r==1){
            System.out.println("paper");
        }else {
            System.out.println("scissors");
        }
    }
}
