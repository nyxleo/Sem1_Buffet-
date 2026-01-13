/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.print("Please enter an integer: ");
		int count = sc.nextInt();
		int x = 0;
		while(true){
			if(x == count){
				break; 
			}
			System.out.println(x + ". " + name);
			x = x + 1;
		}
		// Your code goes below here



		
	}
}
