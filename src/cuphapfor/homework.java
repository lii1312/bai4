package cuphapfor;

import java.util.Random;
import java.util.Scanner;

public class homework {

    // Định nghĩa phương thức play
    public static int play(Scanner sc, Random rand) {
        // Ví dụ đơn giản: hỏi người dùng đoán một số ngẫu nhiên
        int number = rand.nextInt(10) + 1; // Tạo số ngẫu nhiên từ 1 đến 10
        System.out.print("Guess a number between 1 and 10: ");
        int guess = sc.nextInt();
        
        if (guess == number) {
            System.out.println("Correct!");
            return 1; // Trả về 1 nếu đúng
        } else {
            System.out.println("Wrong, the correct number was: " + number);
            return 0; // Trả về 0 nếu sai
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        // Chơi cho đến khi người dùng sai 3 lần
        int points = 0;
        int wrong = 0;
        while (wrong < 3) {
            int result = play(sc, rand);
            if(result > 0){
                points++;
            } else {
                wrong++;
            }
        }
        System.out.println("You earned " + points + " total points.");
    }
}
