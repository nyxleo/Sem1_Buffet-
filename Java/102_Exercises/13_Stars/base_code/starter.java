/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num = sc.nextInt();
		String Star = "*"; 
		int x = 0;
		while(true){
			if(x == num){
				break;
			}
			System.out.println(Star);
			x = x + 1;
			Star = Star + "*"; 
			}
		
		
	}
}
			
			
		
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and  run this program.
	
	

