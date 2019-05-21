/**
 * D8.java
 * 
 * @author Aurora Borghi
 * 
 * Subclass of Dice that emulates 
 * the behaviors of a D8 die. 
 * 
 */

import java.util.Random;

public class D8 extends Dice{

	public D8() {
		name = "d8"; 
		maxRoll = 8; 
	}
	
	protected void roll() {
		Random rand = new Random(); 
		
		int randomRoll = rand.nextInt(maxRoll) + 1; 
		
		System.out.println("You rolled a " + randomRoll + " from a " + name);
	}

}
