/**
 * D4.java
 * 
 * @author Aurora Borghi
 * 
 * Subclass of Dice that emulates 
 * the behaviors of a D4 die. 
 * 
 */

import java.util.Random;

public class D4 extends Dice{

	public D4() {
		name = "d4"; 
		maxRoll = 4; 
	}
	
	protected void roll() {
		Random rand = new Random(); 
		
		int randomRoll = rand.nextInt(maxRoll) + 1; 
		
		System.out.println("You rolled a " + randomRoll + " from a " + name);
	}

}
