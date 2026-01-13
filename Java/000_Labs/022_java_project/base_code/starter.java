/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		String Yes = sc.next();
		int balance = 100;
		while(true){
			if(Yes.equals("Yes") || Yes.equals("yes") || Yes.equals("Y") || Yes.equals("y")){
			System.out.print("You have $" + balance + ". How much would you like to wager? ");
			}
			else if(Yes.equals("No") || Yes.equals("no") || Yes.equals("N") || Yes.equals("n")){
				System.out.println("Sad to see you go! You still have $" + balance + " left. Come again soon! Thanks!");
				break;
			}
			else{
				System.out.println("That wasn't quite the correct answer. Try again.");
				System.out.println("--------------------------------------------------");
				System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
				Yes = sc.next();
				continue; 
			}
			int wage = sc.nextInt();
			while(true){
			if(wage > balance){
				System.out.print("You only have " + balance + "! Please enter a smaller number: ");
				wage = sc.nextInt();
				continue; 
			}
			else if(wage <= 0){
				System.out.println("Sneaky! No negatives or 0!");
				System.out.print("Please enter a larger number : ");
				wage = sc.nextInt();
				continue;
			}
			
			int math = (int)(Math.random() * 10 + 1);
			int math2 = (int)(Math.random() * 10 + 1);
			int math3 = (int)(Math.random() * 10 + 1);
			
			System.out.println("");
			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are: ");
			System.out.println("_______________________");
			System.out.println(" | " + math + " | " + math2 + " | " + math3 + " |");
			System.out.println("_______________________");
			balance = balance - wage;
			if (math != math2 && math != math3 && math2 != math3) {
				System.out.println("Didn't win this time, better luck next time!");
			}
			else if(math == math2 && math2 == math3) {
				balance = wage * 3 + balance; 
				System.out.println("You won! You're wager has now been trippled!");
			}
			else if(math == math2 || math == math3 || math2 == math3){
				balance = wage * 2 + balance;
				System.out.println("You won! You're wager has now been doubled!");
			}
			System.out.println("You now have $" + balance + ".");
			System.out.println("--------------------------------------------------");
			System.out.println("");

			if (balance <= 0) {
            	System.out.println("You've run out of money! Thanks for coming! Come back soon!");
                return;
            }
            if(true){
            	System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
            	Yes = sc.next();
				break;
            }
            
		}
		}
	}
		
	}
