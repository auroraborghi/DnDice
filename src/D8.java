
import java.util.Random;

public class D8 extends Dice{

	public D8() {
		name = "d8"; 
		maxRoll = 8; 
	}
	
	protected void roll() {
		Random rand = new Random(); 
		
		int randomRoll = rand.nextInt(maxRoll) + 1; 
		
		System.out.println("You rolled a: " + randomRoll);
	}

}
