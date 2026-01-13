/*
 *	Author: Leonardo Mirzakhanian
 *  Date: Sep 12 2025
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		  System.out.println("An interger between 0 - 9: " + ((int)(Math.random() * 9)));
		  System.out.println("An interger between 1 - 10: " + ((int)(Math.random() * 10 + 1)));
		  System.out.println("A double between 2.5 - 3.5: " + ((double)(Math.random() * (3.5 - 2.5) + 2.5)));
		  System.out.println("A double between 14 - 589: " + ((double)(Math.random() * (589 - 14) + 14)));
		
	}
}
