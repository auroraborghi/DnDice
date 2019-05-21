/**
 * D20.java
 * 
 * @author Aurora Borghi
 * 
 * Subclass of Dice that emulates 
 * the behaviors of a D20 die. 
 * 
 */

import java.util.Random;

public class D20 extends Dice{

	public D20() {
		name = "d20"; 
		maxRoll = 20; 
	}
	
	protected void roll() {
		Random rand = new Random(); 
		
		int randomRoll = rand.nextInt(maxRoll) + 1; 
		
		System.out.println("You rolled a " + randomRoll + " from a " + name);
	}

}
