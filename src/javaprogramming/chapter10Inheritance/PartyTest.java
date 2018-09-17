package javaprogramming.chapter10Inheritance;

import java.util.Scanner;

public class PartyTest {

	public static void main(String[] args) {
		int guests;
		
		Party aParty = new Party();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of guests for the party >> ");
		guests = keyboard.nextInt();
		aParty.setGuests(guests);
		System.out.println("The party has " + aParty.getGuests() + " guests.");
		
		aParty.displayInvitation();
	}

}
