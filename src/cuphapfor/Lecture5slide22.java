
package cuphapfor;

import java.util.Scanner;

public class Lecture5slide22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number (-1 ro quit: )");
        int number = sc.nextInt();
        while(number != -1){
            sum = sum +number;
            System.out.println("Enter a number (-1 ro quit: )");
            number = sc.nextInt();
        }
        System.out.println("The total is "+ sum);
    }
}
