/*
 * Author:  
 * Date: 
 */

import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a number between 1 - 1000: ");
        int Num = sc.nextInt();

        int randomNumber = (int)(Math.random() * 1000) + 1;  // 1–1000

        if (Num != randomNumber) {
            System.out.println("Your number isn't the random number. The number was " + randomNumber + ".");
        } else {
            System.out.println("Your number is the random number. The number was " + randomNumber + ".");
        }

        // the string "I love to learn coding remotely." will appear in
        // the command window when you compile and run this program.
    }
}
