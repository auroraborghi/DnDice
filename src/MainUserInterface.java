/**
 * 
 * @author auroraborghi
 *
 */

import java.util.*;

public class MainUserInterface {
	
	private ArrayList<Dice> possibleDice = new ArrayList<Dice>();
	
	private String userInput = ""; 
	
	// Possible OCP Violation with this method; would need to simply add new dice options
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
			
			// Print out all possible Dice in a specific format
			System.out.print("\n" + "Choose the die you want to roll (");
			String delimiter = ""; 
			for (Dice die : main.possibleDice) {
				System.out.print(delimiter + die.name);
				delimiter = ", "; 
			}
			System.out.print("): ");

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
			
			// Roll the correct dice from the user
			for (Dice die : main.possibleDice) {
				if (die.name.contentEquals(main.userInput.toLowerCase())) {
					die.roll(); 
				}
			}
		}
		
		System.out.println("\n" + "Thanks for playing! Hope you have a wonderful rest of your day!");
		
	}

}
