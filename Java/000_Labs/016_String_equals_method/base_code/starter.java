/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String Answer = sc.nextLine();
		if(Answer.equals("Wizard") || Answer.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(Answer.equals("Warrior") || Answer.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(Answer.equals("Rouge") || Answer.equals("rouge")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		 
	}
}
