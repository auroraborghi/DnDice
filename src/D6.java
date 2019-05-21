/**
 * @author auroraborghi
 */

import java.util.Random;

public class D6 extends Dice{

	public D6() {
		name = "d6"; 
		maxRoll = 6; 
	}
	
	protected void roll() {
		Random rand = new Random(); 
		
		int randomRoll = rand.nextInt(maxRoll) + 1; 
		
		System.out.println("You rolled a: " + randomRoll);
	}

}
