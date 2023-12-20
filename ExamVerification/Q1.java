package ExamVerification;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question 1 : 12 Marks
//		Develop a program for a gaming store that manages in-game item purchases. The
//		program should prompt the user for the prepayment amount and the prices of two
//		different items. Subsequently, calculate the maximum quantity of each item that can be
//		bought with the prepaid amount, displaying the remaining funds in the account. Here's
//		an example:
//		Example :
//		How much money do you wish to prepay?
//		100
//		Enter the price of the first item: 20
//		Enter the price of the second item: 30
//		With this amount, you will be able to purchase 5 units of the first item and 0 units from second
//		item. You will then have $0 left as a credit on your account.
//		Alternatively, for this amount, you will be able to purchase 3 units of second item and 0 unit
//		from first item ,You will then have 10$ left as a credit on your account.
//		Thank you for shopping at Game World Store!
		
		
		
		
		
		//in game item purchase
		//prompt the user for the prepayment amount
		//two different items
		
		//INFORMATIONS
		//prepay
		System.out.println("How much money do you wish to prepay?");
		Scanner kb = new Scanner(System.in);
		int prepay = kb.nextInt();
		//first item
		System.out.print("Enter the price of the first item: ");
		int first = kb.nextInt();
		//second item
		System.out.print("Enter the price of the first item: ");
		int second = kb.nextInt();
		
		
		kb.close();
		
		
		
		
		//CALCULATION
//		With this amount, you will be able to purchase 5 units of the first item and 0 units from second
//		item. You will then have $0 left as a credit on your account.
//		Alternatively, for this amount, you will be able to purchase 3 units of second item and 0 unit
//		from first item ,You will then have 10$ left as a credit on your account.
//		Thank you for shopping at Game World Store!
		
		//first (purchase)
		int purchase1 = prepay/first;
		 int credit1 = prepay%first;
		int purchase2 = credit1/second;
		//second (alternative)
		int alternative2 = prepay/second;
		 int credit2 = prepay%second;
		int alternative1 = credit2/first;
		
		
		
		//RESULT
		System.out.println("With this amount, you will be able to purchase " + purchase1 + " units of the first item and " + purchase2 + " units from second\r\n"
				+ "item. You will then have $" + credit1 + " left as a credit on your account.\r\n"
				+ "Alternatively, for this amount, you will be able to purchase " + alternative2 + " units of second item and " + alternative1 + " unit\r\n"
				+ "from first item ,You will then have " + credit2 + "$ left as a credit on your account.\r\n"
				+ "Thank you for shopping at Game World Store!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
