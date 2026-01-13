/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String Name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String Tittle = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String Answer = sc.nextLine();
		if(Answer.equals("Wizard") || Answer.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(Answer.equals("Warrior") || Answer.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(Answer.equals("Rogue") || Answer.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println("");
		int Total = 20;
		System.out.print("Strength (1-10): ");
		int Strength = sc.nextInt();
		if(Strength > 10){
			System.out.print("Please input a smaller value. Strength (1-10): ");
			Strength = sc.nextInt();
			System.out.print("You have " + (Total - Strength) + " left to spend.");
		}
		else{
			System.out.print("You have " + (Total - Strength) + " left to spend.");
		}
		Total = Total - Strength;
		System.out.println("");
		System.out.println("");
		System.out.print("Dexterity (1-10): ");
		int Dexx = sc.nextInt();
		if(Dexx > 10){
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			Dexx = sc.nextInt();
		}
		else if(Dexx > Total){
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			Dexx = sc.nextInt();
			System.out.print("You have " + (Total - Dexx) + " left to spend");
		}
		else{
			System.out.print("You have " + (Total - Dexx) + " left to spend");
		}
		Total = Total - Dexx;
		System.out.println("");
		System.out.println("");
		System.out.print("Intelligence (1-10): ");
		int Intell = sc.nextInt();
		if(Intell > 10){
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
			Intell = sc.nextInt();
		}
		else if(Intell > Total){
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
			Intell = sc.nextInt();
			System.out.print("You have " + (Total - Intell) + " left to spend");
		}
		else{
			System.out.print("You have " + (Total - Intell) + " left to spend");
		}
		Total = Total - Intell;
		System.out.println("");
		System.out.println("");
		System.out.print("Charisma (1-10): ");
		int Char = sc.nextInt();
		if(Char > 10){
			System.out.print("Please input a smaller value. Charisma (1-10):  ");
			Char = sc.nextInt();
			System.out.print("You have " + (Total - Char) + " left to spend");
		} 
		else if (Char > Total){
			System.out.print("Please input a smaller value. Charisma (1-10):  ");
			Char = sc.nextInt();
		}
		else{
			System.out.print("You have " + (Total - Char) + " to spend for next time.");
		}
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + Name + " the " + Tittle + " of CVHS.");
		System.out.println("You're a " + Answer + " with the following stats!" );
		System.out.println("Strength - " + Strength);
		System.out.println("Dexterity - " + Dexx);
		System.out.println("Intelligence - " + Intell);
		System.out.println("Charisma - " + Char);
		System.out.println("");
		System.out.println("Good luck on your quest " + Name + ".");
	}
}
