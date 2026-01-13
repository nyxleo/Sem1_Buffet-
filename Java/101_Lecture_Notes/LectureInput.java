/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("🧊 Welcome to Leonardo's Ice Mart!🧊");
        System.out.println("Here's our menu:");
        System.out.println("1.🧊 Purfied Ice Plate - $19.99");
        System.out.println("2.🧊 Carved Ice Bag - $49.99");
        System.out.println("3.🧊 Raw Ice Box - $89.99");
        System.out.println("________________________________________");
        System.out.println("How do we harvest the ice?");
        System.out.println("We harvest ice using the leave");
        System.out.println("method which was created over");
        System.out.println("56,000 years ago.The process");
        System.out.println("takes around 3 months for each menu item");
        System.out.println("________________________________________");
        
        
        System.out.println("Who's order is this?");
        String name = sc.nextLine();
        System.out.println("How many Purfied Ice Plates would you like?");
        int item1 = sc.nextInt();
        System.out.println("How many Carved Ice Bags would you like?");
        int item2 = sc.nextInt();
        System.out.println("How many Raw Ice Boxs would you like?");
        int item3 = sc.nextInt();
        
        double price1 = item1 * 19.99;
        double price2 = item2 * 49.99;
        double price3 = item3 * 89.99;
        
        System.out.println("How much do you want to tip");
        double tip = sc.nextDouble();
        double total = price1 + price2 + price3 + tip;
        
        System.out.println(name + "s Receipt");
        System.out.println(item1 + " x Purfied Ice Plate = $" + price1);
        System.out.println(item2 + " x Carved Ice Bag = $" + price2);
        System.out.println(item3 + " x Raw Ice Box = $" + price3);
        System.out.println("The Grand Total is - " + total);
	}
}
