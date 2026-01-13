/*
 *  Author: Leonardo Mirzakhanian
 *  Date: 9/9/25
 *  Collaborator(s):
 */
import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int name = sc.nextInt();

        System.out.println("Here are the next 5 numbers!");
        System.out.println(name + ", " + (name + 1) + ", " + (name + 2) + ", " + (name + 3) + ", " + (name + 4) + ", " + (name + 5));

        System.out.println("Here are the next 5 multiples of " + name + "!");
        System.out.println((name * 1) + ", " + (name * 2) + ", " + (name * 3) + ", " + (name * 4) + ", " + (name * 5) + ", " + (name * 6));

        System.out.println("Here is " + name + " divided by 100!");
        double Divide1 = (double) name / 100;
        System.out.println(Divide1);

        System.out.println("Here is " + name + " divided by 10!");
        double Divide2 = (double) name / 10;
        System.out.println(Divide2);

        sc.close();
    }
}