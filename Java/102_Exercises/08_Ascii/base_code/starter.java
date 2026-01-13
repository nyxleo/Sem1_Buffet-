/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = sc.nextLine();

		if(word.equals("frog")){
			System.out.println("     @..@");
			System.out.println("    (----)");
			System.out.println("   ( >__< )");
			System.out.println("   ^^ ~~ ^^");
		}
		else if(word.equals("Chromebook")){	
			System.out.println(" ______________");
			System.out.println("||            ||");
			System.out.println("||            ||");
			System.out.println("||            ||");
			System.out.println("||            ||");
			System.out.println("||____________||");
			System.out.println("|______________|");
			System.out.println(" \\############\\");
			System.out.println("  \\############\\");
			System.out.println("   \\      ____    \\");
			System.out.println("    \\_____\\___\\____\\");
		}	
		else if(word.equals("Face")){
			System.out.println("   _______  ");
			System.out.println("  /       \\ ");
			System.out.println(" |  O   O  |");
			System.out.println(" |    ^    |");
			System.out.println(" |  \\___/  |");
			System.out.println("  \\_______/ ");
		}
		else{
			System.out.println("Invalid input.");
		}
	}
}
