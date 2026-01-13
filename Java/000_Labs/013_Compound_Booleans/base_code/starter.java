/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String First = ("Please enter your first number: ");
		String Second = ("Please enter your second number: ");
		String Third = ("Please enter your third number: ");
		
		System.out.print(First);
		int num1 = sc.nextInt();
		
		System.out.print(Second);
		int num2 = sc.nextInt();
		
		System.out.print(Third);
		int num3 = sc.nextInt();
		
		int largest = num1;
		
		if (num2 > largest) {
			largest = num2;
		}
		
		if (num3 > largest) {
			largest = num3;
		}
		
		if (largest == num1) {
    	System.out.println("Your first number is the largest of the three!");
		}
		if (largest == num2) {
		System.out.println("Your second number is the largest of the three!");
		}
		if (largest == num3) {
		System.out.println("Your third number is the largest of the three!");
		}
		System.out.println("The number was " + largest + ".");
		
		int smallest = num1;
		
		if (num2 < smallest) {
			smallest = num2;
		}
		if (num3 < smallest) {
			smallest = num3;
		}
		if (smallest == num1) {
	    System.out.println("Your first number is the smallest of the three!");
		}
		if (smallest == num2) {
	    System.out.println("Your second number is the smallest of the three!");
		}
		if (smallest == num3) {
	    System.out.println("Your third number is the smallest of the three!");
		}
		System.out.println("The number was " + smallest + ".");

		
	}
}
