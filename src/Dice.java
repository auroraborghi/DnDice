/**
 * Dice.java
 * 
 * @author Aurora Borghi
 * 
 * Abstract class of Dice that 
 * emulates the behavior of die. 
 * 
 */

public abstract class Dice {
	protected String name; 
	protected int maxRoll; 
	protected abstract void roll(); 
}
