/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number between 1 and 1000: ");
		int num = sc.nextInt();
		int ram = (int)(Math.random() * 1000 + 1);
		while(true){
			if(num<ram){
				System.out.println("Your number was too low, guess again. ");
				System.out.print("Please enter a number between 1 and 1000: ");
				num = sc.nextInt();
			}
			else if(num>ram){
				System.out.println("Your number was too high, guess again.");
				System.out.print("Please enter a number between 1 and 1000: ");
				num = sc.nextInt();
			}
			else if (num == ram){
				System.out.println("You got the number!!! Congrats!");
				break; 
			}
		
		}
		// Your code goes below here



		
	}
}
