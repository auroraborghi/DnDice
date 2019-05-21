/**
 * 
 * @author auroraborghi
 *
 */

import java.util.*;

public class MainUserInterface {
	
	private ArrayList<Dice> possibleDice = new ArrayList<Dice>();
	
	private String userInput = ""; 
	
	private void populate() {
		possibleDice.add(new D4()); 
		possibleDice.add(new D6());
		possibleDice.add(new D8()); 
		possibleDice.add(new D20()); 
	}
	
	private boolean isValid(String input) {
		for (Dice d : possibleDice) {
			if (d.name.equals(input.toLowerCase())) {
				return true; 
			}
		}
		if (input.toLowerCase().equals("quit")) {
			return true; 
		}
		return false; 
	}

	public static void main(String[] args) {
		MainUserInterface main = new MainUserInterface(); 

		System.out.println("Welcome to this state-of-the-art DnD Roller!");
		System.out.println("Type in 'QUIT' to stop at any time");
		
		// Only populate once
		main.populate(); 
		
		// Continue the game until the user decides to stop
		while (!main.userInput.toLowerCase().equals("quit")) {
			System.out.print("\n" + "Choose the die you want to roll (D4, D6, D8, D20): ");

			Scanner in = new Scanner(System.in); 

			main.userInput = in.nextLine(); 

			boolean result = main.isValid(main.userInput); 

			// If the string is not correct request a new string
			while (!result) {
				System.out.print("Incorrect; Input a correct possibility: ");
				in = new Scanner(System.in); 
				main.userInput = in.nextLine(); 
				result = main.isValid(main.userInput); 
			}

			// Use a switch statement in order to account for the user's input
			switch(main.userInput.toLowerCase()) {
			case "d4":
				D4 d4 = new D4(); 
				d4.roll(); 
				break; 
			case "d6":
				D6 d6 = new D6(); 
				d6.roll(); 
				break; 
			case "d8":
				D8 d8 = new D8(); 
				d8.roll(); 
				break; 
			case "d20":
				D20 d20 = new D20(); 
				d20.roll(); 
				break; 
			default:
				break; 
			}
		}
		
		System.out.println("Thanks for playing! Hope you have a wonderful rest of your day!");
		
	}

}
