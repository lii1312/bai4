
package cuphapfor;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;
        do {
            System.out.println("Type your passwork: ");
            phrase = sc.next();
        }while (!phrase.equals("duytan")); 
    }
 
}
